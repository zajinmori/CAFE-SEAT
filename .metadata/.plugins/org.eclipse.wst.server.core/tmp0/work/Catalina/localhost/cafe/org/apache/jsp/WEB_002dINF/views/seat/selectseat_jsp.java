/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-12-19 11:01:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.seat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class selectseat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/inc/dev.jsp", Long.valueOf(1734585912354L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<title>CafeSeat</title>\r\n");
      out.write("	<meta charset=\"utf-8\" />\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"../assets/css/main.css\" />\r\n");
      out.write("	<noscript><link rel=\"stylesheet\" href=\"../assets/css/noscript.css\" /></noscript>\r\n");
      out.write("\r\n");
      out.write("	<style>\r\n");
      out.write("        .seat {\r\n");
      out.write("            display: flex;	\r\n");
      out.write("            flex-wrap: wrap;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            gap: 10px;\r\n");
      out.write("            max-width: 1000px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border: 2px solid #AF8F6F;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            background-color: #F8F4E1;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("		/* .seat form {width:90%; margin:0 auto; display: flex; flex-wrap: wrap; border: 5px solid #AF8F6F;; padding: 10px; box-sizing: Border-box; border-radius: 15px;} */\r\n");
      out.write("        .seat form input {\r\n");
      out.write("            width: 17.7142%;\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("            margin-right: 1%;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            background-color: burlywood;\r\n");
      out.write("            color: black;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            box-shadow: 1px 1px 2px rgba(0, 0, 0, 0.15);\r\n");
      out.write("        }\r\n");
      out.write(" \r\n");
      out.write("		.seat form input :nth-of-type(5n) {margin-right: 0;}\r\n");
      out.write("		.seat form input:hover {background-color: #543310; color: white;}\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("		.seat form input.booked {cursor:not-allowed; background-color: #666; pointer-events: none; color: gray;}\r\n");
      out.write("		.seat form input.booked:hover {color: #999;}\r\n");
      out.write("		.seat form input.booked.plug {cursor:not-allowed; background-color: #666; pointer-events: none; color: gray;}\r\n");
      out.write("		.seat form input.booked.plug:hover {color: #999;}\r\n");
      out.write("		.seat form input.blank {margin-right: 13.7142%;}\r\n");
      out.write("		.seat form input:nth-child() {margin-bottom: 30px;}\r\n");
      out.write("		.seat form input.plug {background: url(../images/plug.png) no-repeat; background-size: 40%; background-position-x: right; background-position-y: bottom; background-color: burlywood;}\r\n");
      out.write("		.seat form input.plug:hover {background-color: #543310; color: white;}\r\n");
      out.write("\r\n");
      out.write("        .bottom {\r\n");
      out.write("            width: 90%;\r\n");
      out.write("            margin: 20px auto;\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            border-top: 4px solid #AF8F6F;\r\n");
      out.write("            padding-top: 25px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("		.bottom #selectMenu {width: 30%;}\r\n");
      out.write("		.bottom #person {width: 20%;}\r\n");
      out.write("\r\n");
      out.write("        .storename {\r\n");
      out.write("            font-size: 200%;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .storeinfo {\r\n");
      out.write("            padding-top: 10%;\r\n");
      out.write("            margin-bottom: 90px;\r\n");
      out.write("        }\r\n");
      out.write("		@font-face {\r\n");
      out.write("			font-family: 'Paperlogy-8ExtraBold';\r\n");
      out.write("			src: url('https://fastly.jsdelivr.net/gh/projectnoonnu/2408-3@1.0/Paperlogy-8ExtraBold.woff2') format('woff2');\r\n");
      out.write("			font-weight: 800;\r\n");
      out.write("			font-style: normal;\r\n");
      out.write("		}\r\n");
      out.write("		body{\r\n");
      out.write("			font-family: 'Paperlogy-8ExtraBold';\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.panel{\r\n");
      out.write("			background-color: #F8F4E1;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"is-preload\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/dev.css\" />\r\n");
      out.write("<header>\r\n");
      out.write("	<div style=\"position: sticky; top: 0;\">\r\n");
      out.write("		<table>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>이름</th>\r\n");
      out.write("					<th>번호</th>\r\n");
      out.write("					<th>메일</th>\r\n");
      out.write("					<th>상태</th>\r\n");
      out.write("					<th>인증</th>\r\n");
      out.write("					<th>권한</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${info.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("					<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${info.tel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("					<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${info.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("					<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${info.ing}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("					<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${auth}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("					<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</div> \r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- Wrapper-->\r\n");
      out.write("		<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav -->\r\n");
      out.write("			");
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
      out.write("			\r\n");
      out.write("			<!-- Main -->\r\n");
      out.write("			<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("				<!-- CafeSeat -->\r\n");
      out.write("				<article id=\"cafeseat\" class=\"panel\">\r\n");
      out.write("					\r\n");
      out.write("					<!-- 상단부 -->\r\n");
      out.write("					<h1 class=\"storename\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"storeinfo\">\r\n");
      out.write("						<h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("						<h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.tel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("						<h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("						<h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.lotAddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<!-- 좌석 선택 -->\r\n");
      out.write("	                <div class=\"seat\">\r\n");
      out.write("	                    <form id=\"seatForm\" method=\"POST\" action=\"/cafe/seat/selectseat.do\">\r\n");
      out.write("	                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	                        <!-- 하단부 -->\r\n");
      out.write("	                        <div class=\"bottom\">\r\n");
      out.write("	                            <input type=\"number\" name=\"count\" id=\"person\" min=\"1\" max=\"4\" value=\"1\" placeholder=\"인원 수\">\r\n");
      out.write("	                            <input type=\"submit\" value=\"메뉴선택\" id=\"selectMenu\">\r\n");
      out.write("	                            <input type=\"hidden\" id=\"selectedSeats\" name=\"selectedSeats\">\r\n");
      out.write("	                        </div>\r\n");
      out.write("	                    </form>\r\n");
      out.write("	                </div>\r\n");
      out.write("\r\n");
      out.write("				</article>\r\n");
      out.write("\r\n");
      out.write("				<!-- Mypage -->\r\n");
      out.write("				<article id=\"mypage\" class=\"panel\"></article>\r\n");
      out.write("							\r\n");
      out.write("				<!-- Login -->\r\n");
      out.write("				<article id=\"login\" class=\"panel\"></article>					\r\n");
      out.write("			</div>\r\n");
      out.write("					\r\n");
      out.write("\r\n");
      out.write("			<!-- Footer -->\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("	<ul class=\"copyright\">\r\n");
      out.write("		<li>&copy; SIST-SideProject</li>\r\n");
      out.write("		<li>MEMBER : 김유진 김유리 이우진 장지윤 전상수</li>\r\n");
      out.write("	</ul>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- Scripts -->\r\n");
      out.write("		<script src=\"../assets/js/browser.min.js\"></script>\r\n");
      out.write("		<script src=\"../assets/js/jquery.min.js\"></script>\r\n");
      out.write("		<script src=\"../assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("		<script src=\"../assets/js/util.js\"></script>\r\n");
      out.write("		<script src=\"../assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			$(document).ready(function() {\r\n");
      out.write("				let selectedSeats = []; // 좌석을 여러 개 선택할 경우를 위해 배열로\r\n");
      out.write("				let maxSeats = 0; //최대 선택가능 좌석\r\n");
      out.write("				maxSeats = parseInt($('#person').val()) || 0; // 입력된 숫자를 가져옴\r\n");
      out.write("\r\n");
      out.write("				$('#person').on('input', function() {\r\n");
      out.write("					maxSeats = parseInt($(this).val()) || 0; // 입력값 변경 시 maxSeats 업데이트\r\n");
      out.write("				});\r\n");
      out.write("\r\n");
      out.write("				$('.seatButton').click(function() {\r\n");
      out.write("					const seatValue = $(this).val();\r\n");
      out.write("					const selectColor = '#543310'; // 선택했을 때 색\r\n");
      out.write("					const selected = '5px 5px 10px -5px inset'; // 선택했을 때 그림자\r\n");
      out.write("					const selectedFont = 'white'; // 선택했을 떄 글자 색\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					if (selectedSeats.includes(seatValue)) {\r\n");
      out.write("						selectedSeats = selectedSeats.filter(seat => seat !== seatValue); // 배열에서 제거\r\n");
      out.write("						$(this).css('background-color', ''); // 원래 배경색으로 돌아감\r\n");
      out.write("						$(this).css('box-shadow', ''); // 원래 그림자로 돌아감\r\n");
      out.write("						$(this).css('color', ''); //원래 글자 색\r\n");
      out.write("					} else {\r\n");
      out.write("						if (selectedSeats.length < maxSeats) { // 선택한 좌석 수가 최대 좌석 수보다 적은 경우\r\n");
      out.write("							selectedSeats.push(seatValue);\r\n");
      out.write("							$(this).css('background-color', selectColor); // 선택 시 배경색 변경\r\n");
      out.write("							$(this).css('box-shadow', selected); // 선택 시 그림자 변경\r\n");
      out.write("							$(this).css('color', selectedFont); // 선택 시 글자색 변경\r\n");
      out.write("						} else {\r\n");
      out.write("							alert(\"최대 \" + maxSeats + \" 개의 좌석만 선택할 수 있습니다.\"); // 최대 좌석 수 초과 알림\r\n");
      out.write("						}\r\n");
      out.write("					}\r\n");
      out.write("					\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				$('#seatForm').on('submit', function(event) {\r\n");
      out.write("			        if (selectedSeats.length === 0) {\r\n");
      out.write("			            alert(\"좌석을 선택하세요.\");\r\n");
      out.write("			            return false;\r\n");
      out.write("			        }\r\n");
      out.write("\r\n");
      out.write("			        // 선택된 좌석을 hidden input으로 설정\r\n");
      out.write("			        $('#selectedSeats').val(selectedSeats.join(',')); // 배열을 문자열로 변환\r\n");
      out.write("			    });\r\n");
      out.write("				\r\n");
      out.write("			});\r\n");
      out.write("\r\n");
      out.write("		</script>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/seat/selectseat.jsp(123,25) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("seat");
      // /WEB-INF/views/seat/selectseat.jsp(123,25) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/seat/selectseat.jsp(123,25) '${seatDetails}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${seatDetails}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("	                            <input type=\"button\" \r\n");
            out.write("	                                   value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seat.seatId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" \r\n");
            out.write("	                                   class=\"seatButton ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seat.status}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(' ');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seat.status == 'booked' ? 'disabled' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(' ');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seat.outlet == 1 ? 'plug' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" \r\n");
            out.write("	                                   />\r\n");
            out.write("	                        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
