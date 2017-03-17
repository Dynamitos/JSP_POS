/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import resource.ViewResourceEnum;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utility.HtmlFormatter;
import utility.ServletUtil;

/**
 *
 * @author Michaela
 */
@WebServlet(name="HelloWoldServlet", urlPatterns="/HelloWorld")
public class HelloWorldServlet extends HttpServlet {

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
        //Eingabe plausiprüfung
        String color = request.getParameter("color");
        
        if(ServletUtil.isEmpty(color))
        {
            String parameterUri = ViewResourceEnum.ERROR.getPath() + "?messagee=Farbe eingeben";
            ServletUtil.forward(parameterUri, request, response);
        }
        //Bean-Daten Objekt vorbereiten
        HelloWorldBean bean = new HelloWorldBean("Hello World");
        int size = 12;
        //HTML Format
        bean.setHtmlCapital(HtmlFormatter.formatText(bean.getCapital(),size, color));
        
        //Parameter Bean in den Scope legen
        request.setAttribute("helloWorldBean", bean);
        
        //Ausgabe auf der View => Umleiten auf JSP View Result
        ServletUtil.forward(ViewResourceEnum.RESULT.getPath(), request, response);
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
