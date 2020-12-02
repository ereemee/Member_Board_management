package org.lhr.service;

import java.util.List;

import org.lhr.DTO.BoardDTO;
import org.lhr.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BoardServiceImplement implements BoardService{
	//메소드를 만들라고 BoardServiceImplement에 빨간및줄이 그어짐 
	//여기서 dao를 연결시켜주는 역할
	
	@Autowired 
	//패키지가 다른데에서 클래스를 불러올때 선언해줌 
	private BoardMapper boardMapper;
	
	//글쓰기 (insert)구현부
	public void boardInsert(BoardDTO bdto) {
		//insert 할 수 있도록 BoardMapper(DAO)랑 연결
		boardMapper.boardInsert(bdto);
	}

	
	//제목을 클릭 -> 상세페이지 (select) - 1건 구현부
	public BoardDTO boardDetail(BoardDTO bdto) {
	return null ;
	}

	//게시판 전체 리스트 페이지 (select) - 여러건 구현부
	public List<BoardDTO> boardList() {
		
	return boardMapper.getList();
	//결과를 이쪽으로 보내야하니까 리턴 자체가 저렇게됨 
	}

	//수정(update) 구현부
	public void boardUpdate(BoardDTO bdto2) {
		boardMapper.boardUpdate(bdto2);
		
		
	}

	//삭제(delete) 구현부
	public void boardDelete(BoardDTO bdtoD) {
		boardMapper.boardDelete(bdtoD);	
	}

	//servlet-context에 service를 추가해줘야함
	
	
	
}
