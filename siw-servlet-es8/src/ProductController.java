/**
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

@WebServlet("/processa")
public class ProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome=req.getParameter("nomeProdotto");
        String descrizione=req.getParameter("descrizione");
        String prezzo=req.getParameter("prezzo");
        String codice=req.getParameter("codice");
        boolean errori=false;
        String paginaindex="/product.jsp";
        req.setAttribute("nomeCorrente",nome);
        req.setAttribute("prezzoCorrente",prezzo);
        req.setAttribute("descrizioneCorrente",descrizione);
        req.setAttribute("codiceCorrente",codice);

        if(nome.isEmpty()) {
            errori=true;
            req.setAttribute("nomeError","Campo obbligatorio");
        }

        try {
            Double.parseDouble(prezzo);
        } catch(Exception e) {
            errori=true;
            req.setAttribute("prezzoError","Deve essere un numero");
        }

        if(descrizione.isEmpty()) {
            errori=true;
            req.setAttribute("descrizioneError","Campo Obbligatorio");
        }

        if(codice.isEmpty()) {
            errori=true;
            req.setAttribute("codiceError","Campo Obbligatorio");
        }

        if(errori) {
            paginaindex="/newProduct.jsp";
        }

        ServletContext application = getServletContext();
        RequestDispatcher rd = application.getRequestDispatcher(resp.encodeURL(paginaindex));
        rd.forward(req,resp);
    }
}
