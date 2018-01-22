<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/nav.jspf"%>
<section>
<article>
	<header>
		<hgroup>
			<h1><mark>버거킹</mark> 주문 화면</h1>
			<h6>상품과 수량을 선택해 주세요</h6>
		</hgroup>
	</header>
</article>
<article>
 <form id="order_form" action="result.jsp"
 	 style="width : 600px;margin: 0 auto;">
	<table>
		<tr>
			<td>
			<figure>
				<img src="../../img/hamburger.jpg" style="width: 200px; height: 150px;" alt="" /><br />
				<figcaption>
					<input type="checkbox" name="menu" value="hamberger"/>햄버거 ￦5,500
					<input type="number" name="hamburger-count" style="width: 30px" min="1" max="9" /> 개
				</figcaption>
			</figure>
			</td>
			<td>
			<figure>
				<img src="../../img/coke.jpg" style="width: 200px; height: 150px;" alt="" />
				<figcaption>
					<input type="checkbox" name="menu" value="coke"/>콜라 : ￦1,000 
					<input type="number" name="coke-count" style="width: 30px" min="1" max="9" /> 개
				</figcaption>
			</figure>
			</td>
			<td>
			<figure>
				<img src="../../img/chip.jpg" style="width: 200px; height: 150px" alt="" />
				<figcaption>
					<input type="checkbox" name="menu" value="chip"/>감자칩 : ￦1,000
					<input type="number" name="chip-count" style="width: 30px" min="1" max="9" /> 개
				</figcaption>
			</figure>
			</td>
		</tr>
		<tr>
			<td>
			<figure>
				<img src="../../img/coffee.jpg" style="width: 200px; height: 150px" alt="" />
				<figcaption>
					<input type="checkbox" name="menu" value="coffee"/>커피 : ￦900
					<input type="number" name="coffee-count" style="width: 30px" min="1" max="9" /> 개
				</figcaption>
			</figure>
			</td>
			<td>
			<figure>
				<img src="../../img/bagel.jpg" style="width: 200px; height: 150px" alt="" />
				<figcaption>
					<input type="checkbox" name="menu" value="bagel"/>베이글 : ￦4.000
					<input type="number" name="bagel-count" style="width: 30px" min="1" max="9" /> 개
				</figcaption>
			</figure>
			</td>
			<td>
			<figure>
				<img src="../../img/salad.jpg" style="width: 200px; height: 150px" alt="" />
				<figcaption>
					<input type="checkbox" name="menu" value="salad"/>샐러드 : ￦3.000
					<input type="number" name="salad-count" style="width: 30px" min="1" max="9" /> 개
				</figcaption>			
			</figure>
			</td>
		</tr>
		<tr>
			<td colspan="3">
				<input type="radio" name="place" value="매장식사"  checked/> 매장식사
				<input type="radio" name="place" value="테이크아웃"  /> 테이크아웃
			</td>
		</tr>
		<tr>
			<td colspan="3">
				<input type="hidden" name="hamburger" value="5500" />
				<input type="hidden" name="coke" value="1000" />
				<input type="hidden" name="chip" value="1000" />
				<input type="hidden" name="coffee" value="900" />
				<input type="hidden" name="bagel" value="4000" />
				<input type="hidden" name="salad" value="3000" />
				<input id="burgerking_order_btn" type="button" value="전 송" style="width: 100px;margin-left:300px"/>
			</td>
		</tr>
	</table>
</form>
</article>
</section>
<aside></aside>
</div>
<%@ include file="../common/footer.jspf"%>	
</body>
<script src="../../js/burgerking.js"></script>
</html>