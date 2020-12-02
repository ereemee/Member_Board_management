/**
 * 
 */

function btn_click(str){
	
	//str이 update면 수정 action
	if(str=="update"){
	//action은 /member2/update
	frm1.action="/member2/update";
	//method는 get방식 
	frm1.method="get";
		
	} else {//str이 delete이면 삭제 action
		
		//action은 /member2/delete
		frm1.action="/member2/delete";
		//method는 post방식으로
		frm1.method="post";
	
	//get은 보여주는거
	//post는 안보여주는거
	
	}
	
	
	
}