package org.lhr.controller;

import org.lhr.DTO.MemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.lhr.DTO.MemberDTO;


@Controller
@RequestMapping("/sample") //제외하면 url주소에서 /sample을 제외하면 됨
// ex)localhost:8080/member/delete -- 삭제 localhost:8080/member/update -- 수정 에서 공통적으로 들어가는 /member/부분이 여기에해당됨 



public class SampleController {
																	//클래스명
	private static final Logger Logger = LoggerFactory.getLogger(SampleController.class);
	
	//springframework 버전 4.3 이전 버전에서만 사용
	@RequestMapping(value="/samplebasic1",method=RequestMethod.GET)
	//url주소를 통해서 가면 무조건 get
	public void basicGet1() {
		Logger.info("samplebasic1");
		//url 주소 : http://localhost8090/sample/samplebasic1
	}
	//springframework 버전 4.3 이후 버전에서는 둘다 가능
	@GetMapping("/samplebasic3")
	public String basicGet2() {
		Logger.info("samplebasic3");
		//url 주소 : http://localhost8090/sample/samplebasic2
		return "sb3";
	}
	//두가지 상황 url주소랑 .jsp랑 이름을 같게 가겠다 => return 필요없음
	//url 주소랑 .jsp이름을 다르게 하겠다 => return 값을 따로 설정
	
	
	
	
	
	
	//JSON 타입(jackson-databind 라는 라이브러리 추가 (pom.xml에 추가하는거))
	
	
	@RequestMapping(value="/json",method=RequestMethod.GET)
	public @ResponseBody MemberDTO jsonGet() {
		
		MemberDTO mdto = new MemberDTO();
	//	mdto.setAge(10);
	//	mdto.setName("정자바");
		return mdto;
		
	}
	
	//통신방식 비동기식 통신
	//동기식방식vs비동기식 방식의 차이 
	//동기식은 차례대로 하는것 비동기식은 끝나지않아도 다른작업도 할 수 있음
	//비동기식 : 통신이 정상적으로 이루어졌을때 이루어짐 
	// 개발자 도구에 header status code가 정상이어야함
	
	//ResponseEntity 타입
	
	@RequestMapping(value="/entity",method=RequestMethod.GET)
	public ResponseEntity<String> entityGet(){
		
		String msg="{\"name\" :\"정자바\"  }";
		HttpHeaders header = new HttpHeaders();
		header.add("Content-type","application/json;charset=UTF-8");		
		return new ResponseEntity<>(msg,header,HttpStatus.OK); 
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
