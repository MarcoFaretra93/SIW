package controller.action;

import controller.helper.HelperProduct;
import model.Product;
import model.ProductFacade;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by marcofaretra on 25/04/15.
 */
public class CreateProduct implements Action {
    public String perform(HttpServletRequest request) {
        HelperProduct helper = new HelperProduct();

        if(helper.isValid(request)) {
            String nome = request.getParameter("nomeProdotto");
            String codice = request.getParameter("codice");
            Float prezzo = Float.parseFloat(request.getParameter("prezzo"));
            String descrizione= request.getParameter("descrizione");

            ProductFacade facade = new ProductFacade();
            Product product = facade.createProduct(nome, codice, prezzo, descrizione);
            request.setAttribute("product",product);
            return "/product.jsp";
        }
        else {
            return "/newProduct.jsp";
        }
    }
}
