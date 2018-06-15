		var slideIndex = 1;
		showDivs(slideIndex);

		function plusDivs(n) {
			showDivs(slideIndex += n);
		}

		function currentDiv(n) {
			showDivs(slideIndex = n);
		}

		function showDivs(n) {
			var i;
			var x = document.getElementsByClassName("industrie-slides");
			var dots = document.getElementsByClassName("slider-badge");
			if (n > x.length) {
				slideIndex = 1
			}
			if (n < 1) {
				slideIndex = x.length
			}
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			for (i = 0; i < dots.length; i++) {
				dots[i].className = dots[i].className.replace(" slider-white", "");
			}
			x[slideIndex - 1].style.display = "block";
			dots[slideIndex - 1].className += " slider-white";
		}

		tempSlideIndex = 1;
		setInterval(function () {
			currentDiv(tempSlideIndex)
			tempSlideIndex++;
			if (tempSlideIndex > 3)
				tempSlideIndex = 1;
		}, 3000);