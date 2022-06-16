public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(19);
        cliente.setNombre("Tomas");
        cliente.setTelefono("2964 202136");
        cliente.setCredito(12000);
        System.out.println("Datos Cliente:");
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: $" + cliente.getCredito());
        System.out.println();

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(23);
        trabajador.setNombre("Tomas");
        trabajador.setTelefono("2964 232136");
        trabajador.setSalario(84000);
        System.out.println("Datos Trabajador:");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Credito: $" + trabajador.getSalario());

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

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}