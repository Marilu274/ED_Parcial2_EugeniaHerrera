import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaDobleCircular lista = new ListaDobleCircular();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n========================================");
            System.out.println("   LISTA DOBLEMENTE ENLAZADA CIRCULAR  ");
            System.out.println("========================================");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar al inicio");
            System.out.println("4. Eliminar al final");
            System.out.println("5. Buscar elemento");
            System.out.println("6. Imprimir lista");
            System.out.println("7. Salir");
            System.out.println("========================================");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a insertar al inicio: ");
                    int datoInicio = scanner.nextInt();
                    lista.insertarAlInicio(datoInicio);
                    System.out.println("✔ Elemento insertado al inicio.");
                    lista.imprimir();
                    break;

                case 2:
                    System.out.print("Ingrese el dato a insertar al final: ");
                    int datoFinal = scanner.nextInt();
                    lista.insertarAlFinal(datoFinal);
                    System.out.println("✔ Elemento insertado al final.");
                    lista.imprimir();
                    break;

                case 3:
                    lista.eliminarAlInicio();
                    System.out.println("✔ Elemento eliminado del inicio.");
                    lista.imprimir();
                    break;

                case 4:
                    lista.eliminarAlFinal();
                    System.out.println("✔ Elemento eliminado del final.");
                    lista.imprimir();
                    break;

                case 5:
                    System.out.print("Ingrese el elemento a buscar: ");
                    int valorBuscado = scanner.nextInt();
                    System.out.println(lista.buscar(valorBuscado));
                    break;

                case 6:
                    lista.imprimir();
                    break;

                case 7:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 7);

        scanner.close();
    }
}
