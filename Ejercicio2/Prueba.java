package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Carlos", 45);
        System.out.println("Información de la persona:");
        persona.mostrarInformacion();

        System.out.println();

       
        Estudiante estudiante = new Estudiante("Ana", 20, "2023ABC123");
        System.out.println("Información del estudiante:");
        estudiante.mostrarInformacion();
    }
}

