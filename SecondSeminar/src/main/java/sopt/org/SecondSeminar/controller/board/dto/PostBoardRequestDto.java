package sopt.org.SecondSeminar.controller.board.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostBoardRequestDto {
    private String title;
    private String author;
    private String content;
}
