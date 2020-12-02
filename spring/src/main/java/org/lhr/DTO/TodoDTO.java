package org.lhr.DTO;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class TodoDTO {

	//제목
	private String title;
	//날짜
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date duedate;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	@Override
	public String toString() {
		return "TodoDTO [title=" + title + ", duedate=" + duedate + "]";
	}





}
