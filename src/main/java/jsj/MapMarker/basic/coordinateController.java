package jsj.MapMarker.basic;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class coordinateController {

    private final Logger log =  LoggerFactory.getLogger(getClass());

    @GetMapping ("/coordinate")
    public String View_coordinate(){
        String name = "Spring";

        System.out.println("name = " + name);
        log.info(" info log={}", name);

        return "coordinate";
    }
    @GetMapping ("/workload")
    public String View_workload(){
        String name = "Spring";

        System.out.println("name = " + name);
        log.info(" info log={}", name);

        return "workload";
    }
}
