package org.lhr.controller;

import org.lhr.DTO.MemberDTO;
import org.lhr.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/member2")
public class Member2Controller {
	@Autowired
	MemberService mservice;
	
	
	@GetMapping("/list")
	public void Mlist(Model model) {
		model.addAttribute("mlist", mservice.memberlist());
		
	}
	
	@GetMapping("/detail")
	public void Mdetail(Model model,MemberDTO mdto) {
		model.addAttribute("mdetail",mservice.memberdetail(mdto));
		
	}
	
	@GetMapping("/add")
	public void Madd(MemberDTO mdto) {
	}
	
	@PostMapping("/add")
	public String Madd2(MemberDTO mdto) {
		mservice.memberinsert(mdto);
		return "redirect:/member2/list";
	}
	
	@GetMapping("/update")
	public void Mupdate(MemberDTO mdto) {
		
	}
	
	@PostMapping("/update")
	public String Mupdate2(MemberDTO mdto) {
		mservice.memberupdate(mdto);
		return "redirect:/member2/list";
	}
	
	@PostMapping("delete")
	public String mdelete(MemberDTO mdto) {
		mservice.memberdelete(mdto);
		return "redirect:/member2/list";
	}
	
}
