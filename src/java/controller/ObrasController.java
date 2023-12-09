
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
import model.Materiales.Obras;
import model.Materiales.ObrasDAO;


@WebServlet(name = "ObrasController", urlPatterns = {"/ObrasController"})
public class ObrasController extends HttpServlet {

    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ObrasDAO obrasDAO = new ObrasDAO();

        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");

        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("Obras/index.jsp");
            List<Obras> listaObras = obrasDAO.listarObras();
            request.setAttribute("lista", listaObras);
        } else if ("nuevo".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Obras/nuevo.jsp");
        } else if ("insert".equals(accion)) {
            String titulo = request.getParameter("titulo");
            String autor = request.getParameter("autor");
            int paginas = Integer.parseInt(request.getParameter("paginas"));
            String genero = request.getParameter("genero");
            String fechapublicacion = request.getParameter("fechapublicacion");
            String ubicacion = request.getParameter("ubicacion");
            int unidades = Integer.parseInt(request.getParameter("unidades"));
            
            Obras obras = new Obras("",titulo, autor, paginas, genero, fechapublicacion, ubicacion, unidades, 0, unidades);
            
            obrasDAO.insertar(obras);
            
            dispatcher = request.getRequestDispatcher("Obras/index.jsp");
            List<Obras> listaObras = obrasDAO.listarObras();
            request.setAttribute("lista", listaObras); 
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
