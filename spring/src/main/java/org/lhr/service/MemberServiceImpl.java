package org.lhr.service;

import java.util.ArrayList;

import org.lhr.DTO.MemberDTO;
import org.lhr.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberMapper mbmp;
	
	public void memberupdate(MemberDTO mdto){
		mbmp.memberupdate(mdto);
	};
	
	public void memberinsert(MemberDTO mdto){
		mbmp.memberinsert(mdto);
	};

	public void memberdelete(MemberDTO mdto){
		mbmp.memberdelete(mdto);
	};
	
	public ArrayList<MemberDTO> memberlist(){
		return mbmp.memberlist();
	};
	
	public MemberDTO memberdetail(MemberDTO mdto){
		return mbmp.memberdetail(mdto);
	};
	
	
	
	
}

