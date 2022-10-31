package com.practice.board.service;

import com.practice.board.entity.Board;
import com.practice.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;
    public void write(Board board){

        boardRepository.save(board);
    }
    public List<Board> boardList(){
        return boardRepository.findAll();
    }
}
