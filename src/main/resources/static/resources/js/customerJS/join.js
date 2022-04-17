/**
 * 회원가입 validation check 
 */

// 필수항목 체크
function signInCheck() {
   // id
   if(!document.joinform.id.value) {
      alert("아이디를 입력하세요.");
      document.joinform.id.focus();
      return false;
	//비밀번호 체크
	}else if(!document.joinform.password.value){ 
	  alert("비밀번호를 입력하세요.");
	  document.joinform.password.focus();
	  return false;
	//비밀번호 확인
	}else if(!document.joinform.re_password.value){
		alert("비밀번호 대시 입력하세요.");
		document.joinform.re_password.value = "";
		document.joinform.re_password.focus();
		return false;
	//비밀번호 일치여부
	}else if(document.joinform.password.value != document.joinform.re_password.value){
		alert("비밀번호가 일치하지 않습니다.");
		document.joinform.password.focus();
		return false;
	//이름 체크
	}else if(!document.joinform.name.value){
		alert("이름을 입력하세요.");
		document.joinform.name.focus();
		return false;
	//생일 체크
	}else if(!document.joinform.birthday.value){
		alert("생일을 입력하세요.");
		document.joinform.birthday.focus();
		return false;
	//주소 체크
	}else if(!document.joinform.address.value){
		alert("주소을 입력하세요.");
		document.joinform.address.focus();
		return false;
	//이메일 체크	
	}else if(!document.joinform.email1.value){
		alert("이메일을 입력하세요.");
		document.joinform.email1.focus();
		return false;	
	//이메일 형식 불일치 -> email2.value 미존재 && email3.value == 0일때 
	}else if(!document.joinform.email2.value && document.joinform.email3.value == 0){
		alert("이메일 형식이 일치하지 않습니다.");
		document.joinform.email2.focus();
		return false;
	
	
	// 2-1. join.jsp 폼 바로아래 추가
	//<input type="hidden" name="hiddenId" value="0">
	//hiddenId : 중복확인 버튼 클릭여부 체크(0:클릭안함, 1:클릭함)
	
	// 2. 중복확인 버튼 클릭하지 않은 경우 "중복확인 해주새요.";	
	}else if(document.joinform.hiddenId.value == "0"){
		alert("중복확인 해주세요");
		document.joinform.dupChk.focus();
		return false;
	}
}

// 아이디 중복확인 페이지 
// 1. 중복확인 페이지 open
function confirmId() {
   if(!document.joinform.id.value) {
      alert("아이디를 입력하세요.");
      document.joinform.id.focus();
      return false;
   }   
   
   var url = "/Project01/confrimIdAction.do?id=" + document.joinform.id.value;
   window.open(url, "confirm", "menubar=no, width=500, height=400");  // window.open(url, "별칭", size);
}

//이메일 주소를 select 박스로 선택
function selectEmailChk(){
	if(document.joinform.email3.value != 0){
		document.joinform.email2.value = document.joinform.email3.value;
	}else{
		document.joinform.email2.value = "";
		document.joinform.email2.focus();
	}
}

// ----------- 아이디 중복확인 --------------------
//3. 중복확인창 포커스
function confirmIdFocus(){
	document.confirmform.id.focus();
}

function confirmIdCheck(){
	if(!document.confirmform.id.value){
		alert("아이디를 입력하세요.");
		document.confirmform.id.focus();
		return false;
	}
}

//4. 자식 창에서 부모 창으로 id값을 전달
/*
	opener : window 객체의 open() 메서드로 열릴 새창(=중복확인창)에서 부모창(=회원가입폼)에 접근할 때 사용
	join.jsp - hiddenId : 중복확인
	self.close() : 내창 닫기*/
 
function setId(id){
	opener.document.joinform.id.value=id;
	opener.document.joinform.hiddenId.value="1";
	self.close();
}


