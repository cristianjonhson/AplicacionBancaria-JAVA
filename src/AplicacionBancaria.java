import java.util.Scanner;

public class AplicacionBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos del cliente
        String cliente = "Tony Stark";
        double saldo = 1599.99;

        System.out.println("Bienvenido a la aplicación bancaria");
        System.out.println("Cliente: " + cliente);

        int opcion;
        do {
            // Mostrar el menú
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Consultar saldo
                    System.out.printf("El saldo actual es: %.2f\n", saldo);
                    break;

                case 2:
                    // Retirar dinero
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    if (montoRetiro > saldo) {
                        System.out.println("Saldo insuficiente para realizar esta transacción.");
                    } else if (montoRetiro <= 0) {
                        System.out.println("El monto a retirar debe ser mayor a 0.");
                    } else {
                        saldo -= montoRetiro;
                        System.out.printf("Retiro exitoso. El saldo restante es: %.2f\n", saldo);
                    }
                    break;

                case 3:
                    // Depositar dinero
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    if (montoDeposito <= 0) {
                        System.out.println("El monto a depositar debe ser mayor a 0.");
                    } else {
                        saldo += montoDeposito;
                        System.out.printf("Depósito exitoso. El saldo actual es: %.2f\n", saldo);
                    }
                    break;

                case 9:
                    // Salir
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}
