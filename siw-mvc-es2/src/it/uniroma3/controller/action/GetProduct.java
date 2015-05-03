package it.uniroma3.controller.action;

/**
 * Created by marcofaretra on 03/05/15.
 */
import it.uniroma3.controller.helper.HelperProductId;
import it.uniroma3.model.Product;
import it.uniroma3.model.ProductFacade;

import javax.servlet.http.HttpServletRequest;

public class GetProduct implements Action {

    public String perform(HttpServletRequest request) {

        HelperProductId helper = new HelperProductId();

        if (helper.isValid(request)) {
            Long id = Long.parseLong(request.getParameter("id"));

            ProductFacade facade = new ProductFacade();
            Product product = facade.getProduct(id);
            request.setAttribute("product", product);

            return "/product.jsp";
        } else
            return "/invalid.jsp";
    }
}
