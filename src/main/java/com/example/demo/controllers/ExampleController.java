package com.example.demo.controllers;

import com.example.demo.utils.MyResponseContent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/example")
    public MyResponseContent example() {
        MyResponseContent responseContent = new MyResponseContent();
        return responseContent;
    }
}
