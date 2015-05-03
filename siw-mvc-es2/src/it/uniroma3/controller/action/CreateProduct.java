package it.uniroma3.controller.action;

import it.uniroma3.controller.helper.HelperProduct;
import it.uniroma3.model.Product;
import it.uniroma3.model.ProductFacade;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by marcofaretra on 28/04/15.
 */
public class CreateProduct implements Action {

    public String perform(HttpServletRequest request) {

        HelperProduct helper = new HelperProduct();

        if (helper.isValid(request)) {
            String name = request.getParameter("name");
            String code = request.getParameter("code");
            Float price = Float.parseFloat(request.getParameter("price"));
            String description = request.getParameter("description");

            ProductFacade facade = new ProductFacade();
            Product product = facade.createProduct(name, code, price, description);
            request.setAttribute("product", product);

            return "/product.jsp";
        } else
            return "/newProduct.jsp";
    }
}
