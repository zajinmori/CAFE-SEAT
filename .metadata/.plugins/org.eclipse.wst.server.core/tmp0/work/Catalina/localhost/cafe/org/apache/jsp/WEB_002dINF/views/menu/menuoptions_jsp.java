/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-12-19 07:39:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menuoptions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/inc/footer.jsp", Long.valueOf(1733983260711L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1729240665271L));
    _jspx_dependants.put("/WEB-INF/views/inc/nav.jsp", Long.valueOf(1733918060466L));
    _jspx_dependants.put("jar:file:/C:/Users/LG/Desktop/zajinmori/project/JSPServletProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/CafeSeatProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<title>CafeSeat</title>\r\n");
      out.write("		<meta charset=\"utf-8\" />\r\n");
      out.write("		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"/cafe/assets/css/main.css\" />\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"/cafe/assets/css/menuoptions.css\" />\r\n");
      out.write("		<noscript><link rel=\"stylesheet\" href=\"/cafe/assets/css/noscript.css\" /></noscript>\r\n");
      out.write("	</head>\r\n");
      out.write("	<style>\r\n");
      out.write("		\r\n");
      out.write("	</style>\r\n");
      out.write("	<body class=\"is-preload\" style=\"-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Wrapper-->\r\n");
      out.write("			<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("				<!-- Nav -->\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav id=\"nav\"\r\n");
      out.write("	style=\"display: flex; align-items: center; justify-content: space-between;\">\r\n");
      out.write("	<div class=\"logo\" style=\"margin-right: 850px;\">\r\n");
      out.write("		<a href=\"/cafe/cafe/cafemap.do\" style=\"opacity: 1;\"> <img src=\"../images/Logo.png\"\r\n");
      out.write("			style=\"width: 350px; height: 100px;\" alt=\"Logo\">\r\n");
      out.write("		</a>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div style=\"flex: 1; display: flex; justify-content: center;\">\r\n");
      out.write("		<a href=\"/cafe/cafe/cafemap.do\" class=\"icon solid fa-map\"><span>Map</span></a>\r\n");
      out.write("		<!-- <a href=\"/cafe/seat/selectseat.do\" class=\"icon solid fa-mug-hot\"><span>CafeSeat</span></a>  -->\r\n");
      out.write("		<a href=\"/cafe/mypage/mypage.do\" class=\"icon solid fa-heart\"><span>MyPage</span></a>\r\n");
      out.write("\r\n");
      out.write("		<!-- 로그인 안 했을 때 -->\r\n");
      out.write("		");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- 로그인 했을 때  -->\r\n");
      out.write("		");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<!-- Main -->\r\n");
      out.write("					<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("							<!-- 옵션 메뉴 -->\r\n");
      out.write("							<article id=\"mainmenu\" class=\"panel\">\r\n");
      out.write("								<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("								<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("								<div id=\"optionImg\">\r\n");
      out.write("									");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("									");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("								<form method=\"POST\" action=\"/cafe/menu/menuoptions.do\">\r\n");
      out.write("									<input type=\"hidden\" name=\"seq\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("									<input type=\"hidden\" name=\"seqCategory\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.seqCategory}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("									");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("								<div id=\"select\">\r\n");
      out.write("									<input type=\"number\" name=\"totalCount\" id=\"totalCount\" min=\"1\" max=\"10\" placeholder=\"수량\" required>\r\n");
      out.write("									<button type=\"submit\" class=\"options\">선택</button>\r\n");
      out.write("									<button type=\"button\" class=\"back\" onclick=\"location.href='/cafe/menu/menulist.do';\">취소</button>\r\n");
      out.write("								</div>\r\n");
      out.write("								</form>												\r\n");
      out.write("							</article>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Footer -->\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("	<ul class=\"copyright\">\r\n");
      out.write("		<li>&copy; SIST-SideProject</li>\r\n");
      out.write("		<li>MEMBER : 김유진 김유리 이우진 장지윤 전상수</li>\r\n");
      out.write("	</ul>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- Scripts -->\r\n");
      out.write("		<script src=\"/cafe/assets/js/jquery.min.js\"></script>\r\n");
      out.write("		<script src=\"/cafe/assets/js/browser.min.js\"></script>\r\n");
      out.write("		<script src=\"/cafe/assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("		<script src=\"/cafe/assets/js/util.js\"></script>\r\n");
      out.write("		<script src=\"/cafe/assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("				\r\n");
      out.write("				document.querySelector('.options').addEventListener('click', function() {\r\n");
      out.write("				    \r\n");
      out.write("					const seqCategory = document.querySelector('input[name=\"seqCategory\"]').value;\r\n");
      out.write("				    const totalCount = document.getElementById('totalCount').value || 1; // 기본값을 1로 설정\r\n");
      out.write("				    \r\n");
      out.write("				    if (seqCategory != 3) {\r\n");
      out.write("				    	\r\n");
      out.write("						const temperature = document.querySelector('input[name=\"temperature\"]:checked')?.value;\r\n");
      out.write("					    const size = document.querySelector('input[name=\"size\"]:checked')?.value;\r\n");
      out.write("					    const iceamount = document.querySelector('input[name=\"iceamount\"]:checked')?.value;\r\n");
      out.write("					    const shotadd = document.querySelector('input[name=\"shotadd\"]:checked')?.value;\r\n");
      out.write("					    \r\n");
      out.write("					    if (!temperature) {\r\n");
      out.write("					        alert('온도를 선택해 주세요.');\r\n");
      out.write("					        return; // 온도를 선택하지 않았으면 종료\r\n");
      out.write("					    }\r\n");
      out.write("		\r\n");
      out.write("					    if (!size) {\r\n");
      out.write("					        alert('사이즈를 선택해 주세요.');\r\n");
      out.write("					        return; // 사이즈를 선택하지 않았으면 종료\r\n");
      out.write("					    }\r\n");
      out.write("					    \r\n");
      out.write("		\r\n");
      out.write("					    if (!iceamount) {\r\n");
      out.write("					        alert('얼음 양을 선택해 주세요.');\r\n");
      out.write("					        return; // 얼음 양을 선택하지 않았으면 종료\r\n");
      out.write("					    }\r\n");
      out.write("					    \r\n");
      out.write("		\r\n");
      out.write("					    if (!shotadd) {\r\n");
      out.write("					        alert('샷추가 여부를 선택해 주세요.');\r\n");
      out.write("					        return; // 샷 추가를 선택하지 않았으면 종료\r\n");
      out.write("					    }\r\n");
      out.write("				    }\r\n");
      out.write("	\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				const temperature = $('input:radio[name=\"temperature\"]:checked').val();\r\n");
      out.write("			    const size = $('input:radio[name=\"size\"]:checked').val();\r\n");
      out.write("			    const iceamount = $('input:radio[name=\"iceamount\"]:checked').val();\r\n");
      out.write("			    const shotadd = $('input:radio[name=\"shotadd\"]:checked').val();\r\n");
      out.write("			    \r\n");
      out.write("			    \r\n");
      out.write("			    const totalCount = document.getElementById('totalCount').value || 1; // 기본값을 1로 설정\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("		    \r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/inc/nav.jsp(18,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty auth}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<a href=\"/cafe/user/login.do\" class=\"icon solid fa-user\"><span>Login</span></a>\r\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/inc/nav.jsp(23,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty auth}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<a href=\"/cafe/user/logout.do\" class=\"icon solid fa-user\"><span>Logout</span></a>\r\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/views/menu/menuoptions.jsp(33,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.seqCategory != '3'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("										<img src=\"/cafe/assets/pic/menuImages/drink/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\r\n");
          out.write("									");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /WEB-INF/views/menu/menuoptions.jsp(36,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.seqCategory == '3'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("										<img src=\"/cafe/assets/pic/menuImages/dessert/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\r\n");
          out.write("									");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f4_reused = false;
    try {
      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f4.setParent(null);
      // /WEB-INF/views/menu/menuoptions.jsp(43,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.seqCategory != '3'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("										<div id=\"option\">\r\n");
          out.write("											<div class=\"optionName\">1. 온도(ICE or HOT)</div>\r\n");
          out.write("												<div class=\"radio_temperature\">\r\n");
          out.write("													<input id=\"temper_ice\" type=\"radio\" class=\"temperature\" name=\"temperature\" value=\"1\" required>\r\n");
          out.write("													<label for=\"temper_ice\">ICE</label>\r\n");
          out.write("												</div>\r\n");
          out.write("												<div class=\"radio_temperature\">\r\n");
          out.write("													<input id=\"temper_hot\" type=\"radio\" class=\"temperature\" name=\"temperature\" value=\"2\">\r\n");
          out.write("													<label for=\"temper_hot\">HOT</label>\r\n");
          out.write("												</div>\r\n");
          out.write("												\r\n");
          out.write("											<div class=\"optionName\">2. 사이즈(Size)</div>\r\n");
          out.write("												<div class=\"radio_cupsize\">\r\n");
          out.write("													<input id=\"size_regular\" type=\"radio\" class=\"size\" name=\"size\" value=\"0\" required>\r\n");
          out.write("													<label for=\"size_regular\">기본(R)</label>\r\n");
          out.write("												</div>\r\n");
          out.write("												<div class=\"radio_cupsize\">\r\n");
          out.write("													<input id=\"size_large\" type=\"radio\" class=\"size\" name=\"size\" value=\"1\">\r\n");
          out.write("													<label for=\"size_large\">라지(L)</label>\r\n");
          out.write("												</div>\r\n");
          out.write("												<div class=\"radio_cupsize\">\r\n");
          out.write("													<input id=\"size_max\" type=\"radio\" class=\"size\" name=\"size\" value=\"2\">\r\n");
          out.write("													<label for=\"size_max\">맥스(M)</label>\r\n");
          out.write("												</div>\r\n");
          out.write("												\r\n");
          out.write("											<div class=\"optionName\">3. 얼음 양(Ice Amount)</div>\r\n");
          out.write("												<div class=\"radio_iceamount\">\r\n");
          out.write("													<input id=\"icefew\" type=\"radio\" class=\"iceamount\" name=\"iceamount\" value=\"0\" required>\r\n");
          out.write("													<label for=\"icefew\">얼음 적게</label>\r\n");
          out.write("												</div>\r\n");
          out.write("												<div class=\"radio_iceamount\">\r\n");
          out.write("													<input id=\"icebasic\" type=\"radio\" class=\"iceamount\" name=\"iceamount\" value=\"1\">\r\n");
          out.write("													<label for=\"icebasic\">기본</label>\r\n");
          out.write("												</div>\r\n");
          out.write("												<div class=\"radio_iceamount\">\r\n");
          out.write("													<input id=\"icelots\" type=\"radio\" class=\"iceamount\" name=\"iceamount\" value=\"2\">\r\n");
          out.write("													<label for=\"icelots\">얼음 많이</label>\r\n");
          out.write("												</div>\r\n");
          out.write("												\r\n");
          out.write("											<div class=\"optionName\">4. 샷 추가(Shot)</div>\r\n");
          out.write("												<div class=\"radio_shotadd\">\r\n");
          out.write("													<input id=\"noshot\" type=\"radio\" class=\"shotadd\" name=\"shotadd\" value=\"0\" required>\r\n");
          out.write("													<label for=\"noshot\">기본</label>\r\n");
          out.write("												</div>\r\n");
          out.write("												<div class=\"radio_shotadd\">\r\n");
          out.write("													<input id=\"shot\" type=\"radio\" class=\"shotadd\" name=\"shotadd\" value=\"1\">\r\n");
          out.write("													<label for=\"shot\">샷 추가</label>\r\n");
          out.write("												</div>\r\n");
          out.write("										</div>\r\n");
          out.write("									");
          int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      _jspx_th_c_005fif_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f4, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f4_reused);
    }
    return false;
  }
}
