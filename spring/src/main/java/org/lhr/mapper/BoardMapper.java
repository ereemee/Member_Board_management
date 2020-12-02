package org.lhr.mapper;

import java.util.List;

import org.lhr.DTO.BoardDTO;

public interface BoardMapper {
	//인터페이스기때문에 return이 없어도 스프링이 알아서return을 처리해줌 
	
	//게시판 전체 목록 리스트 select 
	public List<BoardDTO> getList();
	
	//게시판 글쓰기 insert
	public void boardInsert(BoardDTO bdto);
	
	//게시판 글쓰기 수정 update
	public void boardUpdate(BoardDTO bdto2);
	
	//게시판 글쓰기 삭제 delete 
	public void boardDelete(BoardDTO bdtoD);
	
	//매개변수를 넣냐 안넣냐를 판단하는건 xml파일을 보면됨 #이 있으면 데이터를 받아야한다는 의미기 때문에 매개변수가 필요함
	
}
