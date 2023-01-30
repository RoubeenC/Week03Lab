
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Roubeen Chaudhry
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String message = "";
        
        try {
            
            String age = request.getParameter("age");
            
            if (age.equals("")) {
                message = "You must give your current age";
            }
            
            else {
                int temp = Integer.parseInt(age);
                
                if (temp > 0) {
                    message = "Your age next birthday will be " + (temp + 1);
                } else {
                    message = "You must give your current age";
                }
            }
            
        } 
        catch (Exception e) {
            message = "You must enter a number.";
        }
        
        
        request.setAttribute("message", message);
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
        
    }

}
