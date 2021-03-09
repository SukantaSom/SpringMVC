package in.som.web.webapp1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Yahoo!!!!!!!!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>My First Servlet</h1>");
		out.println("</body>");
		out.println("</html>");
	*/
		String nm = request.getParameter("name");
		request.setAttribute("nam", nm);
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
		
		
		//super.doGet(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nm = request.getParameter("name");
		request.setAttribute("nam", nm);
		String pass = request.getParameter("pass");
		request.setAttribute("pass", pass);
		
		
		UserValidation uv = new UserValidation();
		
		boolean auth= uv.validate(nm, pass);
		if(!auth)
		{
			String msg = "You are not Authenticated!!!";
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		else
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		//super.doPost(request,response);
	}
}
