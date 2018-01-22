<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="UTF-8" />
	<title>Index</title>
	<link rel="shortcut icon" href="../../img/favicon.ico">
	<link rel="stylesheet" href="../../css/common.css" />
	<link rel="stylesheet" href="../../css/index.css" />
</head>
<body>
<div id="wrapper">
<header id="index_header">
	<h1><a href="#" >
		BIT CAMP SAMPLE PROJECT
	</a></h1>
</header>
<section id="index_section">
<article>
<form name="join_form" action="${ctx}/user.do" >
	<table style="margin: 0 auto;height: 400px;border: 2px">
	<tr>
	<td style="width: 150px">아이디</td>
	<td>
		<input id="join_id" name="join_id" style="margin-right: 88px" type="text" />
		<button id="check_dupl_btn" name="check_dupl_btn">중복확인</button>
	</td>
	</tr>
	
	<tr>
	<td>이름</td>
	<td><input name="name"  style="margin-right: 150px"  type="text" /></td>
	</tr>
	
	<tr>
	<td>암호</td>
	<td><input name="pass"   style="margin-right: 150px" type="password" /></td>
	</tr>
	
	<tr>
	<td>암호확인</td>
	<td><input name="confirm_pass"   style="margin-right: 150px" type="password" /></td>
	</tr>
	
	<tr>
	<td>이메일</td>
	<td><input name="email" style="margin-right: 41px" type="email" />@<select>
	<option>naver.com</option>
	<option>daum.com</option>
	<option>google.com</option>
	</select>
	</td>
	</tr>
	<tr>
	<td>가입일</td>
	<td><input name="join_date" type="date" /></td>
	</tr>
	<tr>
	<td>주민번호</td>
	<td><input name="ssn" type="text" />-<input type="number" placeholder="" min="1" max="9"/></td>
	</tr>
	
	<tr>
	<td>핸드폰번호</td>
	<td>
	<input type="radio" name="phone" checked="checked"/>SKT
	<input type="radio" name="phone" />KT
	<input type="radio" name="phone" />LG
	<br />
	<select>
	<option>010</option>
	</select>
	<input pattern="[0-9]{4}" type="text" />
	<input pattern="[0-9]{4}" type="text" />
	</td>
	</tr>
	
	<tr>
	<td>주소</td>
	<td>
	<input name="addr" type="button" value="주소검색"/>
	<input type="text" />
	<input type="hidden" name="cmd" value="insert" />
	<input type="hidden" name="dir" value="user" />
	<input type="hidden" name="page" value="login" />
	</td>
	</tr>
	<tr>
		<td colspan="2" style="text-align: center;">
			<button id="join_confirm_btn" style="width: 160px; height: 30px">확 인</button> 
			<button style="width: 160px; height: 30px">취 소</button>
		</td>
	</tr>
	</table>
</form>
</article>
</section>
<aside></aside>
</div>
<%@ include file="../common/footer.jspf"%>	
<script>
var joinConfirmBtn = document.querySelector('#join_confirm_btn');
joinConfirmBtn.addEventListener('click',
	function () {
		alert("==========회원 컨트롤러고 진입시도===========");
		var form = document.querySelector('#join_form');
		form.submit();
},false);
</script>








