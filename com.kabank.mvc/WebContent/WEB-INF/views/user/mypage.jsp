<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/nav.jspf"%>
<section>
<article>
	<table id="mypage-table">
		<tr>
			<td id="mypage-profile-img-td" rowspan="5">
				<img id="mypage-profile-img" src="${image}/default_profile.png" alt="" /></td>
			<td class="mypage-column">ID</td>
			<td class="mypage-data">${sessionScope.user.userid}</td>
			<td class="mypage-column">BIRTHDAY</td>
			<td class="mypage-data"></td>
		</tr>
		<tr>
			<td class="mypage-column">PASSWORD</td>
			<td class="mypage-data">${sessionScope.user.password}</td>
			<td class="mypage-column">PHONE</td>
			<td class="mypage-data">${sessionScope.user.phone}</td>
		</tr>
		<tr>
			<td class="mypage-column">NAME</td>
			<td class="mypage-data">${sessionScope.user.name}</td>
			<td class="mypage-column">EMAIL</td>
			<td class="mypage-data">${sessionScope.user.email}</td>
		</tr>
		<tr>
			<td class="mypage-column">SSN</td>
			<td class="mypage-data">${sessionScope.user.ssn}</td>
			<td class="mypage-column">ADDRESS</td>
			<td class="mypage-data">${sessionScope.user.addr}</td>
		</tr>
		<tr>
			<td class="mypage-column">ACCOUNT</td>
			<td class="mypage-data">${sessionScope.user.account.accountNum}</td>
			<td class="mypage-column"></td>
			<td class="mypage-data"></td>
		</tr>
		<tr>
  			<td colspan="6" style="width: 100%">
  				<button id="mypage-leave-btn" >
  					탈 퇴
  				</button>
  				<button id="mypage-change-btn">
  					수 정
  				</button>
  			</td>
  		</tr>
	</table>
</article>
</section>
<script>
document.querySelector('#mypage-leave-btn').addEventListener(
		'click',
		function(){
			location.href = "${context}/user.do?cmd=delete-member";
		},
		false);
</script>
<%@ include file="../common/footer.jspf"%>