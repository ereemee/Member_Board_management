package org.lhr.service;

import java.util.ArrayList;

import org.lhr.DTO.BoardDTO;
import org.springframework.web.bind.annotation.RequestParam;

public interface Board2Service {
	
	//추상메서드들
	//게시판 글쓰기 
	public void write2(BoardDTO bdto);
	//게시판 리스트
	public ArrayList<BoardDTO> list2();
	//게시판 상세페이지
	public BoardDTO detail2(@RequestParam("bno") int bno);
	//게시판 글수정
	public void update2(BoardDTO bdto);
	//게시판 글삭제
	public void delete2(BoardDTO bdto);
	
	
}
