
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
import model.Materiales.Tesis;
import model.Materiales.TesisDAO;


@WebServlet(name = "TesisController", urlPatterns = {"/TesisController"})
public class TesisController extends HttpServlet {

    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TesisDAO tesisDAO = new TesisDAO();

        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");

        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("Tesis/index.jsp");
            List<Tesis> listaTesis = tesisDAO.listarTesis();
            request.setAttribute("lista", listaTesis);
        } else if ("nuevo".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Tesis/nuevo.jsp");
        } else if ("insert".equals(accion)) {
            String titulo = request.getParameter("titulo");
            String autor = request.getParameter("autor");
            String facultad = request.getParameter("facultad");
            String fechapublicacion = request.getParameter("fechapublicacion");
            String ubicacion = request.getParameter("ubicacion");
            int unidades = Integer.parseInt(request.getParameter("unidades"));
            
            Tesis tesis = new Tesis("",titulo, autor, facultad, fechapublicacion, ubicacion, unidades, 0, unidades);
            
            tesisDAO.insertar(tesis);
            
            dispatcher = request.getRequestDispatcher("Tesis/index.jsp");
            List<Tesis> listaTesis = tesisDAO.listarTesis();
            request.setAttribute("lista", listaTesis); 
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
