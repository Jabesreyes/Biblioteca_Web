package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuarios.UsuarioDAO;

@WebServlet(name = "ConfiguracionesController", urlPatterns = {"/ConfiguracionesController"})
public class ConfiguracionesController extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id_tipo = request.getParameter("id_tipo");
        String limite = request.getParameter("limite");

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        boolean resultado = usuarioDAO.actualizarLimite(id_tipo, limite);

        if (resultado) {
            // El límite de préstamos se actualizó correctamente
            // Redirige al usuario a la página de inicio
            response.sendRedirect("Inicio.jsp");
        } else {
            // Hubo un error al actualizar el límite de préstamos
            // Redirige al usuario a una página de error
            response.sendRedirect("Error.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
