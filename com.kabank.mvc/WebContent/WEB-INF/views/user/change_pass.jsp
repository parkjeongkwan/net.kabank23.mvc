<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/nav.jspf"%>
<h1>비번 변경</h1>
<form id="change_pass_form" action="${ctx}/user.do">
	<input id="current_pass" type="text" value="${sessionScope.user.pass}" />
		현재 비밀번호<br />
	<input id="change_pass" name="newPass" type="" />수정할 비밀번호<br />
	<input id="confirm_pass" type="text" />수정할 비밀번호 확인<br />
	<input type="hidden" name="cmd" value="change_pass" />
	<input type="hidden" name="dir" value="bitcamp" />
	<input type="hidden" name="page" value="main" />
</form>
<button id="confirm_btn" >확인</button>
<button id="cancel_btn">취소</button>
<script>
document.querySelector('#confirm_btn').addEventListener('click',
function(){
	document.querySelector('#change_pass_form').submit();
},false);
document.querySelector('#cancel_btn').addEventListener('click',
function(){
	
},false);

</script>
