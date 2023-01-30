
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
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstNumber = request.getParameter("firstNum");
        String secondNumber = request.getParameter("secondNum");
        String type = request.getParameter("type");
        request.setAttribute("firstNum", firstNumber);
        request.setAttribute("secondNum", secondNumber);
        
        
        int result = 0;
        
        if ((firstNumber == null || firstNumber.equals("")) && (secondNumber == null || secondNumber.equals(""))){
            
            request.setAttribute("result", "---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            
            
        }
        try {
            
            int firstNum = Integer.parseInt(firstNumber);
            int secondNum = Integer.parseInt(secondNumber);
            
            
            switch(type) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "%":
                    result = firstNum % secondNum;
                    break;
            }
            
            request.setAttribute("result", result);
            
        }
        
        catch (Exception e) {
            request.setAttribute("result", "invalid");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
    }

}
