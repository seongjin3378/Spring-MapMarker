package jsj.MapMarker.basic;

import jsj.MapMarker.crops.CropsData;
import jsj.MapMarker.crops.CropsSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class workloadController {
    private final CropsSystem cropsSystem;

    @Autowired
    public workloadController(CropsSystem cropsSystem) {
        this.cropsSystem = cropsSystem;
    }

    @PostMapping("/workload/loadData")
    public String load(@ModelAttribute workloadForm workloadForm, Map<String, Object> model)
    {
        List<CropsData> dataOfDate = cropsSystem.SelectDateAndFindData(workloadForm.getDate());
        List<String> date = cropsSystem.findAllByDate();
        model.put("dataOfDate", dataOfDate);
        model.put("date", date);
        return "/workload";
    }
}
