package org.lhr.controller;

import org.lhr.DTO.BoardDTO;
import org.lhr.service.Board2Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.cj.log.Log;

@Controller
@RequestMapping("/board")
public class Board2Controller {
	private static final Logger logger = LoggerFactory.getLogger(Board2Controller.class);

	@Autowired
	Board2Service bservice;
	
	
	@RequestMapping(value="/write",method=RequestMethod.GET)
	public void boardWrite2() {
	
	}
	
	@RequestMapping(value="/write",method=RequestMethod.POST)
	public String boardWrite22(BoardDTO bdto) {
		// 작성하기 버튼을 클릭.
		bservice.write2(bdto);
		return "/board/list";
	}

	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public void GetList(Model model) {
		// 작성하기 버튼을 클릭.
		model.addAttribute("list", bservice.list2());

	}
	
	@GetMapping("/detail")
	public void GetDetail2(Model model, @RequestParam("bno") int bno){
	model.addAttribute("detail",bservice.detail2(bno));

		//detail에 저장했으니까 view에도 detail에 꺼를 가져가야함 detail.title
	}


	

	/*
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String boardUpdate(BoardDTO bdto) {
		bservice.update2(bdto);
		return"redirect:/board/list";
	}
	
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String boardDelete(BoardDTO bdto) {
		// 삭제하기 버튼을 클릭.
			bservice.delete2(bdto);	
		return"redirect:/board/list";
	}*/
	
	
	@GetMapping("/update") //update 페이지로 가기위한 용도
		public void getUpdate(@RequestParam("bno") int bno,Model model) {
		model.addAttribute("modify", bservice.detail2(bno));
			
	}

	
	@PostMapping("/update") // 업데이트 기능으로 가기 위한 용도
	public String postUpdate(BoardDTO bdto) {
		bservice.update2(bdto);
		return "redirect:/board/list";
	//값을 가져오기 위해서 redirect 뒤에 bdto.getBno()방식 가져올것
	//update된 후에 update페이지에 보여줘야하기때문에 값을 가지고 위에 controller로 감	
	
	}
	
	@PostMapping("/delete")
	public String postDelete(BoardDTO bdto){
	//	logger.info("삭제되었는가?");
	bservice.delete2(bdto);
	return "redirect:/board/list";
	}

}
