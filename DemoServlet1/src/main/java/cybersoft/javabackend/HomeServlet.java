package cybersoft.javabackend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.javabackend.helper.URLHelper;

@WebServlet(name = "home", urlPatterns = { URLHelper.HOME, URLHelper.ROOT })
public class HomeServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2767901307709056383L;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("init has been called");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service() has been called");
		resp.setContentType("text/html");
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Home page</h1>");
		writer.print("<p>from doGet() with bug</p>");
		writer.print("<p> Username :</p>");
		writer.print(name);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service() has been called");
		resp.setContentType("text/html");
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		PrintWriter writer = resp.getWriter();
		writer.print("<p> Username :</p>");
		writer.print(name);
		writer.print("<p> Password :</p>");
		writer.print(pass);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("destroy() has been called");
	}
}
