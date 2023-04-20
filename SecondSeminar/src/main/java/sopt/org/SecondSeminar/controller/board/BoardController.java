package sopt.org.SecondSeminar.controller.board;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.SecondSeminar.controller.board.dto.PostBoardRequestDto;
import sopt.org.SecondSeminar.service.board.BoardService;

import static sopt.org.SecondSeminar.SecondSeminarApplication.boardList;
import static sopt.org.SecondSeminar.SecondSeminarApplication.userList;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/post")
    public String postBoard(@RequestBody final PostBoardRequestDto requestDto){
        Long boardId = boardService.postBoard(requestDto);
        System.out.println(boardList.get(boardId.intValue() - 1).toString());

        return boardId + "게시글이 등록되었습니다!";
    }

    @GetMapping("/post/{boardId}")
    public String getBoardId(@PathVariable final long boardId){
        System.out.println("게시글 유저 아이디: " + boardId);

        return "게시글 조회 성공";
    }

    @GetMapping("/post/search")
    public String getBoardId(@RequestParam final String page){
        System.out.println("page = " + page);

        return "게시글 페이지 성공";
    }
}
