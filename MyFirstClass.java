package mypackage;
import java.io.IOException; 
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class MyFirstClass implements Servlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html>");
			out.println("<body>");
			out.println("<h1>My First Web Dynamic project!</h1>");
			out.println("<h1>My Name is Saquib</h1>");
			out.println("</body>");
		out.println("</html>");
	}
	@Override
	public void destroy() {
		
	}
	@Override
	public ServletConfig getServletConfig() {
	
		return null;
	}
	@Override
	public String getServletInfo() {
		return null;
	}
}
