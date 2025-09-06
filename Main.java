import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro libro = null; // todavía no creado
        int opcion;

        do {
            System.out.println("\n===== MENÚ LIBROS =====");
            System.out.println("1. Crear libro");
            System.out.println("2. Mostrar libro");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese número de ejemplares: ");
                    int ejemplares = sc.nextInt();
                    libro = new Libro(titulo, autor, ejemplares, 0);
                    System.out.println("Libro creado correctamente.");
                    break;

                case 2:
                    if (libro != null) {
                        System.out.println(libro);
                    } else {
                        System.out.println("No hay libro creado.");
                    }
                    break;

                case 3:
                    if (libro != null) {
                        if (libro.prestar()) {
                            System.out.println("Se prestó un ejemplar.");
                        } else {
                            System.out.println("No hay ejemplares disponibles.");
                        }
                    } else {
                        System.out.println("No hay libro creado.");
                    }
                    break;

                case 4:
                    if (libro != null) {
                        if (libro.devolver()) {
                            System.out.println("Se devolvió un ejemplar.");
                        } else {
                            System.out.println("No hay libros prestados.");
                        }
                    } else {
                        System.out.println("No hay libro creado.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}