package test;

import data.PersonaDAO;
import domain.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        List<Persona> personas = personaDAO.seleccionar();
        for(Persona persona: personas){
            System.out.println(persona);
        }
        personas.forEach( persona -> {
            System.out.println(persona);
        });
    }
}
