package wrx.rb.demo.aop;

import org.springframework.stereotype.Service;

@Service
public class AopService {



    public String hello() {
        return "aop hello";
    }

}
