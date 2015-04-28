package controller.action;

import controller.helper.HelperProductId;
import model.Product;
import model.ProductFacade;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by marcofaretra on 28/04/15.
 */
public class GetProduct implements Action {
    private HelperProductId helper;

    public String perform(HttpServletRequest request) {
        if(helper.isValid(request)) {
            Long id = Long.parseLong(request.getParameter("id"));
            ProductFacade facade = new ProductFacade();
            Product product = facade.getProduct(id);
            request.setAttribute("product",product);
            return "product.jsp";
        }
        else {
            return "invalid.jsp";
        }
    }
}
