/*
 * JSP generated by Resin-3.0.8 (built Tue, 08 Jun 2004 02:25:40 PDT)
 */

package _jsp._web;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class _index__jsp extends com.caucho.jsp.JavaPage{
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.Application _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = com.caucho.jsp.QJspFactory.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true);
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html;charset=gb2312");
    request.setCharacterEncoding("GB2312");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      Connection con;
Statement stmt;
ResultSet rs;
Class.forName("com.mysql.jdbc.Driver");
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
String dbUrl="jdbc:mysql://localhost:3306/laba?useUnicode=true&characterEncoding=GB2312";
String dbUser="root";
String dbPwd="1982o7o9";
con=java.sql.DriverManager.getConnection(dbUrl,dbUser,dbPwd);
stmt=con.createStatement();

      out.write(_jsp_string1, 0, _jsp_string1.length);
      String memid = (String)request.getParameter("id");
rs=stmt.executeQuery("SELECT * from qyml where id='"+memid+"'");
rs.next();

      out.write(_jsp_string2, 0, _jsp_string2.length);
      out.print((rs.getString("qymc")));
      out.write(_jsp_string3, 0, _jsp_string3.length);
      
stmt = con.createStatement() ;
String sql2="SELECT * from web where memid='"+memid+"'";
ResultSet rs2=stmt.executeQuery(sql2) ;
rs2.next();

      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((rs2.getString("css")));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((rs2.getString("memid")));
      out.write(_jsp_string6, 0, _jsp_string6.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      com.caucho.jsp.QJspFactory.freePageContext(pageContext);
    }
  }

  private com.caucho.java.LineMap _caucho_line_map;
  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.make.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.util.CauchoSystem.getVersionId() != 1174304630)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.make.Dependency depend;
      depend = (com.caucho.make.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public com.caucho.java.LineMap _caucho_getLineMap()
  {
    return _caucho_line_map;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.java.LineMap lineMap,
                   com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    _caucho_line_map = new com.caucho.java.LineMap("_index__jsp.java", "foo");
    _caucho_line_map.add("/web/../conn/conn.jsp", 6, 32);
    _caucho_line_map.add("/web/index.jsp", 3, 44);
    _caucho_line_map.add(12, 49);
    _caucho_line_map.add(14, 51);
    _caucho_line_map.add(23, 58);
    _caucho_line_map.add(23, 60);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("web/index.jsp"), "H4/MHmmIb5jWyYPaQ+x4GQ==", false);
    _caucho_depends.add(depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("conn/conn.jsp"), "Y8eOeqaPTEc4uE5RVs4RUg==", false);
    _caucho_depends.add(depend);
  }

  private final static char []_jsp_string0;
  private final static char []_jsp_string4;
  private final static char []_jsp_string3;
  private final static char []_jsp_string2;
  private final static char []_jsp_string6;
  private final static char []_jsp_string1;
  private final static char []_jsp_string5;
  static {
    _jsp_string0 = "\r\n\r\n<link rel=\"stylesheet\" href=\"../conn/laba.css\" type=\"text/css\">\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string4 = "\r\n\r\n<frameset framespacing=\"0\" border=\"0\" rows=\"0,*\" frameborder=\"0\">\r\n<frame name=\"header\" scrolling=\"no\" noresize target=\"main\" src=\"title.htm\">\r\n<frame name=\"main\" src=\"".toCharArray();
    _jsp_string3 = "</title>\r\n\r\n".toCharArray();
    _jsp_string2 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n</head>\r\n\r\n<title>".toCharArray();
    _jsp_string6 = "\" scrolling=\"auto\">\r\n<noframes>\r\n<body>\r\n<p>\u6b64\u7f51\u9875\u4f7f\u7528\u4e86\u6846\u67b6\uff0c\u4f46\u60a8\u7684\u6d4f\u89c8\u5668\u4e0d\u652f\u6301\u6846\u67b6\u3002</p>\r\n</body>\r\n</noframes>\r\n</frameset>\r\n</html>".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string5 = "/index.jsp?id=".toCharArray();
  }
}
