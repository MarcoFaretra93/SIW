package it.uniroma3.controller.action;

import javax.servlet.http.HttpServletRequest;
/**
 * Created by marcofaretra on 27/04/15.
 */

public interface Action {
    public String perform(HttpServletRequest request);
}
