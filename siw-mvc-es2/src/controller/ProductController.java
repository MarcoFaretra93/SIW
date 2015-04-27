package controller; /**
 * Created by marcofaretra on 21/04/15.
 */


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/controller")
public class ProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Action action = new Action();
		String nextPage = action.perform(request);

		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(response.encodeURL(nextPage));
		rd.forward(request,response);
		return;
	}


}