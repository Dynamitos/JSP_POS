package utility;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Sabrina
 */

public class ServletUtil
{
    public static void forward(String uri, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getRequestDispatcher(uri).forward(request, response);
    }
    
    public static boolean isEmpty(String value)
    {
        return (value == null || value.isEmpty());
    }
}
