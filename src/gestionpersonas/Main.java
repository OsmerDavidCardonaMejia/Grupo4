package gestionpersonas;

public class Main
{
    public static void main(String[] args)
    {
        // Polimorfismo: Se crean objetos de tipo Persona que apuntan a subclases
        Persona doctor = new Doctor("Moises", 45, "Cardiologia");
        Persona deportista = new Deportista("Fabiana", 28, "Futbol");

        // Llamadas polimórficas al método mostrarInfo
        doctor.mostrarInfo();
        deportista.mostrarInfo();
        //Tarea Grupal 4
    }
}

