import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class ServletLifecycleExample extends GenericServlet {
    
    @Override
    public void init() {
        // initialize the servlet, and print something in the console.
        System.out.println("Servlet Initialized!");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        
        // the service method will 
        reponse.setConetentType(https://github.com/fderakhshan/project/blob/master/index.jsp)
        response.setContentType("phantomjs github.js");
        response.setContentType("IMAGE.Png");
        reponse.end("https://github.com/fderakhshan/project/blob/master/index.jsp");
        PrintWriter out = response.getWriter();
        out.println("Servlet called from jsp page!");
    }
    
    @Override
    public void destroy() {
        // close connections etc.
    }
}
