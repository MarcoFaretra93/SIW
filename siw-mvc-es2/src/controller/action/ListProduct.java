package controller.action;

import controller.helper.HelperProduct;
import model.ProductFacade;
import model.Product;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by marcofaretra on 25/04/15.
 */
public class ListProduct implements Action {
    public String perform(HttpServletRequest request) {
        ProductFacade facade = new ProductFacade();
        List<Product> products = facade.getAllProduct();
        request.setAttribute("products",products);
        return "/products.jsp";
    }
}
