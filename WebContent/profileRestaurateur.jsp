<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--
	Linear by TEMPLATED
    templated.co @templatedco
    Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->

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
					<h1></h1>
					<ul class="pagination">
						<li class="current"><a href="images/bg-img1.jpg">1</a></li>
						<li><a href="images/bg-img2.jpg">2</a></li>
						<li><a href="images/bg-img3.jpg">3</a></li>
					</ul>
					<strong class="bg-text">Background:</strong>
				</div>
				<div class="row pull-right">
					<a class="button-3" href="login.jsf">Вход</a> <a class="button-3"
						href="registration.jsf">Регистрация</a>
				</div>
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
		<div class="menu-row">
			<div class="menu-border">
				<div class="main">
					<div class="row">
						<div class="col-sm-5 col-xs-5">

							<label for="city"></label><select id="city" class="form-control"><option
									value="0" selected>Избери град</option>
								<option>София</option>
								<option>Пловдив</option>
								<option>Пазарджик</option>
							</select> <label for="address"></label> <input type="text"
								class="form-control" id="address"
								placeholder="Адрес и място на ресторанта"> <label
								for="kitchen"></label> <select id="kitchen" class="form-control"><option
									value="0" selected>Кухня</option>
								<option>BBQ</option>
								<option>Суши</option>
								<option>Пица</option>
								<option>Интернационална</option>
								<option>Средиземноморска</option>
								<option>Италианска</option>
								<option>Европейска</option>
								<option>Австрийска</option>
								<option>Българска</option>
								<option>Сръбска скара</option>
								<option>Българска национална</option>
							</select> <label for="people"></label> <select id="people"
								class="form-control">
								<option value="0" selected>Бр. хора</option>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
								<option>6</option>
								<option>7</option>
								<option>8</option>
								<option>9</option>
								<option>10</option>
								<option>11</option>
								<option>12</option>
								<option>13</option>
								<option>14</option>
								<option>15</option>
								<option>16</option>
								<option>17</option>
								<option>18</option>
								<option>19</option>
								<option>20</option>
								<option>21</option>
								<option>22</option>
								<option>23</option>
								<option>24</option>
								<option>25</option>
								<option>26</option>
								<option>27</option>
								<option>28</option>
								<option>29</option>
								<option>30</option>
								<option>31</option>
								<option>32</option>
								<option>33</option>
								<option>34</option>
								<option>35</option>
								<option>36</option>
								<option>37</option>
								<option>38</option>
								<option>39</option>
								<option>40</option>
								<option>41</option>
								<option>42</option>
								<option>43</option>
								<option>44</option>
								<option>45</option>
								<option>46</option>
								<option>47</option>
								<option>48</option>
								<option>49</option>
								<option>50</option>
								<option>51</option>
								<option>52</option>
								<option>53</option>
								<option>54</option>
								<option>55</option>
								<option>56</option>
								<option>57</option>
								<option>58</option>
								<option>59</option>
								<option>60</option>
								<option>61</option>
								<option>62</option>
								<option>63</option>
								<option>64</option>
								<option>65</option>
								<option>66</option>
								<option>67</option>
								<option>68</option>
								<option>69</option>
								<option>70</option>
							</select> <label for="date"></label> <select id="date"
								class="form-control">
								<option value="0" selected>Дата</option>
							</select> <label for="hour"></label> <select id="hour"
								class="form-control">
								<option value="0" selected>Час</option>
								<option>7:00 часа</option>
								<option>7:30 часа</option>
								<option>8:00 часа</option>
								<option>8:30 часа</option>
								<option>9:00 часа</option>
								<option>9:30 часа</option>
								<option>10:00 часа</option>
								<option>10:30 часа</option>
								<option>11:00 часа</option>
								<option>11:30 часа</option>
								<option>12:00 часа</option>
								<option>12:30 часа</option>
								<option>13:00 часа</option>
								<option>13:30 часа</option>
								<option>14:00 часа</option>
								<option>14:30 часа</option>
								<option>15:00 часа</option>
								<option>15:30 часа</option>
								<option>16:00 часа</option>
								<option>16:30 часа</option>
								<option>17:00 часа</option>
								<option>17:30 часа</option>
								<option>18:00 часа</option>
								<option>18:30 часа</option>
								<option>19:00 часа</option>
								<option>19:30 часа</option>
								<option>20:00 часа</option>
								<option>20:30 часа</option>
								<option>21:00 часа</option>
								<option>21:30 часа</option>
								<option>22:00 часа</option>
								<option>22:30 часа</option>
								<option>23:00 часа</option>
								<option>23:30 часа</option>
							</select> <a class="button-3" href="#">Търси</a>

						</div>
					</div>
				</div>
			</div>
		</div>
		</header>
		<!--==============================content================================-->
		<div class="inner">
			<div class="main">
				<section id="content">
				<h3>Restaurateur</h3>
				<div class="col-md-5">
					<form class="basic-panel" action="Reservation1JPAServlet"
						method="post">
						<div class="form-group">
							<label for="name">Name</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="text"
									class="form-control" id="name">
							</div>
						</div>
						<div class="form-group">
							<label for="adress">Adress</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="text"
									class="form-control" id="adress">
							</div>
						</div>
						<div class="form-group">
							<label for="location">Location</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="text"
									class="form-control" id="location">
							</div>
						</div>
						<div class="form-group">
							<label for="description">Description</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="text"
									class="form-control" id="description">
							</div>
						</div>
						<div class="form-group">
							<label for="kitchen">Kitchen</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="text"
									class="form-control" id="kitchen">
							</div>
						</div>
						<div class="form-group">
							<label for="work_time">Work time</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="text"
									class="form-control" id="work_time">
							</div>
						</div>
						<div class="form-group">
							<label for="method_of_payment">Method of payment</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="text"
									class="form-control" id="method_of_payment">
							</div>
						</div>
						<div class="form-group">
							<label for="has">Has</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="text"
									class="form-control" id="has">
							</div>
						</div>
						<div class="form-group">
							<label for="more_option">More option</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="text"
									class="form-control" id="more_option">
							</div>
						</div>
						<div class="form-group">
							<label for="e-mail">E-mail</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="text"
									class="form-control" id="email">
							</div>
						</div>
						<div class="form-group">
							<label for="password">Password</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="text"
									class="form-control" id="pass">
							</div>
						</div>
						<div class="form-group">
							<label for="city">City</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="text"
									class="form-control" id="city">
							</div>
						</div>
						<div class="form-group">
							<label for="number">Telefon number</label>
							<div class="input-group">
								<span class="input-group-addon"></span> <input type="number"
									class="form-control" id="telefon_number">
							</div>
						</div>

						<button type="button" class="btn btn-secondary">Clouse</button>
						<button type="button" class="btn btn-secondary">Keep the
							changes</button>

						<!-- <a class="button-2" href="profil.jsf"
							onClick="document.getElementById('contact-form').reset()">Clouse</a>
						<a class="button-2" href="profileRestauranteur.jsf"
							onClick="document.getElementById('contact-form').submit()">Keep
							the changes </a> -->
					</form>
				</div>
				</section>
				<div class="block"></div>
			</div>
		</div>
	</div>
	<!--==============================footer=========
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
</body>
</html>