
<%@taglib prefix="bosch" uri="http://bosch.com/taglib/molecules/custom"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<%@ attribute name="brandIdentifier"%>
<%@ attribute name="pageLinksText" rtexprvalue="true"
	required="false"  %>
<%@ attribute name="pageLinksURL" rtexprvalue="true"
	required="false"  %>
	

   
 

<!-- HEADER -->
<header class="page-header">
	<div class="logo-row">
		<div class="container-fluid">
			<bosch:logo></bosch:logo>
			<div class="header-meta">
				<bosch:languageSelector></bosch:languageSelector>
				<h4 class="brand-identifier"> <fmt:message key = "iot.identifier" /></h4>
			</div>
		</div>
	</div>
	
	<div class="nav-row">
		<bosch:mainTab pageLinksText="${pageLinksText}" pageLinksURL ="${pageLinksURL}"></bosch:mainTab>
		
		<bosch:search></bosch:search>
		
	</div>

	<div class="user-action-row">
		<div class="container-fluid">
			<div class="header-meta">
				<nav class="navigation">
					<ul class="navigation-meta">
						<li class="navigation-user-action">
							<ul>
								<li class="user-action"><a
									class="navigation-meta-link user-action-link" href="/">Sign
										In / Register
										<div class="icon-group">
											<img src="./resources/img/icon/Bosch-IC-my-brand-frame.svg">
										</div>
								</a></li>
								<li class="user-action"><a
									class="navigation-meta-link user-action-link" href="/">
										<div class="icon-group">
											<img src="./resources/img/icon/Bosch-IC-shoppingcart.svg">
										</div>
								</a></li>
							</ul>
						</li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
</header>