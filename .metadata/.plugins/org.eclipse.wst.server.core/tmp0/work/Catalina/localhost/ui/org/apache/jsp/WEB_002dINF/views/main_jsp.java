/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2018-06-06 09:03:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(23);
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.ioteco.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/MarketingCarousel.tag", Long.valueOf(1528120128000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/spring-webmvc-3.1.1.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1329398932000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/molecules/logo.tag", Long.valueOf(1528213914000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/molecules/search.tag", Long.valueOf(1528212662000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/bosch-molecules.tld", Long.valueOf(1528213364000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-3.1.1.RELEASE.jar", Long.valueOf(1528111607207L));
    _jspx_dependants.put("/WEB-INF/lib/com.bosch.ui.ioteco.jsp.tags-common-0.0.1-SNAPSHOT.jar", Long.valueOf(1528120129771L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/molecules/languageSelector.tag", Long.valueOf(1528212660000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.ioteco.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/marketingText2.tag", Long.valueOf(1528120128000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/molecules/mainTab.tag", Long.valueOf(1528212648000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/organizes/footer.tag", Long.valueOf(1528212656000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.ioteco.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/marketingText.tag", Long.valueOf(1528120128000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153377882000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.ioteco.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/iotecoui.tld", Long.valueOf(1528120128000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1528111609314L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/organizes/primaryPageTeaser.tag", Long.valueOf(1528212666000L));
    _jspx_dependants.put("/WEB-INF/lib/com.bosch.ui.jsp.tags-common-0.0.1-SNAPSHOT.jar", Long.valueOf(1528213915571L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/bosch-organizes.tld", Long.valueOf(1528213202000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/organizes/contactUs.tag", Long.valueOf(1528212652000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.ioteco.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/iconcard.tag", Long.valueOf(1528120128000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.ioteco.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/marketingText3.tag", Long.valueOf(1528120128000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/com.bosch.ui.jsp.tags-common-0.0.1-SNAPSHOT.jar!/META-INF/tags/organizes/header.tag", Long.valueOf(1528213316000L));
    _jspx_dependants.put("jar:file:/C:/aymanDocument/projects/bosch/code/boschtags/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boschuihost/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153377882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("\t<title>Landing page</title>\r\n");
      out.write("\t<meta name=\"description\" content=\"\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/css/index.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/css/header.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/css/nav-block.css\">\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/css/content-block.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/css/slider.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/css/footer.css\">\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"resources/js/vendor/modernizr-3.5.0.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\tdocument.write('<script src=\"resources/js/vendor/fallback/html5shiv.min.js\"><\\/script>')\r\n");
      out.write("\t\t\t\tdocument.write('<script src=\"resources/js/vendor/fallback/jquery-1.4.4.min.js\"><\\/script>')\r\n");
      out.write("\t\t\t\tdocument.write('<script src=\"resources/js/vendor/fallback/jquery-extra-selectors.js\"><\\/script>')\r\n");
      out.write("\t\t\t\tdocument.write('<script src=\"resources/js/vendor/fallback/selectivizr.js\"><\\/script>')\r\n");
      out.write("\t\t\t\tdocument.write('<script src=\"resources/js/vendor/fallback/rem.min.js\"><\\/script>')\r\n");
      out.write("\t\t\t\tdocument.write('<script src=\"resources/js/vendor/fallback/fallback.js\"><\\/script>')\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"resources/css/fallback.css\">\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("   <script>\r\n");
      out.write("      document.createElement('header');\r\n");
      out.write("      document.createElement('nav');\r\n");
      out.write("      document.createElement('section');\r\n");
      out.write("      document.createElement('article');\r\n");
      out.write("      document.createElement('aside');\r\n");
      out.write("      document.createElement('footer');\r\n");
      out.write("   </script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\theader,\r\n");
      out.write("\t\tnav,\r\n");
      out.write("\t\tsection,\r\n");
      out.write("\t\tarticle,\r\n");
      out.write("\t\taside,\r\n");
      out.write("\t\tfooter {\r\n");
      out.write("\t\t\tdisplay: block;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_boschui_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_boschui_005fprimaryPageTeaser_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"nav-block-section\">\r\n");
      out.write("\t\t<div class=\"divider\">\r\n");
      out.write("\t\t\t<img src=\"./resources/img/icon/dot-white.png\">\r\n");
      out.write("\t\t\t<img src=\"./resources/img/icon/divider-white.png\">\r\n");
      out.write("\t\t\t<img src=\"./resources/img/icon/divider-gray.png\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_iotecoui_005ficoncard_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- ! Buyers Sellers  Block -->\r\n");
      out.write("\r\n");
      if (_jspx_meth_iotecoui_005fmarketingText_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Industrie Slider Block -->\r\n");
      out.write("\t");
      if (_jspx_meth_iotecoui_005fMarketingCarousel_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- ! Industrie Slider Block -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_iotecoui_005fmarketingText2_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_iotecoui_005fmarketingText3_005f0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- ! Contact Us Block -->\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_boschui_005fcontactUs_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_boschui_005ffooter_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<!-- ! Footer -->\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"resources/js/slider.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\twindow.jQuery || document.write('<script src=\"resources/js/vendor/jquery-3.2.1.min.js\"><\\/script>')\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"resources/js/header.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_boschui_005fheader_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  boschui:header
    org.apache.jsp.tag.meta.http_003a.bosch_com.taglib.organizes.custom.organizes.header_tag _jspx_th_boschui_005fheader_005f0 = new org.apache.jsp.tag.meta.http_003a.bosch_com.taglib.organizes.custom.organizes.header_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_boschui_005fheader_005f0);
    try {
      _jspx_th_boschui_005fheader_005f0.setJspContext(_jspx_page_context);
      // /WEB-INF/views/main.jsp(69,1) name = brandIdentifier type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_boschui_005fheader_005f0.setBrandIdentifier("Bosch IoT Marketplace");
      // /WEB-INF/views/main.jsp(69,1) name = pageLinksText type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_boschui_005fheader_005f0.setPageLinksText("iot.solution,iot.support");
      // /WEB-INF/views/main.jsp(69,1) name = pageLinksURL type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_boschui_005fheader_005f0.setPageLinksURL("http://www.google.com, http://www.yahoo.com ");
      _jspx_th_boschui_005fheader_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_boschui_005fheader_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_boschui_005fprimaryPageTeaser_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  boschui:primaryPageTeaser
    org.apache.jsp.tag.meta.http_003a.bosch_com.taglib.organizes.custom.organizes.primaryPageTeaser_tag _jspx_th_boschui_005fprimaryPageTeaser_005f0 = new org.apache.jsp.tag.meta.http_003a.bosch_com.taglib.organizes.custom.organizes.primaryPageTeaser_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_boschui_005fprimaryPageTeaser_005f0);
    try {
      _jspx_th_boschui_005fprimaryPageTeaser_005f0.setJspContext(_jspx_page_context);
      _jspx_th_boschui_005fprimaryPageTeaser_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_boschui_005fprimaryPageTeaser_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_iotecoui_005ficoncard_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  iotecoui:iconcard
    org.apache.jsp.tag.meta.http_003a.bosch_com.ioteco.taglib.custom.iconcard_tag _jspx_th_iotecoui_005ficoncard_005f0 = new org.apache.jsp.tag.meta.http_003a.bosch_com.ioteco.taglib.custom.iconcard_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_iotecoui_005ficoncard_005f0);
    try {
      _jspx_th_iotecoui_005ficoncard_005f0.setJspContext(_jspx_page_context);
      _jspx_th_iotecoui_005ficoncard_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_iotecoui_005ficoncard_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_iotecoui_005fmarketingText_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  iotecoui:marketingText
    org.apache.jsp.tag.meta.http_003a.bosch_com.ioteco.taglib.custom.marketingText_tag _jspx_th_iotecoui_005fmarketingText_005f0 = new org.apache.jsp.tag.meta.http_003a.bosch_com.ioteco.taglib.custom.marketingText_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_iotecoui_005fmarketingText_005f0);
    try {
      _jspx_th_iotecoui_005fmarketingText_005f0.setJspContext(_jspx_page_context);
      _jspx_th_iotecoui_005fmarketingText_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_iotecoui_005fmarketingText_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_iotecoui_005fMarketingCarousel_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  iotecoui:MarketingCarousel
    org.apache.jsp.tag.meta.http_003a.bosch_com.ioteco.taglib.custom.MarketingCarousel_tag _jspx_th_iotecoui_005fMarketingCarousel_005f0 = new org.apache.jsp.tag.meta.http_003a.bosch_com.ioteco.taglib.custom.MarketingCarousel_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_iotecoui_005fMarketingCarousel_005f0);
    try {
      _jspx_th_iotecoui_005fMarketingCarousel_005f0.setJspContext(_jspx_page_context);
      _jspx_th_iotecoui_005fMarketingCarousel_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_iotecoui_005fMarketingCarousel_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_iotecoui_005fmarketingText2_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  iotecoui:marketingText2
    org.apache.jsp.tag.meta.http_003a.bosch_com.ioteco.taglib.custom.marketingText2_tag _jspx_th_iotecoui_005fmarketingText2_005f0 = new org.apache.jsp.tag.meta.http_003a.bosch_com.ioteco.taglib.custom.marketingText2_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_iotecoui_005fmarketingText2_005f0);
    try {
      _jspx_th_iotecoui_005fmarketingText2_005f0.setJspContext(_jspx_page_context);
      _jspx_th_iotecoui_005fmarketingText2_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_iotecoui_005fmarketingText2_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_iotecoui_005fmarketingText3_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  iotecoui:marketingText3
    org.apache.jsp.tag.meta.http_003a.bosch_com.ioteco.taglib.custom.marketingText3_tag _jspx_th_iotecoui_005fmarketingText3_005f0 = new org.apache.jsp.tag.meta.http_003a.bosch_com.ioteco.taglib.custom.marketingText3_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_iotecoui_005fmarketingText3_005f0);
    try {
      _jspx_th_iotecoui_005fmarketingText3_005f0.setJspContext(_jspx_page_context);
      _jspx_th_iotecoui_005fmarketingText3_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_iotecoui_005fmarketingText3_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_boschui_005fcontactUs_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  boschui:contactUs
    org.apache.jsp.tag.meta.http_003a.bosch_com.taglib.organizes.custom.organizes.contactUs_tag _jspx_th_boschui_005fcontactUs_005f0 = new org.apache.jsp.tag.meta.http_003a.bosch_com.taglib.organizes.custom.organizes.contactUs_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_boschui_005fcontactUs_005f0);
    try {
      _jspx_th_boschui_005fcontactUs_005f0.setJspContext(_jspx_page_context);
      _jspx_th_boschui_005fcontactUs_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_boschui_005fcontactUs_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_boschui_005ffooter_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  boschui:footer
    org.apache.jsp.tag.meta.http_003a.bosch_com.taglib.organizes.custom.organizes.footer_tag _jspx_th_boschui_005ffooter_005f0 = new org.apache.jsp.tag.meta.http_003a.bosch_com.taglib.organizes.custom.organizes.footer_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_boschui_005ffooter_005f0);
    try {
      _jspx_th_boschui_005ffooter_005f0.setJspContext(_jspx_page_context);
      _jspx_th_boschui_005ffooter_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_boschui_005ffooter_005f0);
    }
    return false;
  }
}