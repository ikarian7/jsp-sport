package sportIO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SportServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
      
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
    	
        doGet(req, resp);
    }
}

