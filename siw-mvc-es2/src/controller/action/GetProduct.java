package controller.action;

import controller.helper.HelperProductId;
import model.Product;
import model.ProductFacade;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by marcofaretra on 25/04/15.
 */
public class GetProduct implements Action {
    public String perform(HttpServletRequest request) {
        HelperProductId helper = new HelperProductId();
        if(helper.isValid(request)) {
            Long id = Long.parseLong(request.getParameter("id"));

            ProductFacade facade = new ProductFacade();
            Product product=facade.getProduct(id);
            request.setAttribute("product",product);
            return "/product.jsp";
        }
        else {
            return "/invalid.jsp";
        }
    }
}
