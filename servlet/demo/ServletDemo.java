package servlet.demo;

import java.io.Writer;
import java.io.IOException;
import javax.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class ServletDemo extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println(req.getParameter("username"));
	System.out.println(req.getParameter("password"));
	
	String username = req.getParameter("username");
	String password = req.getParameter("password");
	
	resp.setContentType("text/html"; charset="UTF-8");
	Writer webWriter = resp.getWriter();
	webWriter.write("<html>");
	webWriter.write("<body>");
	webWriter.write("<p>"+username+"</p>");
	webWriter.write("<p>"+password+"</p>");
	webWriter.write("</body>");
	webWriter.write("</html>");
	
	}

}
