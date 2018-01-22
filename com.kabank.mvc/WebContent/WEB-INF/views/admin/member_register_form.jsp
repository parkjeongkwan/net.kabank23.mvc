<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%> 
<link rel="stylesheet" href="../../css/admin.css" />
<%@ include file="aside.jsp"%>	
<section id="admin_section">
<form id="member_register_form" action="member_register.jsp">
		<table id="main_table">
		<tr>
			<td>id : <input name="id" type="text" /></td>
		</tr>
		
		<tr>
			<td>이름 : <input name="name" type="text" /></td>
		</tr>
		<tr>
			<td>SSN : <input name="ssn" type="text"  /></td>
		</tr>
		<tr>
			<td>전화번호 : <input name="phone" type="text" /></td>
		</tr>
		<tr>
			<td>이메일 : <input name="email" type="text" /></td>
		</tr>
		
		<tr>
			<td>주소 : <input name="addr" type="text" /></td>
		</tr>
			<tr>
			<td><button id="member_register_btn" style="width:150px; height:30px;margin-left: 80%;">추가</button></td>
			</tr>
		</table> 
</form>	  
</section>	
<script src="../../js/admin/member_register_form.js"></script>
<%@ include file="../common/footer.jspf" %>
   
   