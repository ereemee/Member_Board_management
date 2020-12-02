package org.lhr.service;

import java.util.ArrayList;

import org.lhr.DTO.BoardDTO;
import org.lhr.controller.Board2Controller;
import org.lhr.mapper.Board2Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class Board2ServiceImpl implements Board2Service{
	private static final Logger logger = LoggerFactory.getLogger(Board2Controller.class);
	@Autowired
	Board2Mapper b2mp;
	public void write2(BoardDTO bdto) {
	b2mp.write2(bdto);
	}

	public ArrayList<BoardDTO> list2() {
		return b2mp.list2();
		
	}

	public BoardDTO detail2(@RequestParam("bno") int bno) {
		return b2mp.detail2(bno);
	}

	public void update2(BoardDTO bdto) {
		 b2mp.update2(bdto);
	}

	public void delete2(BoardDTO bdto) {
		b2mp.delete2(bdto);
	}

}
