package com.dhrdlxl.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)//JUnit 내장 실행자 외 SpringRunner를 실행(스프링 부트 테스트와 JUnit 사이 연결)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    @Autowired//Spring이 관리하는 Bean을 주입 받음
    private MockMvc mvc;//HTTP GET, POST 등 API 테스트를 가능하게 해줌

    @Test
    public void hello가_리턴된다() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}
