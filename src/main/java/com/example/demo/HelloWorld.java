package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    
 /*   @GetMapping("")
    public String sayHello(){
        String msg = "Hello World";
        msg += " this is a test...";
        return msg;
    } */

 /*   @GetMapping("")
    public String sayHelloname(@RequestParam(name = "name" ,required = false,defaultValue = "unnamed") String name){
        String msg = "Hello Mr. ";
        msg += name;
        return msg;
    } */
    @GetMapping("")
    public String sayHelloname(@RequestParam(name = "name" ,required = false,defaultValue = "unnamed") String name){
        String msg = "Hello Mr. ";
        msg += name;
        return msg;
    }

}

 