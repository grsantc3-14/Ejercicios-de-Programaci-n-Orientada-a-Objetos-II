package uaz.isw.service;

import java.util.List;
import javax.ejb.Remote;
import uaz.isw.domain.Persona;

@Remote
public interface PersonaServiceRemote {
    
    //Muestra la lista completa de personas (Select)
    public List<Persona>listarPersonas();
    
    //Muestra solo la persona que coincide con el id buscado (Select)
    public Persona enontrarPersonaPorid(Persona persona);
 
    //Muestra solo la persona que coincide con el email buscado (Select)
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    //Registrar una persona(insert)
    public void registrarPersona(Persona persona);
    
    //Modifica la informacion de una persona(update);
    public void modificarPersona(Persona persona);
    
    //Elimina la informacion de una persona(delete)
    public void eliminarPersona(Persona persona);
    
}
