
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
import model.Materiales.Revistas;
import model.Materiales.RevistasDAO;


@WebServlet(name = "RevistasController", urlPatterns = {"/RevistasController"})
public class RevistasController extends HttpServlet {

    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RevistasDAO revistasDAO = new RevistasDAO();

        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");

        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("Revistas/index.jsp");
            List<Revistas> listaRevistas = revistasDAO.listarRevistas();
            request.setAttribute("lista", listaRevistas);
        } else if ("nuevo".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Revistas/nuevo.jsp");
        } else if ("insert".equals(accion)) {
            String titulo = request.getParameter("titulo");
            String editorial = request.getParameter("editorial");
            String periodicidad = request.getParameter("periodicidad");
            String fechapublicacion = request.getParameter("fechapublicacion");
            String ubicacion = request.getParameter("ubicacion");
            int unidades = Integer.parseInt(request.getParameter("unidades"));
            
            Revistas revistas = new Revistas("",titulo, editorial, periodicidad, fechapublicacion, ubicacion, unidades, 0, unidades);
            
            revistasDAO.insertar(revistas);
            
            dispatcher = request.getRequestDispatcher("Revistas/index.jsp");
            List<Revistas> listaRevistas = revistasDAO.listarRevistas();
            request.setAttribute("lista", listaRevistas); 
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
