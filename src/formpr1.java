

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formpr1
 */
@WebServlet("/formpr1")
public class formpr1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formpr1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String in1
		=request.getParameter("firstName");
		String [] in2=request.getParameterValues("lastName");
		String [] cbs   =  request.getParameterValues("cb");
		out.print("<html> <body>"+ in1+"<br>");
		out.print("<ul> ");
		for (String s: in2)
		{
			out.print("<li>"+s+"</li>");
		}
		
		out.print("</ul> ");
		out.print("<ul> ");
		for (String s: cbs)
		{
			out.print("<li>"+s+"</li>");
		}
		
		out.print("</ul> ");
		out.print("</body> </html> ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
