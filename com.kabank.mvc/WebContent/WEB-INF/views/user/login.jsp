<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<section>
<article>
<table id="login-outer-table">
	<tr>
		<td colspan="5">
			<form id="login-form" action="${context}/user.do">
				<table id="login-inner-table">
					<tr>
						<td><input id="login-userid-input" name="userid"
							type="text" value="kim" placeholder="ID" tabindex="1" />
						</td>
						<td rowspan="2">
							<button id="login-btn">LOGIN</button>
						</td>
					</tr>
					<tr>
						<td><input id="login-password-input" name="password"
							type="password" value="1" placeholder="PASSWORD" tabindex="2" />
							<input type="hidden" name="cmd" value="login" />
							<input type="hidden" name="page" value="mypage" />
						</td>
					</tr>
				</table>
			</form> <a id="login-admin-link" href="#"> 관리자 </a>
					 | <a id="login-join-link" href="#">회원가입 </a>
				

		</td>
	</tr>
</table>
</article>
</section>
<%@ include file="../common/footer.jspf"%>
<script>
	document.querySelector('#login-admin-link').addEventListener('click',
			function() {
				location.href = "${context}/admin/main.do";
			}, false);
	document.querySelector('#login-join-link').addEventListener('click',
			function() {
				location.href = "${context}/user.do?cmd=move&page=join";
			}, false);
	document.querySelector('#login-btn').addEventListener('click',
			function() {
				document.querySelector('#login-form').submit();
			}, false);
</script>










