package sopt.org.SecondSeminar.controller.user.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
//@AllArgsConstructor(access = AccessLevel.PRIVATE) // 생성자 계층 private로 처리
@NoArgsConstructor
public class RegisterRequestDto {
    private String gender;

    private String name;

    private String contact;

    private int age;
}
