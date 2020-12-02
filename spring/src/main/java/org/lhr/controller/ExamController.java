package org.lhr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/Exam")
public class ExamController {
	private static final Logger logger = LoggerFactory.getLogger(ExamController.class);

	@RequestMapping(value="/exam01",method=RequestMethod.GET)
	public String ex01(RedirectAttributes rttr) {
		
		rttr.addFlashAttribute("name", "김그린");
		rttr.addFlashAttribute("age", 58);
		rttr.addFlashAttribute("gender", "여자");
		return "redirect:/Exam/exam02";
	}
	
	@RequestMapping(value="/exam02",method=RequestMethod.GET)
	public String exam02() {
	
		
		return "Exam/ex03";
		
	}
	
	//return값이 없으면 ex03에 .jsp를 붙여서 이동함 
	
	
	@RequestMapping(value="/exam03",method=RequestMethod.GET)
	public String exam00(@RequestParam("name") String name,
						 @RequestParam("age") int age,
						 @RequestParam("gender") String gender) {	

			
		
		return "Exam/ex02";
	}
	
	
}
