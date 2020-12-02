package org.lhr.service;

import java.util.ArrayList;

import org.lhr.DTO.MemberDTO;

public interface MemberService {

	
	public void memberupdate(MemberDTO mdto);
	public void memberinsert(MemberDTO mdto);
	public void memberdelete(MemberDTO mdto);
	public ArrayList<MemberDTO> memberlist();
	public MemberDTO memberdetail(MemberDTO mdto);
}
