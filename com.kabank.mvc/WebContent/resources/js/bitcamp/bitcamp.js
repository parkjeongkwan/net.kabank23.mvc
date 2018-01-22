function init(){
	var arr=['burgerking','kakao','bitcamp','sktelecom','lotto'];
	for(var i =0;i<arr.length;i++){
		document.querySelector('#'+arr[i]).addEventListener('click',
			function(e){
				location.href = "../"+this.id+"/main.jsp";
		},false);
	}
}
window.addEventListener("load",init,false);

/*	
document.querySelector('#nav_burgerking').onclick = goBurgerking;
document.querySelector('#nav_kakao').onclick = goKakao;
document.querySelector('#nav_bitcamp').onclick = goBitcamp;
document.querySelector('#nav_sktelecom').onclick = goSktelecom;
document.querySelector('#nav_lotto').onclick = goLotto;
*/


