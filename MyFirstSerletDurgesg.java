package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFirstSerletDurgesg implements Servlet{

public void init(ServletConfig Config) throws ServletException
{	
}
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h1> this is my first servlet durgesh</h1>");
	out.println("</body>");
	out.println("<html>");	
}
public void destroy()
 {
}
public  ServletConfig getServletConfig()
{
	return null;
}
public String getServletInfo()
{
	return null;
}
}
