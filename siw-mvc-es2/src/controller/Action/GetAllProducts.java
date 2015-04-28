package controller.action;

import model.ProductFacade;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by marcofaretra on 28/04/15.
 */
public class GetAllProducts implements Action {
    public String perform(HttpServletRequest request) {
        ProductFacade facade = new ProductFacade();
        request.setAttribute("products",facade.getAllProduct());
        return "/products.jsp";
    }
}
