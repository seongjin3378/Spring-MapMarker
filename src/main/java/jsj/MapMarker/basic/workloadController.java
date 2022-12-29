package jsj.MapMarker.basic;

import jsj.MapMarker.crops.SpringRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class workloadController {
    private final SpringRepository springRepository;

    public workloadController(SpringRepository springRepository) {
        this.springRepository = springRepository;
    }

    @GetMapping("/workload")
    public String load()
    {

    }
}
