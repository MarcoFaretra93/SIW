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
import java.util.*;


@WebServlet("/controller/*") // controller/product.pippo
// controller/product.create -> CreateProduct
public class ProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nextPage = null;
		String actionName = path2action(request);
		Action action;
		try {
			action = (Action)Class.forName(actionName).newInstance();
			nextPage = action.perform(request);
		} catch (Exception e) {
			nextPage = "/index.jsp";
		}
		nextPage = response.encodeURL(nextPage);
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

    private String path2action(HttpServletRequest request) {

        String path = request.getPathInfo();
        String modelCommand = path.substring(1);
        Scanner scanner = new Scanner(modelCommand).useDelimiter("\\.");
        String model = scanner.next();
        model = model.substring(0,1).toUpperCase() + model.substring(1);

        String action = scanner.next();
        action = action.substring(0,1).toUpperCase() + action.substring(1);

        String actionName = "controller.action." + action + model;
        return actionName;
    }
}