/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2021-04-07 05:33:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.page.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IG_005fManageHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/page/common/IG_Scheme.jsp", Long.valueOf(1600309886000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write(' ');
      out.write(' ');
      out.write('\n');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\"/>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=10\">   \n");
      out.write("    \n");
      out.write("    <!-- Demo page code -->\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function() {\n");
      out.write("            var match = document.cookie.match(new RegExp('color=([^;]+)'));\n");
      out.write("            if(match) var color = match[1];\n");
      out.write("            if(color) {\n");
      out.write("                $('body').removeClass(function (index, css) {\n");
      out.write("                    return (css.match (/\\btheme-\\S+/g) || []).join(' ')\n");
      out.write("                })\n");
      out.write("                $('body').addClass('theme-' + color);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $('[data-popover=\"true\"]').popover({html: true});\n");
      out.write("            \n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        #line-chart {\n");
      out.write("            height:300px;\n");
      out.write("            width:800px;\n");
      out.write("            margin: 0px auto;\n");
      out.write("            margin-top: 1em;\n");
      out.write("        }\n");
      out.write("        .navbar-default .navbar-brand, .navbar-default .navbar-brand:hover { \n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function() {\n");
      out.write("            var uls = $('.sidebar-nav > ul > *').clone();\n");
      out.write("            uls.addClass('visible-xs');\n");
      out.write("            $('#main-menu').append(uls.clone());\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    <!-- Le fav and touch icons -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../assets/ico/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"../assets/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"../assets/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"../assets/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"../assets/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!--[if lt IE 7 ]> <body class=\"ie ie6\"> <![endif]-->\n");
      out.write("  <!--[if IE 7 ]> <body class=\"ie ie7 \"> <![endif]-->\n");
      out.write("  <!--[if IE 8 ]> <body class=\"ie ie8 \"> <![endif]-->\n");
      out.write("  <!--[if IE 9 ]> <body class=\"ie ie9 \"> <![endif]-->\n");
      out.write("  <!--[if (gt IE 9)|!(IE)]><!--> \n");
      out.write("   \n");
      out.write("  <!--<![endif]-->\n");
      out.write("\n");
      out.write("    <div class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"\" href=\"javascript:void(0)\"><span class=\"navbar-brand\"><span class=\"fa fa-paper-plane\"></span>家政服务管理系统</span></a></div>\n");
      out.write("\n");
      out.write("        <div class=\"navbar-collapse collapse\" style=\"height: 1px;\">\n");
      out.write("          <ul id=\"main-menu\" class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li class=\"dropdown hidden-xs\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-user padding-right-small\" style=\"position:relative;top: 3px;\"></span> 欢迎您,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.cspUser.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" 用户\n");
      out.write("                    <!-- <i class=\"fa fa-caret-down\"></i> -->\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"web/visitor/toLogin\">首页</a></li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li><a tabindex=\"-1\" href=\"web/manage/logout\">退出</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("                <li class=\"dropdown hidden-xs\">\n");
      out.write("                <a href=\"web/manage/logout\" class=\"dropdown-toggle\" >\n");
      out.write("                    <span class=\"glyphicon glyphicon-user padding-right-small\" style=\"position:relative;top: 3px;\"></span> 退出\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/page/common/IG_ManageHeader.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("userId");
    // /WEB-INF/page/common/IG_ManageHeader.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/page/common/IG_ManageHeader.jsp(4,0) '${cspUsers.id}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${cspUsers.id}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
