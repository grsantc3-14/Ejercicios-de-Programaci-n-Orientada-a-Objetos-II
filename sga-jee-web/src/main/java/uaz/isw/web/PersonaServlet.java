package uaz.isw.web;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import uaz.isw.domain.Persona;
import uaz.isw.service.PersonaService;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    
    //Hacemos la injeccion de dependencias de PersonaService por medio de CDI
    @Inject
    PersonaService personaService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        List<Persona>personas=personaService.listarPersonas();
        System.out.println("personas:"+personas);
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);
        
    }
}
