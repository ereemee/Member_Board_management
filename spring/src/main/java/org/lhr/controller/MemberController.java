package org.lhr.controller;

import java.util.ArrayList;


import org.lhr.DTO.MemberDTO;
import org.lhr.DTO.TodoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@RequestMapping("/member")

public class MemberController {

private static final Logger Logger = LoggerFactory.getLogger(MemberController.class);
	//Logger는 문제가 있으면 console에 남겨달라 / sysout과 같은 역할

	@RequestMapping(value="/write",method=RequestMethod.GET)
	public void memberWrite() {
		
	}
	//write.jsp에서 사용자가 입력한 데이터를 수집하기위한 controller (건 by 건)
	@RequestMapping(value="/write",method=RequestMethod.POST)
	
	//public void PostWrite(@RequestParam("name") String name,
	//				     @RequestParam("age") int age) {
	
	public void Postwrite(MemberDTO mdto) {
		
	}
	
	
	@RequestMapping(value="/ex02List",method = RequestMethod.GET)
	public String ex02List(@RequestParam("ids")ArrayList<String> ids) {
		Logger.info("ids"+ids);
		return "ArrayList"; 
	}/*
	@InitBinder //이걸로 형변환을 해서 날짜를 가져올 수 있게끔 해줌
	public void intiBinder(WebDataBinder binder){
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd"); //MM은 무조건 대문자여야함
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,false));
	}*/
	
	
	@RequestMapping(value="/ex03",method=RequestMethod.GET)
	public String ex03(TodoDTO todo) {
		Logger.info("todo : "+todo);
		return "ex03";
		
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public void memberUpdate() {
		Logger.info("update");
		
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public void memberDelete() {
		Logger.info("delete");
		
	}
	
	@RequestMapping(value="/read",method=RequestMethod.GET)
	public void memberRead() {
			Logger.info("read");
		
	}

	
	
	
	
}
