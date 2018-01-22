<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/nav.jspf"%>
<style>
#kakao_nav {float:left; width: 10%; text-align: left}
#kakao_nav ul {list-style-type: none; margin: 0; padding-top: 40px; width: 100%; height: 620px; background-color: #f1f1f1}
#kakao_nav li a{display: block; height:30px; color: #000; margin-top: -11px; margin-bottom: -10px; padding: 8px 16px; 
	font-weight: bold; text-decoration: none; font-size: 15px}
#kakao_nav li a:hover {background-color: #555; color: white}
#kakao_nav li a.active {background-color: #4CAF50; color: white}

.kakao_menu_btn {margin-top: 30px}
.kakao_menu_btn button {width:200px; height: 350px; font-size: 30px; font-weight: bold; color: #333333; background-color: #ffdc00;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19)}
.kakao_menu_btn button:hover {background-color: #555; color: white}}
</style>
<div>
<div id="kakao_nav">
	<ul>
		<li><a class="active" >핸드폰 개통</a><br /></li>
		<li><a>미정</a><br /></li>
		<li><a>미정</a><br /></li>
		<li><a>미정</a><br /></li>
		<li><a>미정</a></li>
	</ul>
</div>
<section>
<article>
<h1 style ="text-align: left; padding: 15px; text-indent: 15px">핸드폰 개통</h1>
<div class="kakao_menu_btn">
	<button id="mobile-create-phone-btn">핸드폰 개통</button>&nbsp;&nbsp;&nbsp; 
	<button>미정</button>&nbsp;&nbsp;&nbsp; 
	<button>미정</button>&nbsp;&nbsp;&nbsp; 
	<button>미정</button>&nbsp;&nbsp;&nbsp; 
	<button>미정</button>
</div>
</article>
</section>
<aside>
</aside>
</div>
<script>
document.querySelector('#mobile-create-phone-btn').addEventListener(
		'click',
		function(){
			location.href = "${context}/mobile.do?cmd=open-phone&dir=user&page=mypage";
		},
		false);
</script>
