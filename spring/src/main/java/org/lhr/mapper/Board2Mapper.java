package org.lhr.mapper;

import java.util.ArrayList;

import org.lhr.DTO.BoardDTO;
import org.springframework.web.bind.annotation.RequestParam;

public interface Board2Mapper {

	//글쓰기를 하기 위한 dao(insert)
	public void write2(BoardDTO bdto);
	//게시판 리스트
	public ArrayList<BoardDTO> list2();
	//게시판 상세페이지
	public BoardDTO detail2(@RequestParam("bno") int bno);
	//수정
	public void update2(BoardDTO bdto);
	//삭제
	public void delete2(BoardDTO bdto);
}
