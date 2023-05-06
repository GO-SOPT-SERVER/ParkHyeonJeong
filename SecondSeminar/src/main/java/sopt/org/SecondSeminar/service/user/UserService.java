package sopt.org.SecondSeminar.service.user;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.controller.user.dto.request.RegisterRequestDto;
import sopt.org.SecondSeminar.domain.User;

import static sopt.org.SecondSeminar.SecondSeminarApplication.userList;

@Service
public class UserService{

    public Long register(RegisterRequestDto requestDto){
        User newUser =  new User(
                requestDto.getGender(),
                requestDto.getName(),
                requestDto.getContact(),
                requestDto.getAge()
        );

        // 데이터베이스에 저장하기
        userList.add(newUser);
        newUser.setId((long) userList.size());

        // 저장한 유저 아이디 값 반환
        return newUser.getId();
    }

}
