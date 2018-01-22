function init(){
	var arr=['burgerking','kakao','bitcamp','sktelecom','lotto'];
	for(var i =0;i<arr.length;i++){
		document.querySelector('#'+arr[i]).addEventListener('click',
			function (e){
				location.href = "../"+this.id+"/main.jsp";
			},false);
	}
	document.querySelector('#burgerking_order_btn')
		.addEventListener('click',order,false);
		
}
function order(){
	document.querySelector('#order_form').submit();
}
window.addEventListener("load",init,false);
/*
 function execute(){
	document.querySelector('#burgerking').onclick = goBurgerking;
	document.querySelector('#kakao').onclick = goKakao;
	document.querySelector('#bitcamp').onclick = goBitcamp;
	document.querySelector('#sktelecom').onclick = goSktelecom;
	document.querySelector('#lotto').onclick = goLotto;
	document.querySelector('#burgerking_order_btn')
		.onclick = burgerkingOrder;
}
function goBurgerking(){
	location.href = "../burgerking/main.jsp";
}
function goKakao(){
	location.href = "../kakao/main.jsp";
}
function goBitcamp(){
	location.href = "../bitcamp/main.jsp";
}
function goSktelecom(){
	location.href = "../sktelecom/main.jsp";
}
function goLotto(){
	location.href = "../lotto/main.jsp";
}
function burgerkingOrder(){
	document.querySelector('#order_form').submit();
}
*/



