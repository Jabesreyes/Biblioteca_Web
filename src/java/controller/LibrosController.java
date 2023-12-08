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
import model.Materiales.Libros;
import model.Materiales.LibrosDAO;

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

        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("Libros/index.jsp");
            List<Libros> listaLibros = librosDAO.listarLibros();
            request.setAttribute("lista", listaLibros);
        } else if ("nuevo".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Libros/nuevo.jsp");
        } else if ("insert".equals(accion)) {
            String titulo = request.getParameter("titulo");
            String autor = request.getParameter("autor");
            int paginas = Integer.parseInt(request.getParameter("paginas"));
            String editorial = request.getParameter("editorial");
            String isbn = request.getParameter("isbn");
            String fechapublicacion = request.getParameter("fechapublicacion");
            String ubicacion = request.getParameter("ubicacion");
            int unidades = Integer.parseInt(request.getParameter("unidades"));
            
            Libros libro = new Libros("",titulo, autor, paginas, editorial, isbn, fechapublicacion, ubicacion, unidades, 0, unidades);
            
            librosDAO.insertar(libro);
            
            dispatcher = request.getRequestDispatcher("Libros/index.jsp");
            List<Libros> listaLibros = librosDAO.listarLibros();
            request.setAttribute("lista", listaLibros); 
        }else if ("actualizar".equals(accion)) {
            String codigoidentificacion = request.getParameter("codigodentificacion");
            String titulo = request.getParameter("titulo");
            String autor = request.getParameter("autor");
            int paginas = Integer.parseInt(request.getParameter("paginas"));
            String editorial = request.getParameter("editorial");
            String isbn = request.getParameter("isbn");
            String fechapublicacion = request.getParameter("fechapublicacion");
            String ubicacion = request.getParameter("ubicacion");
            int unidades = Integer.parseInt(request.getParameter("unidades"));
            
            Libros libro = new Libros(codigoidentificacion,titulo, autor, paginas, editorial, isbn, fechapublicacion, ubicacion, unidades, 0, unidades);
            
            librosDAO.actualizar(libro);
            
            dispatcher = request.getRequestDispatcher("Libros/index.jsp");
            List<Libros> listaLibros = librosDAO.listarLibros();
            request.setAttribute("lista", listaLibros); 
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
