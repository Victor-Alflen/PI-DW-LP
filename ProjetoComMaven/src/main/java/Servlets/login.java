/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAOs.DAOClientes;
import Entidades.Clientes;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Victor
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    DAOClientes daoClientes = new DAOClientes();

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
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String caracValidos = "abcdefghijklmnopqrstuvwxyz_1234567890";
        
        for (char a : login.toCharArray()) {
            if (caracValidos.indexOf(a) == -1) {
                response.sendRedirect("jsp/login.jsp");
                return;
            }
        }
        
        RequestDispatcher rq = request.getRequestDispatcher("/jsp/login.jsp");
        
        Clientes cliente = null;
        try{
            cliente = daoClientes.getByLogin(login);
        }catch (Exception e){
            System.out.println("ERRO");
        }
        
        if (cliente != null){ //!list.isEmpty()) {
        //    Clientes cliente = list.get(0);
            if (cliente.getSenha().equals(senha)) {
                HttpSession sessao = request.getSession();
                sessao.setAttribute("SESSIONID", login);
                if (cliente.getAdmin() == 2) {
                    request.setAttribute("teste", "");
                    rq = request.getRequestDispatcher("jsp/adminPage.jsp");
                } else {
                    rq = request.getRequestDispatcher("jsp/userPage.jsp");
                }
                rq.forward(request, response);
            }
        }else{
            System.out.println("FALHOU Login");
            response.sendRedirect("jsp/login.jsp");
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
