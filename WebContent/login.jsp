<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--
	Linear by TEMPLATED
    templated.co @templatedco
    Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<f:view>
	<h:form>
		<!DOCTYPE html>
		<html lang="en">
<jsp:include page="head.jsp" />
<body id="page1">
	<div class="container">
		<!--==============================header=================================-->
		<header>
		<div class="top-row">
			<div class="main">
				
			</div>
		</div>

		<div class="menu-row">
			<div class="menu-border">
				<div class="main">
					<nav>
					<ul class="menu">
						<li><a class="active" href="index.jsf">Начало</a></li>
						<li><a href="about.jsf">За нас</a></li>
						<li><a href="profil.jsf">Профил</a></li>
						<li><a href="menu.jsf">Меню</a></li>
						<li><a href="calendar.jsf">Календар</a></li>
						<li class="last"><a href="contacts.jsf">Контакти</a></li>

					</ul>
					</nav>
				</div>
			</div>
		</div>

		
		</header>
		<!--==============================content================================-->
		<div class="row">
				<div class="col-md-5 center">
								<h3>Вход</h3>
				
				<div class="card">
					  <div class="card-body">
					<form class="basic-panel" action="ReservationJPAServlet"
							method="post">
							<div class="form-group">
								<label for="e-mail">E-mail</label>
								<div class="input-group">
									<span class="input-group-addon"></span> <input type="text"
										class="form-control" id="email" name="email">
								</div>
							</div>
	
							<div class="form-group">
								<label for="password">Парола</label>
								<div class="input-group">
									<span class="input-group-addon"></span> <input type="text"
										class="form-control" id="pass" name="pass">
								</div>
							</div>
							<input type="hidden" value="login" name="page"> <input
								type="submit"/>
								<!-- <button type="button" class="btn btn-outline-primary">Submit</button> -->
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--==============================footer=================================-->
	<footer>
	<div class="padding">
		<div class="main">
			<div class="wrapper">
				<div class="fleft footer-text">
					
					<!-- {%FOOTER_LINK} -->
				</div>

				<ul class="list-services">
					<li>Линк към нас:</li>
					<li><a class="tooltips" title="facebook" href="#"></a></li>
					<li class="item-1"><a class="tooltips" title="twitter"
						href="#"></a></li>
					
				</ul>
			</div>
		</div>
	</div>
	</footer>
	<script type="text/javascript">
		Cufon.now();
	</script>
	<script type="text/javascript">
		$(window).load(function() {
			$('.slider')._TMS({
				duration : 1000,
				easing : 'easeOutQuart',
				preset : 'simpleFade',
				slideshow : 10000,
				banners : 'fade',
				pauseOnHover : true,
				waitBannerAnimation : false,
				pagination : '.pags'
			});
		});
	</script>
</body>
		</html>
	</h:form>
</f:view>