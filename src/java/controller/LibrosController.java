
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Libros;
import model.LibrosDAO;


@WebServlet(name = "LibrosController", urlPatterns = {"/LibrosController"})
public class LibrosController extends HttpServlet {

    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        LibrosDAO librosDAO = new LibrosDAO();
        
        String accion;
        RequestDispatcher dispatcher = null;
        
        accion = request.getParameter("accion");
        
        if(accion == null || accion.isEmpty()){
            dispatcher = request.getRequestDispatcher("Libros/index.jsp");
            List<Libros> listaLibros = librosDAO.listarLibros();
            request.setAttribute("lista",listaLibros);
        }
        
        dispatcher.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
