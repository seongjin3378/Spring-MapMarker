package jsj.MapMarker.basic;

import jsj.MapMarker.crops.CropsSystem;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ViewConnectController {

    private final Logger log =  LoggerFactory.getLogger(getClass());
    private final CropsSystem cropsSystem;

    @Autowired
    public ViewConnectController(CropsSystem cropsSystem) {
        this.cropsSystem = cropsSystem;
    }

    @GetMapping ("/coordinate")
    public String View_coordinate(){

        return "coordinate";
    }

    @GetMapping ("/workload")
    public String View_workLoad_and_loadDate(Map<String, Object> model){
        List<String> date = cropsSystem.findAllByDate();
        model.put("date", date);

        return "workload";
    }
}
