package mypackage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyThirdServlte extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println(" <h1>this is a login page</h1>");
		Integer num=Integer.parseInt(req.getParameter("textuserinput"));
		out.println("You are Enter the input : " +num+"<br>");
		for(int i=0;i<=10;i++)
		{
			out.println(num*i);
		}}}
