package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.LoginForm;
import com.example.demo.entity.ResponseTransfer;

@Controller
@RequestMapping("/api-gateway/")
public class ExamplePostController {
	
    @PostMapping("post")
    @ResponseBody
    public ResponseTransfer postResponseController() {
        return new ResponseTransfer("phinph","Call API Success Post Mapping!!!");
     }
    
    @GetMapping("get")
    @ResponseBody
    public ResponseTransfer getResponseController() {
        return new ResponseTransfer("phinph","Call API Success Get Mapping!!!");
     }

}
