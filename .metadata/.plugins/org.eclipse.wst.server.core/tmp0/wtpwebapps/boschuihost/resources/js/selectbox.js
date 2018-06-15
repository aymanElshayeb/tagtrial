$(document).ready(function(){
	$('.dropdown .select').click(function () {
		var dropdown = $(this).parents('.dropdown');
		dropdown.attr('tabindex', 1).focus();
		if (dropdown.hasClass('active')) {
			dropdown.removeClass('active');
			dropdown.find('.dropdown-menu').slideUp(300);
		} else {
			dropdown.addClass('active');
			dropdown.find('.dropdown-menu').slideDown(300);
		}
	});
	$('.dropdown').focusout(function () {
		$(this).removeClass('active');
		$(this).find('.dropdown-menu').delay(300).slideUp(300);
	});
	$('.dropdown .dropdown-menu li').click(function () {
		$(this).parents('.dropdown').find('span').text($(this).text());
		$(this).parents('.dropdown').find('input').attr('value', $(this).attr('data-value'));
	});
	$('.customSelect').SumoSelect();
	$('#sort1').change(function() {
		console.log('change');
	});
	$('#productTypeSelect').change(function() {
		window.location.replace($(this).val());
	});
})
