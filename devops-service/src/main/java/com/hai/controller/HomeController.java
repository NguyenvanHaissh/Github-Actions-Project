package com.hai.controller;

import com.hai.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class HomeController {
    @GetMapping
    public ApiResponse getMess(){
        return new ApiResponse("chuc ban thanh cong");
    }
}
