<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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


<body>

	<div class="container">
		<div class="row">
			<div class="col"></div>
		</div>
	</div>
	<div class="extra">
		<!--==============================header=================================-->
		<header>
		<div class="top-row">
			<div class="main">
				<div class="wrapper">
					
				</div>
			</div>
		</div>
		</header>
		<!--==============================content================================-->
		<div class="inner">
			<div class="main">
				<section id="content">

				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Choose which one to register:</h3>
					</div>
					<a class="button-3" href="client.jsf">Client</a> <a
						class="button-3" href="restaurateur.jsf">Restaurateur</a>

				</div>

				</section>
				<div class="block"></div>
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
		</html>
	</h:form>
</f:view>