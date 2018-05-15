/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gabrieldeoliveira
 */
public class sessionConsultas extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String url = "/index.jsp";
        String mensagem = "";

        String nome = request.getParameter("nome");        
        Integer telefone = Integer.parseInt(request.getParameter("telefone"));
        String email = request.getParameter("email");
        String dataNascimento = request.getParameter("dataNascimento");
        String cidade = request.getParameter("cidade");
        String bairro = request.getParameter("bairro");
        String numero = request.getParameter("numero");
        Integer qntdePessoas = Integer.parseInt(request.getParameter("qntdePessoas"));
        Double renda = Double.parseDouble(request.getParameter("renda"));
        
        consultaController consulta = new consultaController();
        
        boolean retorno = consulta.Instancia(renda);
        
        if(!retorno){
            mensagem = "Error";
        }else{
            double consultatest = consulta.medida(renda);
            if(consultatest != 0){
                if (renda < 1800) { 
                    mensagem =  "Renda Inferior do mínimo pedido para participar";
                 } else if (renda < 2350) {
                     mensagem =  "Renda permitida. Minha Casa Minha Vida 1 - Faixa 1";
                 } else if (renda < 2600) {
                     mensagem =  "Renda permitida. Minha Casa Minha Vida 1 e 2 - Localização Centro - Faixa 1.5";
                 } else if (renda < 3600) {
                     mensagem =  "Renda permitida. Minha Casa Minha Vida Gourmet - Localização Centro - Faixa 2";
                 } else if(renda < 4000){
                    mensagem =  "Renda permitida. Minha Casa Minha Vida  - Localização Norte - Faixa 2.5";
                 }else if(renda < 5000){
                      mensagem =  "Renda permitida. Minha Casa Minha Vida  - Localização Norte - Faixa 3";
                 }else if(renda < 6000){
                     mensagem =  "Renda permitida. Minha Casa Minha Vida  - Localização Sul - Faixa 3.5";
                 }else if(renda < 6500){
                      mensagem =  "Renda permitida. Minha Casa Minha Vida  -  Localização Sul - Faixa 4";
                 }else if(renda < 8000){
                     mensagem =  "Renda permitida. Minha Casa Minha Vida  - Private - Faixa 4.5";
                 }else if(renda < 9000){
                      mensagem =  "Renda permitida. Minha Casa Minha Vida  - Private Premium - Faixa 5";
                 }else{
                      mensagem =  "Renda acima do permitida pedido para participar";
                 }
            }else{
                mensagem = "Por Favor, insira uma renda para fazer a simulação";
            }
        }
        
        request.setAttribute("mensagem", mensagem);
        getServletContext().getRequestDispatcher(url).forward(request, response);
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
