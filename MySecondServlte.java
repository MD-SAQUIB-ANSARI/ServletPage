package mypackage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MySecondServlte extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("username");
		String password=req.getParameter("passworede");
		//out.println("username:"+username);
		//out.println("password:"+passworde);
	/*	if(username.equals("Chetu")&& passworede.equals(Saquib@12345))
		{
			out.println("<h1 style=\"color:red;\">welcome to my Homer page</h1>");
			out.println("<a href=index.html'>goto home page</a>");	
		}
		else
		{
			out.println("<h1 style=\"color:green;\">you are eneter wronge passworde and usernae </h1>");
			out.println("<a href=index.html'>goto home page</a>");	
		}
		
		*/
	   }
	}
