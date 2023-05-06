package sopt.org.SecondSeminar.service.board;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.controller.board.dto.PostBoardRequestDto;
import sopt.org.SecondSeminar.domain.Board;

import static sopt.org.SecondSeminar.SecondSeminarApplication.boardList;

@Service
public class BoardService {

    public Long postBoard(PostBoardRequestDto requestDto){
        Board newBoard = new Board(
                requestDto.getAuthor(),
                requestDto.getTitle(),
                requestDto.getContent()
        );

        boardList.add(newBoard);
        newBoard.setId((long) boardList.size());

        return newBoard.getId();


    }


}
