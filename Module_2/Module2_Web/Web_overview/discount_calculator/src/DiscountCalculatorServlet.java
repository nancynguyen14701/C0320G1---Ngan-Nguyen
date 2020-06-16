import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "DisplayDiscountServlet", urlPatterns = "/discount")
public class DiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer= response.getWriter();
        String description= request.getParameter("description");
        float price= Float.parseFloat(request.getParameter("price"));
        int discount = Integer.parseInt(request.getParameter("discount"));
        double discount_amount = price * discount * 0.01;
        double after_discount= price - discount_amount;

        writer.println("<h1>Discount Price: "+ after_discount+"</h1>");
//        writer.println("<h2>hello</h2>");
        writer.println("<h1>Discount Amount:"+ discount_amount+"</h1>" );

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
