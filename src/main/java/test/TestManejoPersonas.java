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
//        personas.forEach( persona -> {
//            System.out.println(persona);
//        });

        //insertar persona
//        Persona personaNuevo = new Persona("Mario", "Alfaro", "car@ghg.com", "8554411");
//        int afectados = personaDAO.insertar(personaNuevo);
//        System.out.println("Campos afectados "+ afectados);
//        List<Persona> personasNuevas = personaDAO.seleccionar();
//        personasNuevas.forEach( p -> {
//            System.out.println(p);
//        });

        //update persona
//        Persona personaNuevo = new Persona(4,"Mario", "podero", "Mario@ghg.com", "8554411");
//        personaDAO.actualizar(personaNuevo);
//        List<Persona> personasNuevas = personaDAO.seleccionar();
//        personasNuevas.forEach( p -> {
//            System.out.println(p);
//        });

        //eliminar persona
            Persona persona = new Persona(4);
            int personasEli = personaDAO.eliminar(persona);
            System.out.println("Cantidad afectados "+personasEli);
            List<Persona> personasNuevas = personaDAO.seleccionar();
            personasNuevas.forEach( p -> {
                System.out.println(p);
            });
    }
}
