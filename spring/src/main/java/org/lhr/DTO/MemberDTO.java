package org.lhr.DTO;

public class MemberDTO {
	//이메일
	String addr;
	//아이디
	String id;
	//비밀번호
	String password;
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MemberDTO [addr=" + addr + ", id=" + id + ", password=" + password + "]";
	}
	


}
