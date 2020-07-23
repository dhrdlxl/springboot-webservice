package com.dhrdlxl.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //JSON을 반환하는 컨트롤러
public class HelloController {
    // /hello로 Get 요청이 오면 hello 문자열 반환
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
