/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-06-13 03:02:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Bailan??????????????????</title>\r\n");
      out.write("    <link rel=\"Shortcut Icon\" href=\"icon/all.png\" />\r\n");
      out.write("    <!-- Meta tag Keywords -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <meta name=\"keywords\" content=\"XMall?????????????????? v1.0,XMall,XMall??????????????????????????????\">\r\n");
      out.write("    <meta name=\"description\" content=\"XMall?????????????????? v1.0??????????????????????????????????????????????????????CMS???????????????\">\r\n");
      out.write("    <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\r\n");
      out.write("    function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("    <!-- Meta tag Keywords -->\r\n");
      out.write("\r\n");
      out.write("    <!-- css files -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"lib/login/style.css\" type=\"text/css\" media=\"all\" /> <!-- Style-CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"lib/login/font-awesome.css\"> <!-- Font-Awesome-Icons-CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"lib/layer/2.4/skin/layer.css\"> <!-- Font-Awesome-Icons-CSS -->\r\n");
      out.write("\r\n");
      out.write("    <!-- js -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/jquery/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/login/jquery.vide.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/layer/2.4/layer.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/jquery.validate.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/validate-methods.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/gt.js\"></script>\r\n");
      out.write("    <!-- Hotjar Tracking Code for http://xmadmin.exirck.cn -->\r\n");
      out.write("    <script>\r\n");
      out.write("        (function(h,o,t,j,a,r){\r\n");
      out.write("            h.hj=h.hj||function(){(h.hj.q=h.hj.q||[]).push(arguments)};\r\n");
      out.write("            h._hjSettings={hjid:695920,hjsv:6};\r\n");
      out.write("            a=o.getElementsByTagName('head')[0];\r\n");
      out.write("            r=o.createElement('script');r.async=1;\r\n");
      out.write("            r.src=t+h._hjSettings.hjid+j+h._hjSettings.hjsv;\r\n");
      out.write("            a.appendChild(r);\r\n");
      out.write("        })(window,document,'https://static.hotjar.com/c/hotjar-','.js?sv=');\r\n");
      out.write("    </script>\r\n");
      out.write("    <script>\r\n");
      out.write("        var _hmt = _hmt || [];\r\n");
      out.write("        (function() {\r\n");
      out.write("            var hm = document.createElement(\"script\");\r\n");
      out.write("            hm.src = \"https://hm.baidu.com/hm.js?90194188523e0a2d04ad3ad170c83f30\";\r\n");
      out.write("            var s = document.getElementsByTagName(\"script\")[0];\r\n");
      out.write("            s.parentNode.insertBefore(hm, s);\r\n");
      out.write("        })();\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .title,h6{\r\n");
      out.write("            font-family: \"??????\";\r\n");
      out.write("        }\r\n");
      out.write("        .layui-layer-title {\r\n");
      out.write("            padding-right: 305px;\r\n");
      out.write("            font-family:\"Microsoft Yahei\"\r\n");
      out.write("        }\r\n");
      out.write("        .layui-layer-dialog .layui-layer-content{\r\n");
      out.write("            font-family:\"Microsoft Yahei\"\r\n");
      out.write("        }\r\n");
      out.write("        .layui-layer-btn{\r\n");
      out.write("            font-family:\"Microsoft Yahei\"\r\n");
      out.write("        }\r\n");
      out.write("        span.icon1 {\r\n");
      out.write("            top: 23%;\r\n");
      out.write("        }\r\n");
      out.write("        span.icon2 {\r\n");
      out.write("            top: 42%;\r\n");
      out.write("        }\r\n");
      out.write("        #wait {\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            font-family: \"??????\";\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- main -->\r\n");
      out.write("<div data-vide-bg=\"lib/video/Ipad\">\r\n");
      out.write("    <div class=\"center-container\">\r\n");
      out.write("        <!--header-->\r\n");
      out.write("        <div class=\"header-w3l\">\r\n");
      out.write("            <h1>Bailan<span class=\"title\">??????????????????</span></h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--//header-->\r\n");
      out.write("        <div class=\"main-content-agile\">\r\n");
      out.write("            <div class=\"sub-main-w3\">\r\n");
      out.write("                <div class=\"wthree-pro\">\r\n");
      out.write("                    <h2>Login Here</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form id=\"login\" action=\"\" method=\"post\" width=\"100%\">\r\n");
      out.write("                    <input placeholder=\"?????????\" name=\"username\" id=\"username\" class=\"user\" type=\"text\" required=\"\">\r\n");
      out.write("                    <span class=\"icon1\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i></span><br><br>\r\n");
      out.write("                    <input  placeholder=\"??????\" name=\"password\" id=\"password\" class=\"pass\" type=\"password\" required=\"\">\r\n");
      out.write("                    <span class=\"icon2\"><i class=\"fa fa-unlock\" aria-hidden=\"true\"></i></span><br><br>\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"captcha\">\r\n");
      out.write("                        <p id=\"wait\" class=\"show\">?????????????????????...</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"sub-w3l\">\r\n");
      out.write("                        <h6 onclick=\"forgetPass()\" style=\"cursor: pointer\"><a>?????????????????????????</a></h6>\r\n");
      out.write("                        <div class=\"right-w3l\">\r\n");
      out.write("                            <input id=\"loginButton\" type=\"button\" class=\"login\" value=\"??????\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--//main-->\r\n");
      out.write("\r\n");
      out.write("        <!--footer-->\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <p>&copy; 2017 XMall. All rights reserved | Design by <a href=\"http://blog.exrick.cn\" target=\"_blank\">Exrick</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--//footer-->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    var handler = function (captchaObj) {\r\n");
      out.write("        captchaObj.appendTo('#captcha');\r\n");
      out.write("        captchaObj.onReady(function () {\r\n");
      out.write("            $(\"#wait\").hide();\r\n");
      out.write("        });\r\n");
      out.write("        $('#loginButton').click(function () {\r\n");
      out.write("            $(\"#loginButton\").val(\"?????????...\");\r\n");
      out.write("            $(\"#loginButton\").attr(\"disabled\",\"disabled\");\r\n");
      out.write("            var name=$(\"#username\").val();\r\n");
      out.write("            var pass=$(\"#password\").val();\r\n");
      out.write("            if(name==\"\"||pass==\"\"){\r\n");
      out.write("                layer.msg(\"??????????????????????????????\");\r\n");
      out.write("                $(\"#loginButton\").val(\"??????\");\r\n");
      out.write("                $(\"#loginButton\").removeAttr(\"disabled\");\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("            var reg = /^[0-9A-Za-z]+$/;\r\n");
      out.write("            if(!reg.exec(name))\r\n");
      out.write("            {\r\n");
      out.write("                layer.msg(\"?????????????????????\");\r\n");
      out.write("                $(\"#loginButton\").val(\"??????\");\r\n");
      out.write("                $(\"#loginButton\").removeAttr(\"disabled\");\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("            var result = captchaObj.getValidate();\r\n");
      out.write("            if (!result) {\r\n");
      out.write("                layer.msg(\"???????????????\");\r\n");
      out.write("                $(\"#loginButton\").val(\"??????\");\r\n");
      out.write("                $(\"#loginButton\").removeAttr(\"disabled\");\r\n");
      out.write("                return ;\r\n");
      out.write("            }\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: '/user/login?t=' + (new Date()).getTime(), // ????????????????????????\r\n");
      out.write("                type: 'POST',\r\n");
      out.write("                dataType: 'json',\r\n");
      out.write("                data: {\r\n");
      out.write("                    username: name,\r\n");
      out.write("                    password: pass,\r\n");
      out.write("                    challenge: result.geetest_challenge,\r\n");
      out.write("                    validate: result.geetest_validate,\r\n");
      out.write("                    seccode: result.geetest_seccode\r\n");
      out.write("                },\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    if(data.success==true){\r\n");
      out.write("                        window.location.href=\"/\";\r\n");
      out.write("                    }else{\r\n");
      out.write("                        layer.msg(data.message);\r\n");
      out.write("                        captchaObj.reset();\r\n");
      out.write("                        $(\"#loginButton\").val(\"??????\");\r\n");
      out.write("                        $(\"#loginButton\").removeAttr(\"disabled\");\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                error:function(XMLHttpRequest){\r\n");
      out.write("                layer.alert('??????????????????! ?????????:'+XMLHttpRequest.status+' ????????????:'+JSON.parse(XMLHttpRequest.responseText).message,{title: '????????????',icon: 2});\r\n");
      out.write("                $(\"#loginButton\").val(\"??????\");\r\n");
      out.write("                $(\"#loginButton\").removeAttr(\"disabled\");\r\n");
      out.write("            }\r\n");
      out.write("            });\r\n");
      out.write("        })\r\n");
      out.write("        window.gt = captchaObj;\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url: '/geetestInit?t=' + (new Date()).getTime(), // ????????????????????????\r\n");
      out.write("        type: \"GET\",\r\n");
      out.write("        dataType: 'json',\r\n");
      out.write("        success: function (data) {\r\n");
      out.write("            initGeetest({\r\n");
      out.write("                gt: data.gt,\r\n");
      out.write("                challenge: data.challenge,\r\n");
      out.write("                new_captcha: data.new_captcha, // ?????????????????????????????????????????????\r\n");
      out.write("                offline: !data.success, // ???????????????????????????????????????????????????????????????????????????\r\n");
      out.write("                product: \"popup\", // ????????????????????????float???popup\r\n");
      out.write("                width: \"100%\"\r\n");
      out.write("            }, handler);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function forgetPass(){\r\n");
      out.write("        layer.alert('???????????????????????????test | test', {\r\n");
      out.write("            icon: 4,\r\n");
      out.write("            title: \"??????\"\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url:\"/sys/base\",\r\n");
      out.write("        type: 'GET',\r\n");
      out.write("        success:function (data) {\r\n");
      out.write("            if(data.success!=true){\r\n");
      out.write("                layer.alert(data.message,{title: '????????????',icon: 2});\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("            if(data.result.hasLogNotice==1){\r\n");
      out.write("                layer.alert(data.result.logNotice, {\r\n");
      out.write("                    title: \"??????\"\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        error:function(XMLHttpRequest){\r\n");
      out.write("            layer.alert('??????????????????! ?????????:'+XMLHttpRequest.status,{title: '????????????',icon: 2});\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}
