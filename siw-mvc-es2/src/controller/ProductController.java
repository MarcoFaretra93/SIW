package controller; /**
 * Created by marcofaretra on 21/04/15.
 */


import controller.action.Action;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/controller/*")
public class ProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String modelCommand = request.getPathInfo();
		String actionName = "controller.action."+modelCommand.substring(1,2).toUpperCase()+modelCommand.substring(2);
		String nextPage = null;
		Action action;
		try {
			action=(Action)Class.forName(actionName).newInstance();
			nextPage = action.perform(request);
		}
		catch (Exception e) {
			nextPage="/index.jsp";
		}
		nextPage=response.encodeURL(nextPage);
		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request,response);
		return;
	}


}