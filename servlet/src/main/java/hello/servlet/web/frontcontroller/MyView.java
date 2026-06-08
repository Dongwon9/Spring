package hello.servlet.web.frontcontroller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

public class MyView {
    private final String viewPath;

    public MyView(String viewPath) {
        this.viewPath = viewPath;
    }

    private static void modelToRequestAttribute(Map<String, Object> model, HttpServletRequest req) {
        model.forEach(req::setAttribute);
    }

    public void render(Map<String, Object> model, HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        modelToRequestAttribute(model, req);
        req.getRequestDispatcher(viewPath).forward(req, resp);
    }

    public void render(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(viewPath).forward(req, resp);
    }
}
