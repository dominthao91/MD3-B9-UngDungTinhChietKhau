import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/Discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("Description");
        Double price = Double.parseDouble(request.getParameter("Price"));
        Double discount = Double.parseDouble(request.getParameter("submit"));
        Double amount = price* discount*0.01;
        Double prices  = price -amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
if (prices >0 && discount >0){
    writer.println("<h1> description " + description + "</h1>");
    writer.println("<h1> price "+ price + "</h1>");
    writer.println("<h1> discount "+discount + "</h1>");
    writer.println("<h1> amount " + amount + "</h1>");
    writer.println("<h1> prices " + prices + "</h1>");
}
        writer.println("</html>");
    }
}
