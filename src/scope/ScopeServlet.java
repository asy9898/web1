package scope;

import java.awt.PageAttributes;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/scope")
public class ScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//no.jsp에서 넘긴 값 가져오기
		int no = Integer.parseInt(request.getParameter("no"));
		//DAO의 getUser() 호출 한 후 VO에 담기
		MemberDAO dao = new MemberDAO();
		MemberVO vo = new MemberVO();
		vo = dao.getUser(no);
		//vo를 다른 jsp에 넘겨서 출력을 하고 싶다면?
//		HttpSession session = request.getSession();
//		session.setAttribute("vo",vo);
		request.setAttribute("vo", vo);
		RequestDispatcher rd = request.getRequestDispatcher("scope/result.jsp");
		rd.forward(request, response);
		
//		request.setAttribute("vo", vo);
		response.sendRedirect("scope/result.jsp");
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
