//Mirian Fabiola Guzman Moreno
//202410050105
package gestionpersonas;

// Herencia: Clase Deportista heredada de la clase abstracta Persona
public class Deportista extends Persona 
{
    private String deporte; //Este es el encapsulamiento

    public Deportista(String nombre, int edad, String deporte)
    {
        super(nombre, edad); // A este le llame, llamada al constructor de la superclase
        this.deporte = deporte;
    }

    public String getDeporte() 
    {
        return deporte;
    }

    public void setDeporte(String deporte)
    {
        this.deporte = deporte;
    }

    // Polimorfismo: Implementación es el método abstracto de la superclase
    @Override
    public void mostrarInfo() 
    {
        System.out.println("Deportista: " + getNombre() + ", Edad: " + getEdad() + ", Deporte: " + deporte);
    }
}
