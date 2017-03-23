package com.wkb.insurance.controller;

import com.wkb.insurance.common.BaseController;
import com.wkb.insurance.system.SpringContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.wkb.insurance.service.TestService;

import javax.servlet.http.HttpSession;

/**
 * Created by hujie on 2017/3/16.
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {

//    @Autowired
//    private TestService testService;

    @RequestMapping(value="/index",method= RequestMethod.GET)
    public ModelAndView index(HttpSession session){
        System.out.println("=============test=====");
        TestService service = SpringContextHolder.getBean("testService",TestService.class);
        System.out.println(service.getStr());
        String name = service.getStr();

        System.out.println("=========Service:"+name+"===========");
        return new ModelAndView("test");
    }
}
