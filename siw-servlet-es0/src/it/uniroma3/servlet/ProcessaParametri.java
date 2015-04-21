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
import java.io.PrintWriter;

@WebServlet("/confermaDati")
public class ProcessaParametri extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        // preparo il tipo (HTML)
        resp.setContentType("text/html");

        // preparo un oggetto su cui scrivere la risposta
        PrintWriter out = resp.getWriter();


        out.println("<!DOCTYPE html>"); out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"ISO-8859-1\" />");
        out.println("<title>mostra parametri</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Dati inseriti nella form</h1>");
        out.println("<ul>");
        out.println("<li>Nome: <b>"+session.getAttribute("NOME")+"</b></li>");
        out.println("<li>Cognome: <b>"+session.getAttribute("COGNOME")+"</b></li>");
        out.println("<h2>Scegli:</h2>");
        out.println("</ul>");
        out.println("<ul>");
        out.println("<li><a href=\"index.jsp\">Annulla</a></li>");
        out.println("<li><a href=\"mostraDati\">Conferma</a></li>");
        out.println("</ul>");
        out.println("</body>\n</html> ");
    }
}
