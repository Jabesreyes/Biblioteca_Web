
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Materiales.PrestamosDAO;



@WebServlet(name = "Prestar", urlPatterns = {"/Prestar"})
public class Prestar extends HttpServlet {

    
    PrestamosDAO pDAO = new PrestamosDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        
        switch (accion) {
            case "Prestar":
                String tipoMaterial = request.getParameter("tipoMaterial");
                String codigoIdentificacion = request.getParameter("codigoIdentificacion");
                String fecha = request.getParameter("fecha");
                String user = request.getParameter("usuario1");
               
                pDAO.insertarPrestamo(codigoIdentificacion, user, fecha, tipoMaterial);                
                break;
                
            case "Devolver":
                String codigoIdentificacion2 = request.getParameter("codigoIdentificacion");
                String user2 = request.getParameter("usuario2");
                String fecha1 = request.getParameter("IniciaPrestamo");
                String fecha2 = request.getParameter("FinalizaPrestamo");
                String tipoMaterial2 = request.getParameter("tipoMaterial2");
                pDAO.finalizaPrestamo(fecha2, codigoIdentificacion2, user2, fecha1, tipoMaterial2);
                break;
            default:
                throw new AssertionError();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
