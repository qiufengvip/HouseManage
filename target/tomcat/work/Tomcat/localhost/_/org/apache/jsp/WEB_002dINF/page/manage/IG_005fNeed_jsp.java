/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2021-04-07 05:33:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.page.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IG_005fNeed_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/page/common/IG_Scheme.jsp", Long.valueOf(1600309886000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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

      out.write('\n');
      out.write('\n');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html lang=\"en\"><head>\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>????????????</title>\n");
      out.write("    <meta content=\"IE=edge,chrome=1\" http-equiv=\"X-UA-Compatible\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <link href='IG_Public/stylesheets/base.css' rel='stylesheet' type='text/css'>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"IG_Public/lib/bootstrap/css/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"IG_Public/lib/font-awesome/css/font-awesome.css\">\n");
      out.write("     <script src=\"IG_Public/lib/iview/vue.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"IG_Public/lib/iview/iview.css\">\n");
      out.write("    <script src=\"IG_Public/lib/iview/iview.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"IG_Public/lib/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("     <script type=\"text/javascript\" src=\"IG_Public/script/IG_Need.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"IG_Public/lib/layer/layer.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"IG_Public/lib/laydate/laydate.js\"></script>\n");
      out.write("    <script src=\"IG_Public/lib/jQuery-Knob/js/jquery.knob.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function() {\n");
      out.write("            $(\".knob\").knob();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"IG_Public/stylesheets/theme.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"IG_Public/stylesheets/premium.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\" theme-blue\">\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/page/common/IG_ManageHeader.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/page/common/IG_LeftMenu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("             <div class=\"header\">\n");
      out.write("            \n");
      out.write("            <h1 class=\"page-title\">????????????</h1>\n");
      out.write("                    <ul class=\"breadcrumb\">\n");
      out.write("            <li><a href=\"javascript:void(0)\">??????</a> </li>\n");
      out.write("            <li class=\"active\">????????????</li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \t\t\n");
      out.write("      <div class=\"btn-toolbar list-toolbar\">\n");
      out.write("     \n");
      out.write("      <div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-lg-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"button\">??????</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" placeholder=\"???????????????\"\tid=\"name\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-lg-4\">\n");
      out.write("\t\t\t\t\t\t\t\t <button class=\"btn btn-primary\" onclick=\"search()\"><i class=\"fa fa-search\"></i>??????</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t <input style=\"display:none\"  id=\"userType\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cspUser.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">\n");
      out.write("        <input style=\"display:none\"  id=\"userId\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cspUser.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">\n");
      out.write("      </div>  \t\n");
      out.write("        <div class=\"contant\" id=\"vueBox\" v-cloak>\n");
      out.write("\t\t\t\t<div class=\"tbDiv\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t  <i-table border stripe :columns=\"columns1\" :data=\"data1\"></i-table>\n");
      out.write("                  <Page :total=\"total\" :current=\"param.page\" :page-size=\"param.rows\" @on-change=\"changePageNum\" show-total show-elevator></Page>\n");
      out.write("                 </div>\n");
      out.write("            <Modal v-model=\"detailModel\"   scrollable=\"true\" title=\"????????????\" @on-ok=\"save\" >\n");
      out.write("                      <i-form v-model=\"detailform\" label-position=\"center\" :label-width=\"100\">     \n");
      out.write("              <Form-item label=\"??????????????????:\">\n");
      out.write("\t\t\t\t\t        <select id=\"modalclassId\"   v-model=\"classId\" :value=\"classId\"  style=\"width:380px;border:1px solid #dddee1;padding:5px;border-radius:4px;font-size:14px;\" >\n");
      out.write("\t\t\t\t\t\t  <Option v-for=\"item in  classList\" :value=\"item.id\" :key=\"item.id\">\n");
      out.write("\t\t\t\t\t\t{{item.name }}</Option>\n");
      out.write("\t\t\t\t\t      </select>\n");
      out.write("\t\t\t\t\t   \n");
      out.write("                                     </Form-item>   \n");
      out.write("                                        <Form-item label=\"??????:\">\n");
      out.write("\t\t\t\t\t        <select id=\"modallevelId\"   v-model=\"levelId\" :value=\"levelId\"  style=\"width:380px;border:1px solid #dddee1;padding:5px;border-radius:4px;font-size:14px;\" >\n");
      out.write("\t\t\t\t\t\t  <Option v-for=\"item in  levelList\" :value=\"item.id\" :key=\"item.id\">\n");
      out.write("\t\t\t\t\t\t{{item.name }}</Option>\n");
      out.write("\t\t\t\t\t      </select>\n");
      out.write("\t\t\t\t\t   \n");
      out.write("                                     </Form-item>\n");
      out.write("                                    \n");
      out.write("               <Form-item label=\"??????:\">\n");
      out.write("\t\t\t\t\t        <select id=\"modallevelId\"   v-model=\"expericeId\" :value=\"expericeId\"  style=\"width:380px;border:1px solid #dddee1;padding:5px;border-radius:4px;font-size:14px;\" >\n");
      out.write("\t\t\t\t\t\t  <Option v-for=\"item in  expericeList\" :value=\"item.id\" :key=\"item.id\">\n");
      out.write("\t\t\t\t\t\t{{item.name }}</Option>\n");
      out.write("\t\t\t\t\t      </select>\n");
      out.write("\t\t\t\t\t   \n");
      out.write("                                     </Form-item>\n");
      out.write("                                       <Form-item label=\"??????:\">\n");
      out.write("\t\t\t\t\t        <select id=\"modallevelId\"   v-model=\"educationId\" :value=\"educationId\"  style=\"width:380px;border:1px solid #dddee1;padding:5px;border-radius:4px;font-size:14px;\" >\n");
      out.write("\t\t\t\t\t\t  <Option v-for=\"item in  educationList\" :value=\"item.id\" :key=\"item.id\">\n");
      out.write("\t\t\t\t\t\t{{item.name }}</Option>\n");
      out.write("\t\t\t\t\t      </select>\n");
      out.write("\t\t\t\t\t   \n");
      out.write("                                     </Form-item>\n");
      out.write("                                       <Form-item label=\"??????:\">\n");
      out.write("\t\t\t\t\t        <select id=\"modallevelId\"   v-model=\"abilityId\" :value=\"abilityId\"  style=\"width:380px;border:1px solid #dddee1;padding:5px;border-radius:4px;font-size:14px;\" >\n");
      out.write("\t\t\t\t\t\t  <Option v-for=\"item in  abilityList\" :value=\"item.id\" :key=\"item.id\">\n");
      out.write("\t\t\t\t\t\t{{item.name }}</Option>\n");
      out.write("\t\t\t\t\t      </select>\n");
      out.write("\t\t\t\t\t   \n");
      out.write("                                     </Form-item>\n");
      out.write("                                       <Form-item label=\"??????:\">\n");
      out.write("\t\t\t\t\t        <select id=\"modallevelId\"   v-model=\"ageId\" :value=\"ageId\"  style=\"width:380px;border:1px solid #dddee1;padding:5px;border-radius:4px;font-size:14px;\" >\n");
      out.write("\t\t\t\t\t\t  <Option v-for=\"item in  ageList\" :value=\"item.id\" :key=\"item.id\">\n");
      out.write("\t\t\t\t\t\t{{item.name }}</Option>\n");
      out.write("\t\t\t\t\t      </select>\n");
      out.write("\t\t\t\t\t   \n");
      out.write("                                     </Form-item>\n");
      out.write("                                     <Form-item label=\"??????:\">\n");
      out.write("\t\t\t\t\t        <select id=\"modalpriceId\"   v-model=\"priceId\" :value=\"priceId\"  style=\"width:380px;border:1px solid #dddee1;padding:5px;border-radius:4px;font-size:14px;\" >\n");
      out.write("\t\t\t\t\t\t  <Option v-for=\"item in  priceList\" :value=\"item.id\" :key=\"item.id\">\n");
      out.write("\t\t\t\t\t\t{{item.name }}</Option>\n");
      out.write("\t\t\t\t\t      </select>\n");
      out.write("\t\t\t\t\t   \n");
      out.write("                                     </Form-item>\n");
      out.write("                                  \n");
      out.write("                                      <Form-item label=\"??????:\">\n");
      out.write("                   <Select v-model=\"provinceCode\" placeholder=\"???????????????\" @change=\"changeProvince\"  style=\"width:380px;border:1px solid #dddee1;padding:5px;border-radius:4px;font-size:14px;\">\n");
      out.write("                   <Option v-for=\"(item,index) in provinceList\" :key=\"item.provinceCode\" :value=\"item.provinceCode\" >{{ item.name }}</Option>\n");
      out.write("                  </Select>\n");
      out.write("               </Form-item>\n");
      out.write("                 <Form-item  label=\"??????:\">\n");
      out.write("               <Select v-model=\"cityCode\" placeholder=\"???????????????\" @change=\"changeCity\"  style=\"width:380px;border:1px solid #dddee1;padding:5px;border-radius:4px;font-size:14px;\">\n");
      out.write("              <Option v-for=\"(item,index) in citiesList\" :key=\"item.cityCode\" :value=\"item.cityCode\" >{{ item.name }}</Option>\n");
      out.write("               </Select>\n");
      out.write("             </Form-item>\n");
      out.write("              <Form-item  label=\"??????:\">\n");
      out.write("            <Select v-model=\"areaCode\" placeholder=\"???????????????\"  style=\"width:380px;border:1px solid #dddee1;padding:5px;border-radius:4px;font-size:14px;\">\n");
      out.write("              <Option v-for=\"(item,index) in countyList\" :key=\"item.areaCode\" :value=\"item.areaCode\" >{{ item.name }}</Option>\n");
      out.write("            </Select>\n");
      out.write("             </Form-item>\n");
      out.write("   \n");
      out.write("  \n");
      out.write("                                      </i-form>\n");
      out.write("                           <div slot=\"footer\">\n");
      out.write("                            <button class=\"esayui-linkbutton\" style=\"margin-left:40px\"onclick=\"saveinfo()\">??????</button>\n");
      out.write("\t\t</div>\n");
      out.write("                                     </Modal>\n");
      out.write("      \n");
      out.write("                    <Modal v-model=\"commentModel\" width=\"1000\" height=\"1000\" draggable scrollable title=\"????????????\" @on-ok=\"saveComentInfo\" >\n");
      out.write("                                      <i-form v-model=\"commentform\" label-position=\"center\" :label-width=\"100\">  \n");
      out.write("                                     \n");
      out.write("                               <textarea id=\"comment\" rows=\"30\" cols=\"150\"> </textarea>\n");
      out.write("                                 \n");
      out.write("                           </i-form>\n");
      out.write("                           <div slot=\"footer\">\n");
      out.write("                            <button class=\"esayui-linkbutton\" style=\"margin-left:40px\"onclick=\"saveComment()\">??????</button>\n");
      out.write("\t\t</div>\n");
      out.write("                 </Modal>\n");
      out.write("                  <Modal v-model=\"detailCommentModel\"  draggable scrollable title=\"????????????\"  >\n");
      out.write("                                     \n");
      out.write("                               <div id=\"detailComment\" ></div>\n");
      out.write("                 </Modal>\n");
      out.write("                   <Modal v-model=\"detailcutomermodel\"  draggable scrollable title=\"????????????\"  >\n");
      out.write("                                                                                          ?????????: <div id=\"customerphone\" ></div>   \n");
      out.write("                                                                                          ??????: <img id=\"customerphotourl\" >\n");
      out.write("                 </Modal>\n");
      out.write("                  <Modal v-model=\"detailnursemodel\"  draggable scrollable title=\"????????????\"  >\n");
      out.write("                                                                                ?????????:<div id=\"nursephone\" ></div>       \n");
      out.write("                                                                                ??????: <img id=\"nursephotourl\" >\n");
      out.write("                 </Modal>\n");
      out.write("              \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("          <div style=\"display:none;text-align:center;padding-top:100px;\" id=\"paycontent\" >\n");
      out.write("            <div style=\"margin-right:30px;\">\n");
      out.write("             <label class=\"remember-me\">???????????????</label>\n");
      out.write("\t\t\t<input type=\"number\" name=\"paymoney\" id=\"paymoney\" \n");
      out.write("\t\t\t placeholder=\"?????????????????????\"\n");
      out.write("\t\t\t\t>\n");
      out.write("           </div>\n");
      out.write("\t\t <div style=\"margin-left:50px;\">\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("         </div>\n");
      out.write("           <div style=\"display:none;text-align:center;padding-top:100px;\" id=\"Server\" >\n");
      out.write("            <div style=\"margin-right:30px;\">\n");
      out.write("             <label class=\"remember-me\">?????????????????????????????????</label>\n");
      out.write("\t\t\t  <select id=\"checkServer\">\n");
      out.write("\t\t  <option value=\"1\" selected=\"selected\">??????</option>\n");
      out.write("\t\t     <option value=\"0\">??????</option>\n");
      out.write("\t\t  \n");
      out.write("\t         </select>\n");
      out.write("           </div>\n");
      out.write("\t\t <div style=\"margin-left:50px;\">\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/page/common/IG_Footer.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("  \n");
      out.write("</body></html>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".file-list{\n");
      out.write("list-style: none;\n");
      out.write("}\n");
      out.write("  [v-cloak] {\n");
      out.write("\n");
      out.write("    display: none;\n");
      out.write("\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/page/manage/IG_Need.jsp(72,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cspUser.type ne 1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<button style=\"margin-left:20px\"  class=\"esayui-linkbutton\" onclick=\"add()\"><i class=\"fa fa-plus\"></i>??????</button>   \n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
