package com.conology.helloworld.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloWorld {

    @RequestMapping("/")
    public String index(){
        return "Živjo Brigita";
    }
}
