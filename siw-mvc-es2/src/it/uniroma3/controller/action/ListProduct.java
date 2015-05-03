package it.uniroma3.controller.action;

/**
 * Created by marcofaretra on 03/05/15.
 */
import java.util.*;

import it.uniroma3.model.Product;
import it.uniroma3.model.ProductFacade;

import javax.servlet.http.HttpServletRequest;

//controller/prodcut.list
public class ListProduct implements Action {

    public String perform(HttpServletRequest request) {

        ProductFacade facade = new ProductFacade();
        List<Product> products = facade.getAllProducts();
        request.setAttribute("products", products);
        return "/products.jsp";
    }
}
