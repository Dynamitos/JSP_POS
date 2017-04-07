/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import histroy.HistoryBean;
import histroy.HistoryModel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import resource.ViewResourceEnum;
import utility.HtmlFormatter;
import utility.ServletUtil;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/HelloWorld")
public class HelloWorldServlet extends HttpServlet
{

    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private HistoryModel historyModel;
    //usw.

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String view = "";
        try
        {
            manageHistory();
            //1.
            this.request = request;
            this.response = response;
            this.session = request.getSession();
            
            //usw.
            //2. gedrückter Submit-Name (Kommando) finden
            switch (ServletUtil.checkRequestCommando(request, "submit"))
            {
                case "SUBMIT":
                    view = doSubmit();
                    break;
                case "EMPTY":
                    ServletUtil.forwardError(request, response, "Falsches Kommando");
                    break;
            }

        }
        catch (Exception e)
        {
            //todo
            System.err.println("Servlet: " + e.getMessage());
            try
            {
                ServletUtil.forwardError(request, response, e.getMessage());
            }
            catch (Exception ex)
            {
                Logger.getLogger(HelloWorldServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Ausgabe auf der View => umleiten auf JSP view result
        ServletUtil.forward(view, request, response);
    }
    
    private void manageHistory() throws Exception
    {
        historyModel = (HistoryModel) session.getAttribute("historyModel");
        if(historyModel == null)
        {
            historyModel = new HistoryModel();
            session.setAttribute("historyModel", historyModel);
        }
        
    }

    private String doSubmit() throws Exception
    {
        
        String color = (request.getParameter("color"));
        if (ServletUtil.isEmpty(color))
        {
            throw new Exception("Farbe eingeben.");
        }
        
        HistoryBean hb = new HistoryBean();
        hb.setColor(color);
        historyModel.add(hb);
        
        HelloWorldBean bean = new HelloWorldBean("Hello World");
        
        int size = 45;
        
        bean.setHtmlCapital(HtmlFormatter.formatText(bean.getCapital(), size, color));
        
        request.setAttribute("helloWorldBean", bean);
        
        return ViewResourceEnum.RESULT.getView();
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
            throws ServletException, IOException
    {
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
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
