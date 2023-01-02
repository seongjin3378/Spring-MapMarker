package jsj.MapMarker.basic;

import jsj.MapMarker.crops.CropsData;
import jsj.MapMarker.crops.SpringRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

}
