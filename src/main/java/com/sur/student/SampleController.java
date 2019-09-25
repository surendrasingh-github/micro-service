package com.sur.student;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World Surendra Singh!";
    }
    
    @RequestMapping("/home")
    @ResponseBody
    String homeAddress() {
        return "Avenue Henry Dunant, Evere, Brussels!";
    }
	
	//Main method
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}