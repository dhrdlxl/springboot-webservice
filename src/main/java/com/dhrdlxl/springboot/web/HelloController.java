package com.dhrdlxl.springboot.web;

import com.dhrdlxl.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //JSON을 반환하는 컨트롤러
public class HelloController {
    // /hello로 Get 요청이 오면 hello 문자열 반환
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount)
    {
        //@RequestParam : 외부에서 API로 넘긴 파라미터(ex. name, amount)를 가져오는 어노테이션
        return new HelloResponseDto(name, amount);
    }
}
