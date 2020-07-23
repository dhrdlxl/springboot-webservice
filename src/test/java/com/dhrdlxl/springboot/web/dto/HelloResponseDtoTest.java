package com.dhrdlxl.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        //@RequiredArgsConstructor 로 final을 포함하는 생성자 메소드 생성 test
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        //@Getter 로 get 메소드 생성 test
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
