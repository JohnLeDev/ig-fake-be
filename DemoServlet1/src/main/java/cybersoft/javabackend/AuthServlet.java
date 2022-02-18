package cybersoft.javabackend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cybersoft.javabackend.helper.URLHelper;

@WebServlet(name = "authServlet", urlPatterns = URLHelper.AUTH_LOGIN)
public class AuthServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.getWriter()
				.append("<form action=\"\" method=\"post\">\n" + "    <h2>Login Form</h2>\n"
						+ "    <label for=\"username\">Username: </label>\n"
						+ "    <input type=\"text\" name=\"username\" id=\"username\">\n" + "    <br>\n"
						+ "    <label for=\"password\">Password: </label>\n"
						+ "    <input type=\"password\" name=\"password\" id=\"password\">\n" + "    <br>\n"
						+ "    <input type=\"submit\" name=\"submit\" value=\"Login\">\n" + "  </form>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		resp.setContentType("text/html");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(username);
		if ("adminadmin".equals(username + password)) {
//			resp.sendRedirect(req.getContextPath()+"/home");
			req.getRequestDispatcher("/home").forward(req, resp);

		} else {
			resp.sendRedirect(req.getContextPath()+"/log-in");
		}
	}
}
