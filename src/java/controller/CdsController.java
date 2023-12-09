
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
import model.Materiales.Cds;
import model.Materiales.CdsDAO;

@WebServlet(name = "CdsController", urlPatterns = {"/CdsController"})
public class CdsController extends HttpServlet {

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CdsDAO cdsDAO = new CdsDAO();

        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");

        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("Cds/index.jsp");
            List<Cds> listaCds = cdsDAO.listarCds();
            request.setAttribute("lista", listaCds);
        } else if ("nuevo".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Cds/nuevo.jsp");
        } else if ("insert".equals(accion)) {
            String titulo = request.getParameter("titulo");
            String artista = request.getParameter("artista");
            String genero = request.getParameter("genero");
            String duracion = request.getParameter("duracion");
            int numerocanciones = Integer.parseInt(request.getParameter("numerocanciones"));
            String ubicacion = request.getParameter("ubicacion");
            int unidades = Integer.parseInt(request.getParameter("unidades"));
            
            Cds cds = new Cds("",titulo, artista, genero, duracion, numerocanciones, ubicacion, unidades, 0, unidades);
            
            cdsDAO.insertar(cds);
            
            dispatcher = request.getRequestDispatcher("Cds/index.jsp");
            List<Cds> listaCds = cdsDAO.listarCds();
            request.setAttribute("lista", listaCds); 
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
