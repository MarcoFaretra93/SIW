package controller.action;

/**
 * Created by marcofaretra on 25/04/15.
 */

import javax.servlet.http.HttpServletRequest;

public interface Action {
    public String perform(HttpServletRequest request);
}
