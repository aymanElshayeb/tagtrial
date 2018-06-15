$(document).ready(function(){
	$('.header-search .search-field-input').click(function () {
		var label = $(this).parents('.search-field-form').find('.search-field-label');
		label.addClass('search-field-label-invert');
		
	});
	$('.header-search .search-field-input').focusout(function () {
		$(this).removeClass('active');
		var label = $(this).parents('.search-field-form').find('.search-field-label');
		label.removeClass('search-field-label-invert');
	});
})
