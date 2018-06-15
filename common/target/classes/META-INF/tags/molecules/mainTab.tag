<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<%@ attribute name="pageLinksText" rtexprvalue="true"
	required="false"  %>
<%@ attribute name="pageLinksURL" rtexprvalue="true"
	required="false"  %>
<%@ tag  import="java.util.*,com.bosch.ui.model.*" %>

 <%
	List<PageLink> pageLinkList = PageLink.getPageLinks(pageLinksText, pageLinksURL);
  %> 
  
 
<div class="navigation navigation-main">
			<nav>
				<div class="navigation-main-wrapper">
					<ul class="navigation-main-items">
						<c:forEach items="<%=pageLinkList%>" var="pageLink">
							<li
								class="navigation-item navigation-main-item navigation-main-item-active">
								<a href="<c:out value = "${pageLink.url}"/>"><fmt:message key = "${pageLink.text}" /></a>
							</li>
						</c:forEach>


					</ul>
				</div>
			</nav>
</div>