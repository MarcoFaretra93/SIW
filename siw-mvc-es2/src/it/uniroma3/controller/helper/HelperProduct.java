package it.uniroma3.controller.helper;

/**
 * Created by marcofaretra on 25/04/15.
 */

import javax.servlet.http.HttpServletRequest;

public class HelperProduct {
    public boolean isValid(HttpServletRequest request) {
        String nome = request.getParameter("nomeProdotto");
        String price = request.getParameter("prezzo");
        String code = request.getParameter("codice");
        boolean errori=false;

        if(nome.isEmpty()) {
            errori=true;
            request.setAttribute("nameErr","Campo obbligatorio");
        }

        if(code.isEmpty()) {
            errori=true;
            request.setAttribute("codeErr","Campo obbligatorio");
        }

        try {
            Double.parseDouble(price);
        }
        catch (Exception e) {
            errori=true;
            request.setAttribute("priceErr","Deve essere un numero");
        }
        return !errori;
    }
}
