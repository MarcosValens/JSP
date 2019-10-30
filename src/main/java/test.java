import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String saludo = req.getParameter("saludo");// Este lo coge de la url
        resp.setStatus(200);
        req.setAttribute("atributo",saludo);// Este guarda el atributo con el nombre de "atributo" para que pueda usarlo el jsp
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
