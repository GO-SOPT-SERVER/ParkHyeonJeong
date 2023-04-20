package sopt.org.SecondSeminar.controller.board.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostBoardResponseDto {
    private Long id;
    private String title;
    private String author;
}
