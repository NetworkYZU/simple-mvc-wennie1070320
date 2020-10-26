/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//servelt 執行但不輸出(交給jsp)
package lendle.courses.network.simplemvc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "ShowBalance2", urlPatterns = {"/ShowBalance2"})
public class ShowBalance2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        BankCustomer bankCustomer = BankCustomer.getCustomer(id);
        if(bankCustomer == null){
            request.getRequestDispatcher("/WEB-INF/bank-account/UnknownCustomer.jsp").forward(request, response);
        }else{
            request.setAttribute("customer", bankCustomer);
            if(bankCustomer.getBalance()<0){
                request.getRequestDispatcher("/WEB-INF/bank-account/NegativeBalance.jsp").forward(request, response); //將網址連到WEB-INF/bank-account/NegativeBalance.jsp，但顯示的網址會是ShowBalance2(轉址)
            }else if(bankCustomer.getBalance()>10000){
                 request.getRequestDispatcher("/WEB-INF/bank-account/HighBalance.jsp").forward(request, response);
            }else {
                 request.getRequestDispatcher("/WEB-INF/bank-account/NormalBalance.jsp").forward(request, response);
            }
        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
