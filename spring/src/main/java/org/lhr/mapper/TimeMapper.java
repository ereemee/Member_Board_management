package org.lhr.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("select sysdate()")
	 public String getTime();
	 public String getTime2();
	
	
	
	
	
	
	




}
