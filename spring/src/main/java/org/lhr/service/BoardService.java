package org.lhr.service;

import java.util.List;
import org.lhr.DTO.BoardDTO;

public interface BoardService {
	//추상메서드이기때문에 {}가없음 그냥 ;로 끝내면됨 class에서 구현할것이기 때문에
	
	//글쓰기(insert)
	public void boardInsert(BoardDTO bdto) ;
	
	//제목을 클릭-> 상세페이지(select) - 한건 
	//select된결과를 어떤 필통에 담을지 return type으로
	//추상메소드기 때문에 return이 없음 
	//번호를 입력해서 해당하는 게시물만 셀렉트 해올것이기 떄문에 매개변수가 필요함 select 절에 where 조건절이 들어가니까
	public BoardDTO boardDetail(BoardDTO bdto) ;
	
	//게시판 전체 리스트 페이지(select) - 여러건
	public List<BoardDTO> boardList();
	
	//수정(update)
	//성공했는지 실패햇는지 알러트창이 뜨게하고싶거나하면 return값이 필요함 -> void 값이 아니고 return값을 줘야함 
	//그게 아니면 그냥 void주면됨 
	public void boardUpdate(BoardDTO bdto);
	
	//삭제(delete)
	public void boardDelete(BoardDTO bdto);
	
	

}
