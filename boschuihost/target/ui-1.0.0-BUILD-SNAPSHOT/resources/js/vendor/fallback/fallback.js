$(document).ready(function() {
	if (!Modernizr.svg) {
		$('img[src$=".svg"]').each(function() {
			//Replaces 'logo.svg' with 'logo.png'.
			$(this).attr('src', $(this).attr('src').replace('.svg', '.png'));
		});
	}
});