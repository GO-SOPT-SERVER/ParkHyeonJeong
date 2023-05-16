package sopt.org.ThirdSeminar.controller.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE) // 왜여기서는 private로 사용하는거임?
public class UserRequestDto {
    @Email(message = "이메일 형식에 맞지 않습니다") //이메일 어노테이션 사용하면 null값도 허용해줌
    @NotNull
    private final String email;

    @NotBlank // 제약조건 (공백도 안된다. 스페이스 하나만 치는 것도 안됨)
    @Pattern(regexp = "^[가-힣a-zA-Z]{2,10}$", message = "닉네임 형식에 맞지 않습니다.")
    private final String nickname;

    @NotBlank
    @Pattern( // 원하는 패턴으로 지정하기
            regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}",
            message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다."
    )
    private final String password;

}
