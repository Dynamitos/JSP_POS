package utility;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Michaela
 */
public class ServletUtil {

    public static void forward(String uri, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher(uri).forward(request, response);
    }
    
    public static boolean isEmpty(String value)
    {
        return (value==null || value.isEmpty());
    }
}
