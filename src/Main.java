import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;
        double salario;
        String nombre;
        boolean estudiante;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        System.out.print("Ingrese su salario: ");
        salario = sc.nextDouble();

        System.out.print("¿Es estudiante? (true/false): ");
        estudiante = sc.nextBoolean();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Estudiante: " + estudiante);

        System.out.print("Ingrese primer número entero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese segundo número entero: ");
        int b = sc.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));

        System.out.print("Ingrese una edad para clasificar: ");
        int edadPersona = sc.nextInt();

        if (edadPersona < 12) {
            System.out.println("Niño");
        } else if (edadPersona <= 17) {
            System.out.println("Adolescente");
        } else if (edadPersona <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }

        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Número inválido");
        }

        sc.nextLine(); // limpiar buffer

        String usuarioCorrecto = "admin";
        String passwordCorrecta = "1234";

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Contraseña: ");
        String password = sc.nextLine();

        if (!usuario.equals(usuarioCorrecto)) {
            System.out.println("Usuario no registrado");
        } else if (!password.equals(passwordCorrecta)) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Acceso concedido");
        }

        sc.close();
    }
}