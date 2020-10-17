package wrx.rb.demo.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AopController {

    @Autowired
    AopService aopService;

    @GetMapping("/hello")
    public String hello () {
        return aopService.hello();
    }

}
