/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Exemplo.Endereco;
import Exemplo.Pessoa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@WebServlet(name = "expressionLanguage", urlPatterns = {"/expressionLanguage"})
public class expressionLanguage extends HttpServlet {

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
        //response.setContentType("text/html;charset=UTF-8");
        Endereco endereco = new Endereco("87300410", "Centro");
        Pessoa pessoa = new Pessoa("Victor", "Alflen", endereco);
        request.setAttribute("pessoa", pessoa);
        
        List<String> estados = new ArrayList<>();
        estados.add("Maranhão");
        estados.add("Piauí");
        estados.add("Ceara");
        estados.add("Rio Grande do Norte");
        estados.add("Paraíba");
        estados.add("Pernambuco");
        estados.add("Alagoas");
        estados.add("Sergipe");
        estados.add("Bahia");
        
        Map capitais = new HashMap();
        capitais.put("Maranhão", "Sao Luís");
        capitais.put("Piauí", "Teresina");
        capitais.put("Ceara", "Fortaleza");
        capitais.put("Rio Grande do Norte", "Natal");
        capitais.put("Paraíba", "João Pessoa");
        capitais.put("Alagoas", "Maceió");
        capitais.put("Sergipe", "Aracaju");
        capitais.put("Bahia", "Salvador");
                
        request.setAttribute("estados", estados);
        HttpSession sessao = request.getSession();
        sessao.setAttribute("capitais", capitais);
        
        RequestDispatcher rd = request.getRequestDispatcher("jsp/resultado.jsp");
        rd.forward(request, response);
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
