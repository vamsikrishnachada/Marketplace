package com.imcs.projects.Marketplace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class MyFirstSpringController {
    @Autowired
     private FirstSpringComponent component;
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView sayHello(){
        Map<String,String> params = new HashMap<>();
        params.put("env",component.getEnviroment());
        System.out.println(component.getEnviroment());
    return new ModelAndView("hello.html",params);
}
}
