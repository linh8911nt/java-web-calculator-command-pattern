package controller;

import services.AddOperator;
import services.Calculator;
import services.SubOperator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operator = request.getParameter("operator");
        int firstOperand = Integer.parseInt(request.getParameter("firstOperand"));
        int secondOperand = Integer.parseInt(request.getParameter("secondOperand"));

        Calculator calculator = null;

        if (operator.equals("+")){
            calculator = new Calculator(new AddOperator());
        } else {
            calculator = new Calculator(new SubOperator());
        }
        int result = calculator.execute(firstOperand, secondOperand);

        request.setAttribute("result", result);
        request.setAttribute("operator", operator);
        request.setAttribute("firstOperand", firstOperand);
        request.setAttribute("secondOperand", secondOperand);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
