import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServlet", urlPatterns = "/translate")
public class TranslationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
    Map<String, String> dictionary= new HashMap<>();
    dictionary.put("hello", "chào");
    dictionary.put("dog", "chó");
    dictionary.put("cat", "mèo");
    String search = request.getParameter("txtSearch");
        PrintWriter writer= response.getWriter();
    String result = dictionary.get(search);
    if(result != null){
        writer.println("Word: "+ search);
        writer.println ("</br>");
        writer.println("Result: " + result);
    } else{
        writer.println("Not found");
    }
writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
