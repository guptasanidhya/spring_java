package springmvcsearch;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;

import java.util.Map;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("This is pre handler...");

        // Get the map of URI template variables (this will include userId and userName)
        Map<String, String> uriVariables = (Map<String, String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);

        // Extract userId and userName separately from the map
        String userName = uriVariables.get("userName");
        String userId = uriVariables.get("userId");

        // Log the values for debugging
        System.out.println("userId: " + userId + ", userName: " + userName);

        // Your logic (checking if the userName starts with 'S')
        if (userName != null && userName.toUpperCase().startsWith("S")) {
            response.setContentType("text/html");
            response.getWriter().println("Name should not start with letter S");
            return false; // stop further processing
        }

        return true; // allow further processing
    }


    // This method is called before the handler method is invoked
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println("this is pre handler...");
//        String name = request.getParameter("userName");
//        if (name != null && name.toUpperCase().startsWith("S")) {
//            response.setContentType("text/html");
//            response.getWriter().println("Name should not start with letter S");
//            return false; // stop further processing
//        }
//        return true; // allow further processing
//    }

    // You don't need to implement this method if you don't need it.
    // Just leave it empty or return a default value.
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, org.springframework.web.servlet.ModelAndView modelAndView) throws Exception {
        // Do nothing
    }

    // You can leave this empty as well if you don't need it.
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // Do nothing
    }
}
