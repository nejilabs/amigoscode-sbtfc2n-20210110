package com.codewitharjun.codewitharjunsbuv20210808;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Codewitharjunsbuv20210808Controller {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

}