package wrx.rb.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wrx.rb.demo.RedisUtils;
import wrx.rb.demo.bean.PagingBean;
import wrx.rb.demo.service.UserService;

import java.util.List;

@RestController
public class MBController {

    @Autowired
    UserService userService;

    @Autowired
    RedisUtils redisUtils;

    @RequestMapping("/paging")
    public List<PagingBean> getPaging() {
        return userService.selectPaging();
    }

    @RequestMapping("/hello")
    public String helloWorld () {
        return redisUtils.get("wrx") + " hello world";
    }


}
