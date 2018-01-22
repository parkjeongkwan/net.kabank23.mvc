function init(){
	document.querySelector("#move_member_btn")
		.addEventListener("click",moveMemberList,false);
	document.querySelector("#member_mgmt_link")
		.addEventListener("click",moveMemberList,false);
	
}
function moveMemberList(){
	location.href = "member_list.jsp";
}
window.addEventListener("load", init, false);