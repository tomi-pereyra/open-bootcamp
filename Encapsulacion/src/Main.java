public class Main {
    public static void main(String[] args) {

        //Practicando el encapsulamiento. Creando una clase Persona encapsulando sus propiedades. Practicando con getters y setters
        Persona persona = new Persona();
        persona.setEdad(19);
        persona.setNombre("Tomas");
        persona.setTelefono("2964 205430");

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}