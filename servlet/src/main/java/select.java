

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class select
 */
@WebServlet("/chapter5/request")
public class select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public select() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out =response.getWriter();
		//request.setCharacterEncoding("UTF-8");
		String select=request.getParameter("select");
		String payment=request.getParameter("payment");
		String textarea=request.getParameter("textarea");
		String[] want=request.getParameterValues("want-box");
		String check=request.getParameter("check");
		
		if(want!=null) {
			for(String item: want) {
				out.println(item);
			}
	}
		else {
			out.println("チェック無し");
		}
		out.println(select+"個");
		out.println(payment);
		out.println(textarea);
		out.println(check);
		if(check!=null) {
		out.println("メールあり");
		}else {
			out.println("メール無し");
		}
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
