package controller.helper;

/**
 * Created by marcofaretra on 25/04/15.
 */

import javax.servlet.http.HttpServletRequest;

public class HelperProductId {
    public boolean isValid(HttpServletRequest request) {
        String id = request.getParameter("id");
        boolean errori=false;

        try {
            Long.parseLong(id);
        }
        catch(Exception e) {
            errori=true;
            request.setAttribute("idErr","id invalido");
        }

        return !errori;
    }
}
