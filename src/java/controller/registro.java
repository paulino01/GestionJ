/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.*;

/**
 *
 * @author paulino
 */
@WebServlet(name = "registro", urlPatterns = {"/registro"})
public class registro extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          int clave = Integer.parseInt(request.getParameter("clave"));
          String nombre=request.getParameter("nombre");
          Double precio= Double.parseDouble(request.getParameter("precio"));
          int cantidad = Integer.parseInt(request.getParameter("cantidad"));
          
          GestorBD gestorBD= new GestorBD();
          if(gestorBD.registrar(clave,nombre, precio, cantidad)){
              request.getRequestDispatcher("/registroGuardado.jsp")
                      .forward(request, response);
          }
          else
              request.getRequestDispatcher("/errorEnRegistro.jsp")
                      .forward(request, response);
          
        }
        
        }
    }

 