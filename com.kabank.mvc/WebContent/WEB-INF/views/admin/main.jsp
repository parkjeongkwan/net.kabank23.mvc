<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<link rel="stylesheet" href="${style}/admin.css" /> 
<%@ include file="aside.jsp"%>	
<section id="admin_section">
<h1 id="title">회원관리</h1>

	<table id="admin-main-table">
		<tr>
			<td >
				<a id="move_member_btn" style="cursor: pointer;">
					<img src="${image}/admin_main_member.jpg"
						id="move_member_btn_img"
					 alt="" />
				</a>
			</td>
			<td >준비중</td>
			<td >준비중</td>
		</tr>
		<tr>
			<td>준비중</td>
			<td>준비중</td>
			<td> 테이블 생성 <br />
				<form id="admin-crate-table-form" action="${context}/admin.do?cmd=create-table">
					<select name="table_name" id="table_name">
						<option value="member">회 원</option>
						<option value="attend">출 석</option>
						<option value="mobile">모바일</option>
					</select>
					<button id="admin-create-table-btn">생 성</button>
				</form>
			</td>
		</tr>
	</table>
	
</section>
<%@ include file="../common/footer.jspf" %>
<script>
document.querySelector('#admin-create-table-btn')
	.addEventListener('click',
		function (){
			document.querySelector('#admin-crate-table-form').submit();
	}	
			,false);
</script>









