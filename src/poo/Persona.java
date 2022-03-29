package poo;

public class Persona {

    private String nombre;
    private int edad;
    private char genero;

    public Persona() {

    }
    // crear constructor, inicializa la intancia de la clase
    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
// metodos getter y setter acceder a un dato de tipo privado

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

   
}
