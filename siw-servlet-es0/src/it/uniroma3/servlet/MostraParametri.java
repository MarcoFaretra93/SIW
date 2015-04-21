 package it.uniroma3.servlet;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.io.PrintWriter;

@WebServlet("/processaDati")
public class MostraParametri extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // gestione della RICHIESTA

        // leggo i parametri
        String nome = request.getParameter("firstname").toUpperCase();
        String cognome = request.getParameter("lastname").toUpperCase();

        // leggo (alcune) intestazioni http della richiesta
        String address = (String)request.getRemoteAddr();
        String host = (String)request.getRemoteHost();
        String userAgent = request.getHeader("User-Agent");

        // gestione della RISPOSTA

        // preparo il tipo (HTML)
        response.setContentType("text/html");

        // preparo un oggetto su cui scrivere la risposta
        PrintWriter out = response.getWriter();

        // scrivo il corpo
        out.println("<!DOCTYPE html>"); out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"ISO-8859-1\" />");
        out.println("<title>mostra parametri</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Dati inseriti nella form</h1>");
        out.println("<ul>");
        out.println("<li>Nome: <b>"+nome+"</b></li>");
        out.println("<li>Cognome: <b>"+cognome+"</b></li>");
        out.println("</ul>");
        out.println("<h2>Altri dati relativi alla richiesta</h2>");
        out.println("<br />IP: <b>"+address+"</b>");
        out.println("<br />Host: <b>"+host+"</b>");
        out.println("<br />User Agent: <b>"+userAgent+"</b>");
        out.println("</body>\n</html> ");

    }
}