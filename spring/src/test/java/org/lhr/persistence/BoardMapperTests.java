package org.lhr.persistence;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.lhr.DTO.BoardDTO;
import org.lhr.mapper.BoardMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {
	private static final Logger logger = LoggerFactory.getLogger(BoardMapperTests.class);
	@Autowired
	private BoardMapper boardMapper;
	
/*	@Test 
	//String getTime2()에 대한 test
	public void testGetList() {
		//logger.info("TimeMapper 클래스 "+timeMapper.getClass().getName();
		logger.info("BoardMapper 클래스의 getList 메소드 호출 ="+boardMapper.getList());
	}
	*/
	
	@Test
	public void testboardInsert() {
	BoardDTO bdto=new BoardDTO();
	bdto.setTitle("새로 작성하는 제목");
	bdto.setContent("새로 작성하는 내용 ");
	bdto.setWriter("정자바");
	boardMapper.boardInsert(bdto);
	}
	
	
	@Test
	public void testboardUpdate() {
		
		BoardDTO bdto2=new BoardDTO();
		bdto2.setWriter("익명아님");
		bdto2.setBno(4);
	
		boardMapper.boardUpdate(bdto2);
	
	}
	
	
	@Test
	public void testboardDelete() {
	BoardDTO bdtoD=new BoardDTO();
	bdtoD.setBno(2);
		
		boardMapper.boardDelete(bdtoD);
	}
	
	
	
	
	
}
