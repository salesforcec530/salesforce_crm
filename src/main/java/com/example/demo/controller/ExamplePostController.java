package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.LoginForm;
import com.example.demo.entity.ResponseTransfer;

@Controller
@RequestMapping("/api-gateway/")
public class ExamplePostController {
	
    @PostMapping("response")
    @ResponseBody
    public ResponseTransfer postResponseController() {
        return new ResponseTransfer("phinph","Call API Success!!!");
     }

}
