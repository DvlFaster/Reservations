function bindEvents() {
	// $('#login').on('click', loginClick);
	$('#register').click(registerClick);
}

function registerClick(e) {
	$('#register-modal').modal('show');
}

function loginClick(e) {
	e.preventDefault();
	var email = $('#email');
	var isLoginCorrect = false;
	var isPassCorrect = false;

	if (email.val().length > 0) {
		isLoginCorrect = true;
		email.closest('.form-group').find('.help-block').hide();
	} else {
		email.closest('.form-group').find('.help-block').show();
	}

	var pass = $('#pass');
	if (pass.val().length > 0) {
		isPassCorrect = true;
		pass.closest('.form-group').find('.help-block').hide();
	} else {
		pass.closest('.form-group').find('.help-block').show();
	}

	if (isLoginCorrect && isPassCorrect) {
		parent.window.location.href = "profile.jsf";
	} else {
		parent.window.location.href = "index.jsf";
	}

	if (isLoginCorrect && isPassCorrect) {
		this.client = c;
		parent.window.location.href = "client.jsf";
		this.restaurateur = r;
		parent.window.location.href = "restaurateur.jsf";
	} else {
		this.administrator = a;
	}
	if (client) {
		// c;
		parent.window.location.href = "profileClient.jsf";
	} else
		(restaurateur)
	{
		r;
		parent.window.location.href = "profilRestaurateur.jsf";
	}
}

function getCategories(id, name, add) {
	$.ajax(
			{
				method : "GET",
				url : "https://developers.zomato.com/api/v2.1/categories" + id
						+ name + "01ceced352b7543126d9911f15206058",
				dataType : "json"
			}).done(function(response) {
		if (add)
			addAndRenderDiv(id, name, response);
		else
			renderCategories(response);
	}).fail(function() {
		console.log('Error occured!');
	}).always(function() {
		console.log('Completed!');
	});
}