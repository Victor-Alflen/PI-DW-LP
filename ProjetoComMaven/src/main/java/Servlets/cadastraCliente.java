/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAOs.DAOClientes;
import Entidades.Clientes;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Victor
 */
@WebServlet(name = "cadastraCliente", urlPatterns = {"/cadastraCliente"})
public class cadastraCliente extends HttpServlet {

    private DAOClientes daoClientes = new DAOClientes();
    private Clientes cliente = new Clientes();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private int NUMEROS = 2;
    private int LETRAS = 2;
    private int NUMEROS_E_LETRAS = 2;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected boolean verifica(String campo, String adicional, int tipo) {
        String numeros = "1234567890";
        String letras = "abcdefghijklmnopqrstuvwxyz";

        String caracValidos;
        switch (tipo) {
            case 1:
                caracValidos = numeros + adicional;
                break;
            case 2:
                caracValidos = letras + adicional;
                break;
            case 3:
                caracValidos = letras + numeros + adicional;
                break;
            default:
                caracValidos = "";
                break;
        }

        for (char a : campo.toCharArray()) {
            if (caracValidos.indexOf(a) == -1) {
                return false;
            }
        }
        return true;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        cliente.setId(daoClientes.autoIdClientes());
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String email = request.getParameter("email");
        String login = request.getParameter("login");
        
        RequestDispatcher rd = request.getRequestDispatcher("jsp/registroInserido.jsp");

        if (verifica(nome, "", LETRAS) && verifica(cpf, "", NUMEROS) && verifica(email, "@_-", NUMEROS_E_LETRAS)
                && verifica(login, "", NUMEROS_E_LETRAS))  {
            cliente.setNome(nome);
            cliente.setCpf(cpf);
            cliente.setEmail(email);

            try {
                cliente.setDataNascimento(sdf.parse(request.getParameter("dataNascimento")));
            } catch (Exception e) {
            }

            //Login
            cliente.setLogin(login);
            cliente.setSenha(request.getParameter("senha"));

            //Admin e ativo
            cliente.setAdmin(0);
            cliente.setAtivo(true);
            
            daoClientes.inserir(cliente);
        } else {
            
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
