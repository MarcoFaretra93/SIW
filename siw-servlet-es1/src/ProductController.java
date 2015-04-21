/**
 * Created by marcofaretra on 21/04/15.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/processa")
public class ProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome=req.getParameter("nomeProdotto");
        String prezzo=req.getParameter("prezzo");
        String descrizione=req.getParameter("descrizione");
        String codice=req.getParameter("codice");
        String address = (String)req.getRemoteAddr();
        String userAgent = req.getHeader("User-Agent");

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>"); out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"ISO-8859-1\" />");
        out.println("<title>mostra parametri</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Dati inseriti nella form</h1>");
        out.println("<ul>");
        out.println("<li>Nome Del Prodotto: <b>"+nome+"</b></li>");
        out.println("<li>Prezzo: <b>"+prezzo+"</b></li>");
        out.println("<li>Descrizione: <b>"+descrizione+"</b></li>");
        out.println("<li>Codice: <b>"+codice+"</b></li>");
        out.println("</ul>");
        out.println("<h2>Altri dati relativi alla richiesta</h2>");
        out.println("<br />IP: <b>"+address+"</b>");
        out.println("<br />User Agent: <b>"+userAgent+"</b>");
        out.println("</body>\n</html> ");
    }
}
