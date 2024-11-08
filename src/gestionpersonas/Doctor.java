package gestionpersonas;

// La clase Doctor se hereda de la clase abstracta Persona
public class Doctor extends Persona 
{
    private String especialidad; // Realizamos el Encapsulamiento

    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad); // Se llama al constructor de la superclase
        this.especialidad = especialidad;
    }

    public String getEspecialidad() 
    {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) 
    {
        this.especialidad = especialidad;
    }

    // Polimorfismo: Se implementa el método abstracto de la superclase
    @Override
    public void mostrarInfo() 
    {
        System.out.println("Doctor: " + getNombre() + ", Edad: " + getEdad() + ", Especialidad: " + especialidad);
    }
}

