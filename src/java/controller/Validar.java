package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuarios.Usuario;
import model.Usuarios.UsuarioDAO;

@WebServlet(name = "Validar", urlPatterns = {"/Validar"})
public class Validar extends HttpServlet {

    UsuarioDAO udao = new UsuarioDAO();
    Usuario usr = new Usuario();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validar</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Validar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String accion = request.getParameter("accion");
        if (accion.equals("Ingresar")) {
            String user = request.getParameter("txtuser");
            String pass = request.getParameter("txtpass");

            usr = udao.Validar(user, pass);
            if (usr.getId() != 0 && usr.getUsuario() != null && !usr.getUsuario().isEmpty()) {
                System.out.println("Usuario válido: " + usr.getUsuario());

                response.sendRedirect("Principal/Principal.jsp");
            } else {
                System.out.println("Usuario NO válido: " + usr.getUsuario());

                response.sendRedirect("index.jsp");
                System.out.println("NO SE ENVIO A PRINCIPAL 1");
            }

        } else {
            response.sendRedirect("index.jsp");

            System.out.println("NO SE ENVIO A PRINCIPAL 2");

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
