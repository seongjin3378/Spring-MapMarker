package jsj.MapMarker.basic;

import jsj.MapMarker.crops.CropsData;
import jsj.MapMarker.crops.SpringRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;

@Controller
public class coordinateController {

    private final SpringRepository springRepository;

    public coordinateController(SpringRepository springRepository) {
        this.springRepository = springRepository;
    }

    @PostMapping("/coordinate")
    public String save(@ModelAttribute coordinateForm coordinateForm) {
        CropsData cropsData = new CropsData();
        cropsData.setDate("2022-12-27");
        cropsData.setName(coordinateForm.getCropsName());

        cropsData.setLatitude(coordinateForm.getLatitude());
        cropsData.setLongitude(coordinateForm.getLongitude());

        springRepository.save(cropsData);
        return "redirect:/";
    }

    String parsing_save_data(String data)
    {
        String json = data;
        json =json.replace("\"item\":", "");
        json =  json.replace(",{\"\"}", "");
        json = json.replace(" ", "");
        json = json.replace(":", "\" : \"");
        json = json.replace(",", "\", \"");
        json = json.replace("\"{", "{");
        json = json.replace("}\"", "}");
        StringBuffer stringBuffer = new StringBuffer(json);
        stringBuffer.insert(0, "{ \"item\": ");
        stringBuffer.append("}");
        json = stringBuffer.toString();

        return json;
    }
    @ResponseBody
    @PostMapping("/coordinate/save")
    public String save(@RequestParam String data)
    {
        String json = parsing_save_data(data);
        JSONObject jsnobject = new JSONObject(json);

        JSONArray jsonArray = jsnobject.getJSONArray("item");
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject explrObject = jsonArray.getJSONObject(i);
            CropsData cropsData = new CropsData();
            cropsData.setName(explrObject.getString("cropsName"));
            cropsData.setDate(date.format(formatter));
            cropsData.setLatitude(explrObject.getString("latitude"));
            cropsData.setLongitude(explrObject.getString("longitude"));
            springRepository.save(cropsData);
        }
        return "hello" + data;
    }

}
