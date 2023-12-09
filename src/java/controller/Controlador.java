package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");

        switch (accion) {
            case "Inicio":
                request.getRequestDispatcher("Inicio.jsp").forward(request, response);
                break;
            case "Principal":
                request.getRequestDispatcher("Prinicipal/Principal.jsp").forward(request, response);
                break;
            case "Catalogo":
                request.getRequestDispatcher("Catalogo.jsp").forward(request, response);
                break;
            case "Configuraciones":
                request.getRequestDispatcher("Configuraciones.jsp").forward(request, response);
                break;
            case "Devoluciones":
                request.getRequestDispatcher("Devoluciones.jsp").forward(request, response);
                break;
            case "Mora":
                request.getRequestDispatcher("Mora.jsp").forward(request, response);
                break;
            case "Prestamos":
                request.getRequestDispatcher("Prestamos.jsp").forward(request, response);
                break;
            case "Reestablecer":
                request.getRequestDispatcher("RContraseña.jsp").forward(request, response);
                break;
            case "Registrar":
                request.getRequestDispatcher("Registrar.jsp").forward(request, response);
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
