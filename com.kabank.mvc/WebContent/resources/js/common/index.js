function init(){
	var goAdminLink = document.querySelector('#go_admin_link');
	var goJoinLink = document.querySelector('#go_join_link');
	var indexLoginBtn = document.querySelector('#index_login_btn');
	goAdminLink.addEventListener("click",goAdmin,false);
	goJoinLink.addEventListener("click",goJoin,false);
	indexLoginBtn.addEventListener("click",indexLogin,false);
}
function indexLogin(e){
	var loginId = document.querySelector('#index_input_id').value;
	var joinId = sessionStorage.getItem('id');
	if(!(loginId === joinId)){
		e.preventDefault();
		alert('입력하신 '+loginId+' 는 틀립니다');
	}
}
function goAdmin(){
	if(confirm('관리자?')){
		location.href = "../admin/main.jsp";
	}else{
		alert('관리자만 접근가능 합니다');
	}
}
function goJoin(){
	location.href = "member/join.jsp";
}
window.addEventListener("load",init,false);

/*
window.onload = execute;
function execute(){
	document.querySelector('#go_admin').onclick = goAdmin;
	document.querySelector('#go_join').onclick = goJoin;
}
function goAdmin(){
	var admin = confirm('관리자?');
	if(admin){
		alert('안녕하세요 관리자님');
	}else{
		alert('관리자만 접근가능 합니다');
	}
}
function goJoin(){
	location.href = "member/join.jsp";
}
*/
