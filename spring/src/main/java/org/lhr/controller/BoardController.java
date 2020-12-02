package org.lhr.controller;

import org.lhr.DTO.BoardDTO;
import org.lhr.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//@Controller
//@RequestMapping("/board")

//public class BoardController {
	//@Autowired
	//패키지가 다른데에서 클래스를 불러올때 선언해줌 
	//private BoardService bservice;		// private BoardService bservice = new BoardService();
																	//클래스명
//private static final Logger Logger = LoggerFactory.getLogger(BoardController.class);

	//@GetMapping("/update")
	//public String GetWrite(Model model) {
		//Logger.info("/update");
		//String name = "정자바";
	//	model.addAttribute("name", name);
//		return "/board/write";	}


//	@GetMapping("/write")
//	public String Getwrite(@ModelAttribute("name") String name) {
//		Logger.info("게시판 글쓰기");
//		return "board/write";
//	}
	//return 값이 없으면 value값에 .jsp를 붙여서 이동
	/*
	@PostMapping("/write")
	//@RequestMapping(value="/write",method=RequestMethod.POST)
	//스프링 프레임워크에 따라서 둘중에 하나 를 사용해야함 4.3 이전인지 아닌지 위 아래는 같은 뜻임
	//MultipartFile 파일 타입
	//스프링은 view파일이랑 여기 매개변수랑 이름이 같아야함 file의 name값
	//이미지업로드는 무조건 post방식으로 가야함
	//public void Postupdload(BoardDTO bdto,ArrayList<MultipartFile> files) {
		public void Postwrite(BoardDTO bdto) {
		bservice.boardInsert(bdto);
		
	}	
	*/
	
	
		/*
		 * 
		 * 
	@GetMapping("/list")
	public void list(Model model){
	model.addAttribute("list", bservice.boardList());	
	}
	
	@GetMapping("/delete")
	public void boardDelete() {
	Logger.info("/delete");
	
	}
	
	@GetMapping("/read")
	public void boardRead() {
	Logger.info("/read");
	}
		
		
		
	for(int i = 0; i<file.size();i++) {
	Logger.info("업로드 된 파일 이름 = "+files.get(i).getOriginalFilename());
	Logger.info("업로드 된 파일 크기 = "+files.get(i).getSize());}
	*/
		
		/*files.forEach(file->{
			Logger.info("업로드 된 파일 이름 = "+file.getOriginalFilename());
			Logger.info("업로드 된 파일 크기 = "+file.getSize());
		});*/
		
	
	//model의 역할은 controller에 있는 데이터를 화면(.jsp)으로 보내는 역할
	//데이터를 가지고 화면으로 가라 
	
	//foreach 로하면 부조건 0부터 돌아감 배열에서만 사용할 수 잇는 for문 
	//1에서부터 돌리고싶다? 불가능
	//file은 임시 저장소 역할을 함 변수가 하나 더잇는것임 files에서 file로 가져와서 출력해라라는 뜻
	/*
	@GetMapping("/write")
	public void boardWrite() {
		Logger.info("/write");
		//return "bw3";	//return값을 주려면 파일이름이 return값과 같아야 찾을 수 있음
		//return값을 줬을때 폴더안에 view파일이 있으면 return값에 /폴더명 붙여줘야함
	
	}

	
	@GetMapping("/update")
	public void boardUpdate(BoardDTO bdto) {
	bservice.boardUpdate(bdto);
		Logger.info("/update");
	
	}
	
	
	
	
	@RequestMapping(value="/redirect",method=RequestMethod.GET)
	public String Redirect(RedirectAttributes rttr) {
			rttr.addFlashAttribute("name","정자바");
			rttr.addFlashAttribute("age", 10);

			return"redirect:/";
			
	}
}	*/
	

