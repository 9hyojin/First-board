package com.practice.board.controller;

import com.practice.board.entity.Board;
import com.practice.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")
    public String boardWriteForm(){

        return"boardwrite";
    }

    @PostMapping("/board/writeProcess")
    public String boardWriteProcess(Board board){
        boardService.write(board);
        return"";
    }

    @GetMapping("/board/list")
    public String boardList(Model model){
        model.addAttribute("List",boardService.boardList());
        return "boardlist";
    }

}
