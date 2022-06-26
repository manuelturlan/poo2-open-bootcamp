public class App {
    public static void main(String[] args) throws Exception {
        Cliente persona1 = new Cliente();
        persona1.edad = 21;
        persona1.nombre = "Manuel";
        persona1.telefono = 595962;
        persona1.credito = "$5000";

        System.out.print("I'm " + persona1.edad + ". My name is " + persona1.nombre + ", my phone number is "
                + persona1.telefono + ". And in my bank account I have " + persona1.credito + ".");

        Trabajador trabajador1 = new Trabajador();

        trabajador1.edad = 28;
        trabajador1.nombre = "Roberto";
        trabajador1.telefono = 298437;
        trabajador1.salario = "$15000";

        System.out.print("I'm " + trabajador1.edad + ". My name is " + trabajador1.nombre + ", my phone number is "
                + trabajador1.telefono + ". And in my salary is " + trabajador1.salario + ".");
    }

    static class Persona {
        int edad;
        String nombre;
        int telefono;
    }

    static class Cliente extends Persona {
        String credito;
    }

    static class Trabajador extends Persona {
        String salario;
    }
}
