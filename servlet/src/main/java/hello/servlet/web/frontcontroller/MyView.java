package hello.servlet.web.frontcontroller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MyView {
    private final String viewPath;
    
    public MyView(String viewPath) {
        this.viewPath = viewPath;
    }
    
    public void render(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(viewPath).forward(req, resp);
    }
}
