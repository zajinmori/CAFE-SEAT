<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
	<link rel="stylesheet" href="http://bit.ly/3WJ5ilK">
	<style>
		#list th:nth-child(1){width: 50px;}
		#list th:nth-child(2){width: 70px;}
		#list th:nth-child(3){width: 60px;}
		#list th:nth-child(4){width: 60px;}
		#list th:nth-child(5){width: 140px;}
		#list th:nth-child(6){width: auto;}
		
		#list td{ text-align : center;}
		#list td:nth-child(6){ text-align : left;}
		
		#list td:nth-child(6) > span:nth-child(2), 
		#list td:nth-child(6) > span:nth-child(3) {
			float: right;
			cursor: pointer;
		}
		
		#btnCancel{
			display: none;
			
		}
	</style>
</head>
<body>
	<!-- ex10.jsp -->
	
	<!-- 
		Rendering
			1. SSR, Server Side Rendering
			2. CSR, Client Side Rendering
				- 모바일용 페이지
				- 자바스크립트 프레임워크(Angular, React, Vue)
				- Ajax 관련 처리 페이지
	
	 -->
	
	<h1>Ajax로 주소록 만들기 <small>[CSR]</small></h1>
	
	
	<table id="list">
		<thead>
		<tr> <!-- 고정 -->
			<th>번호</th>
			<th>이름</th>
			<th>나이</th>
			<th>성별</th>
			<th>연락처</th>
			<th>주소</th>
		</tr>
		</thead>
		
		<tbody>
		<!--동적으로 !!  고정인것과 부모를 나눠야한다-->
		
		</tbody>
	</table>
	<hr>
	<form id="form1">
		<div>
			<label>이름</label>
			<input type="text" name="name" id="name"> <!-- 컬럼명이랑 name,id를 똑같이 하는게 좋다 -->
		</div>
		<div>
			<label>나이</label>
			<input type="text" name="age" id="age">
		</div>
		<div>
			<label>성별: </label>
			<select name="gender" id="gender">
				<option value="m">남자</option>
				<option value="f">여자</option>
			</select>
		</div>
		<div>
			<label>연락처: </label>
			<input type="text" name="tel" id="tel">
		</div>
		<div>
			<label>주소</label>
			<input type="text" name="address" id="address">
		</div>
		<div>
		<input type="button" value="추가하기" id="btnSend">
		<input type="button" value="취소하기" id="btnCancel">
		</div>
		
		<input type="hidden" name="seq" id="seq"> <!-- ex10edit.java에서 쓸 seq 받아오려고 만듬 -->
		
	</form>
	
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<script src="https://bit.ly/4cMuheh"></script>	
	<script>
	
	//서버 > (데이터) > Ajax 방법들
	//	1. Text
	//	2. XML
	//	3. JSON
	
	//Ajax > (데이터) > 서버 방법들
	//	1. QueryString(url에 붙여 넣는것) 
	//	2. 직렬화(객체를 일련의 한줄 문자열로 만드는 작업)
	//		- 반드시 name="" 값을 넣어야함
	//		- serialize() 객체 사용
	// 	3. 객체
	
		$('#btnSend').click(()=>{
			
			if($(event.target).val()=='추가하기'){
				//추가하기
				addok();
			}else{
				//수정하기
				editok();
			}
			
		});		

	function addok(){
		
		$.ajax({
			type: 'POST',
			url: '/ajax/ex10add.do',
			
			
			//1. QueryString 방법 > 완전 노가다.. 밑에 방법들 사용할 것 !
			// data: 'name=' +$('#name').val()+'&age='+$('#age').val()+'&gender='+ $('#gender').val()+'&address='+$('#address').val(),
			
			
			//2. 직렬화
			// data: $('#form1').serialize(),
			
			
			//3. 객체
			 data: {
				name: $('#name').val(),
				age: $('#age').val(),
				gender: $('#gender').val(),
				tel: $('#tel').val(),
				address: $('#address').val()
			},
			
			dataType: 'json',
			success: function(result){
				if(result.result){
					
					$('#name').val('');
					$('#age').val('');
					$('#gender').val('m');
					$('#tel').val('');
					$('#address').val('');
					//성공했을때 칸 비워주기
					
					load();
					
				}else{
					alert('추가 실패');
				}
			},
			
			error: function(a,b,c){
				console.log(a,b,c);	
			}
		});
		
	}
		
	
	
	
	
	function editok(){
		
		
		$.ajax({
			type: 'POST',
			url: '/ajax/ex10edit.do',
			
			data: {
				name: $('#name').val(),
				age: $('#age').val(),
				gender: $('#gender').val(),
				tel: $('#tel').val(),
				address: $('#address').val(),
				seq: $('#seq').val()
			},
			
			dataType: 'json',
			success: function(result) {
				if (result.result) {
					
					$('#name').val('');
					$('#age').val('');
					$('#gender').val('m');
					$('#tel').val('');
					$('#address').val('');
					
					load();
					$('#btnSend').val('추가하기');
					
				} else {
					alert('수정 실패');
				}
			},
			
			error: function(a,b,c) {
				console.log(a,b,c);
			}
		});
		
		
	}
	
	
	
	
		//읽기 작업
		
		function load(){
			$.ajax({
				type: 'GET',	//가져오기만 하는건 GET을 주로 사용!
				url: '/ajax/ex10data.do',
				dataType: 'json',
				success: function(result){
					//Ex10Data.java에서 만든걸 result에 받아오기
					
					if(result.result == 1){
						//목록 가져오기 성공
						
						$('#list tbody').html(''); //성공하면 텍스트박스 리셋하는
						
						result.arr.forEach(item => {//DB에서 가져온 데이터 1줄
							$('#list tbody').append(`
								
									<tr>
									<td>\${item.seq}</td>
									<td>\${item.name}</td>
									<td>\${item.age}</td>
									<td>\${item.gender == 'm' ? '남자':'여자'}</td>
									<td>\${item.tel}</td>
									<td>
										<span>\${item.address}</span>
										<span class="material-symbols-outlined" onclick="edit();">edit_note</span>
										<span class="material-symbols-outlined" onclick="del(\${item.seq});">delete</span>
									</td>
								</tr>
									
							`);
						});
						
					} else{
						//실패
						'목록 가져오기 실패'
						};
					
				},
				error: function(a,b,c){
					console.log(a,b,c);
				}
			});
		}
		
		load();
		
		function del(seq){
			
			if(!confirm('delete?')){
				return;
			}
			
			$.ajax({
				type: 'POST',
				url: '/ajax/ex10del.do',
				data: 'seq=' + seq,
				dataType: 'json',
				success: function(result){
					
					if(result.result == 1){
						load(); //새로고침. 위에 만들어놓음
					}else{
						alert('삭제 실패');
					}
					
				},
				error: function(a,b,c){
					console.log(a,b,c);
				}
			});
			
		}
	
	
		
		function edit(){
			
			//alert($(event.target).parent().text());
			
			let tel = $(event.target).parent().prev().text();
			let gender = $(event.target).parent().prev().prev().text();
			let age = $(event.target).parent().prev().prev().prev().text();
			let name = $(event.target).parent().prev().prev().prev().prev().text();
			let seq = $(event.target).parent().prev().prev().prev().prev().prev().text();
			let address = $(event.target).parent().children().first().text();
			
			
			$('#name').val(name);
			$('#age').val(age);
			$('#gender').val(gender =='남자' ? 'm' : 'f');
			$('#tel').val(tel);
			$('#address').val(address);
			$('#seq').val(seq);
			
			
			$('#btnSend').val('수정하기');
			$('#btnCancel').show();
			
			
		}
	
		$('#btnCancel').click(()=>{
			$('#name').val('');
			$('#age').val('');
			$('#gender').val('m');
			$('#tel').val('');
			$('#address').val('');
			
			
			$('#btnSend').val('추가하기');
			$('#btnCancel').show();
		});
	
	
	

	</script>
</body>
</html>