package uaz.isw.service;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import uaz.isw.domain.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{

    @Override
    public List<Persona>listarPersonas() {
        List<Persona>personas= new ArrayList <>();
        personas.add(new Persona(1,"Juan","Perez","jperez@mail.com","9789891234"));
        personas.add(new Persona(2,"Marta","Suarez","msuarez@mail.com","4569871234"));
        personas.add(new Persona(3,"Luis","Garcia","lgarcia@mail.com","3437651209"));
        return personas;
    }

    @Override
    public Persona enontrarPersonaPorid(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
    }
    
}
