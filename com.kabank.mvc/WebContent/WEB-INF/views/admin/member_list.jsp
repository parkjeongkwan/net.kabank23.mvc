<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ include file="header.jsp"%> 
<link rel="stylesheet" href="../../css/admin.css" />
<%@ include file="aside.jsp"%>	
<section id="admin_section">
<h1 id="title" style="text-align: center;">회원관리</h1>
<table id="member_list_table">
	<tr>
		<th colspan="8">
			<select style="width:100px; height:40px">
				<option>ID</option>
				<option>이름</option>
				<option>성별</option>
			</select>
			<input style="width:450px; height:30px;" type="text" />
		    <button style="width:150px; height:30px">검색</button>
		 </th>
	</tr>
	<tr>
		<th>NO</th>
		<th>ID</th>
		<th>이름</th>
		<th>생년월일</th>
		<th>성별</th>
		<th>전화번호</th>
		<th>이메일</th>
		<th>주소</th>
	</tr>
	<tr>
	<td colspan="8">
		<button id="member_register_form_btn" 
			style="width:150px; height:30px;margin-left: 80%;">
			추가
		</button>
	</td>
	</tr>
</table> 	
</section>
<script src="../../js/admin/member_list.js"></script>
<%@ include file="../common/footer.jspf" %>