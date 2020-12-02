package org.lhr.mapper;

import java.util.ArrayList;

import org.lhr.DTO.MemberDTO;

public interface MemberMapper {

	public void memberupdate(MemberDTO mdto);
	public void memberdelete(MemberDTO mdto);
	public void memberinsert(MemberDTO mdto);
	public ArrayList<MemberDTO> memberlist();
	public MemberDTO memberdetail(MemberDTO mdto);
	
	
	
	
}
