let index = {
	init: function(){ // 이벤트 리스너 바인딩
		$("#btn-save").on("click", () => {
			this.save();
		}), // 수정 추가할꺼면 그대로 복사해서 변수명만 바꿔줌
		// 로그인 리스너
		$("#btn-login").on("click", () => {
			this.login();
		});
	},
	save: function(){ // 회원가입 로직 실행
		let data = {
			username:$("#username").val(),
			password:$("#password").val(),
			email:$("#email").val(),
		};
		$.ajax({
			type:"POST",
			url:"/auth/joinProc", // 권한과 인증이 필요없는 경우 auth
			data:JSON.stringify(data), // POST 방식이기 때문에 data를 날릴 수 있음
			contentType:"application/json; charset=utf-8", // 대소문자 구분
			dataType: "json"// 서버로부터 응답받을 때 데이터 타입
		}).done((resp)=>{
			if(resp.statusCode == 1) { // 통신은 무조건 String, 하지만 int로 만들었기 때문에 1로 설정
				alert("회원가입 성공");
				location.href="/";
			}
			console.log(resp); // 자바스크립트 오브젝트가 되서 날라옴
		}).fail((error)=>{
			console.log(error);	
		})
	}, // save
	
	login: function(){ // 로그인 로직 실행
		let data = {
			username:$("#username").val(),
			password:$("#password").val(),
		};
		$.ajax({
			type:"POST",
			url:"/auth/loginProc", // 권한과 인증이 필요없는 경우 auth
			data:JSON.stringify(data), // POST 방식이기 때문에 data를 날릴 수 있음
			contentType:"application/json; charset=utf-8", // 대소문자 구분
			dataType: "json"// 서버로부터 응답받을 때 데이터 타입
		}).done((resp)=>{
			alert("로그인 성공");
			location.href="/";
			console.log(resp); // 자바스크립트 오브젝트가 되서 날라옴
		}).fail((error)=>{
			alert("로그인 실패");
			console.log(error);	
		})
	} // login
}

index.init();
