package it.uniroma3.servlet;

/**
 * Created by marcofaretra on 21/04/15.
 */

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.HttpSession;

@WebServlet("/controllerDati")
public class ControllerParametri extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("firstname").toUpperCase();
        String cognome = req.getParameter("lastname").toUpperCase();

        HttpSession session = req.getSession();
        session.setAttribute("NOME",nome);
        session.setAttribute("COGNOME",cognome);

        ServletContext application = getServletContext();
        RequestDispatcher rd = application.getRequestDispatcher(resp.encodeURL("/ProcessaParametri.jsp"));
        rd.forward(req,resp);
        return;
    }
}
