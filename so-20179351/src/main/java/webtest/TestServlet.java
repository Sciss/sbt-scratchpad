package webtest;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = { "/test" }, loadOnStartup = 1)
public class TestServlet extends HttpServlet {
  @Override public void init() { System.out.println("init"); }
  @Override protected void doGet(HttpServletRequest request, HttpServletResponse response) { System.out.println("GET"); }
}
