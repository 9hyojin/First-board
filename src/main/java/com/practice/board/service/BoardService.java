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

    //글 작성 처리
    public void write(Board board){

        boardRepository.save(board);
    }

    //게시글 리스트처리
    public List<Board> boardList(){
        return boardRepository.findAll();
    }

    //상세페이지 불러오기
    public Board boardview(Integer id){
        return boardRepository.findById(id).get();
    }

    //특정 게시물 삭제
    public void boardDelete(Integer id){
        boardRepository.deleteById(id);
    }

}
