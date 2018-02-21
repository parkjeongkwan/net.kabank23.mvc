function init(){
	var checkDuplBtn = document.querySelector('#check_dupl_btn');
	var joinConfirmBtn = document.querySelector('#join_confirm_btn');
	checkDuplBtn.addEventListener("click",checkDupl,false);
	joinConfirmBtn.addEventListener("click",joinConfirm,false);
}
function checkDupl(e){
	alert('중복체크 클릭');
	e.preventDefault();
}
function joinConfirm(e){
	var joinId = document.querySelector('#join_id').value;
	alert('가입 확인 클릭'+joinId);
	sessionStorage.setItem('id',joinId);
}
window.addEventListener("load",init,false);