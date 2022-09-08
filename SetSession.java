package session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class SetSession
 */
@WebServlet("/set")
public class SetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SetSession() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("b1");
		String s2=request.getParameter("b2");
		String s3=request.getParameter("b3");
		HttpSession hs=request.getSession();
		hs.setAttribute("b1", s1);
		hs.setAttribute("b2", s2);
		hs.setAttribute("b3", s3);
		String s=response.encodeRedirectURL("get");		
		
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("<h1>Your Books are added to Cart<h1>");
		pw.println("<a href="+s+">Next</a>");
		pw.println("</html></body>");
		
	}

}
