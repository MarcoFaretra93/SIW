package controller.helper;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by marcofaretra on 28/04/15.
 */
public class HelperProductId {
    public boolean isValid(HttpServletRequest request) {
        String id = request.getParameter("id");
        boolean errori = false;

        if(id.isEmpty()) {
            errori = true;
        }

        return !errori;
    }
}
