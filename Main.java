import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Libro predeterminado
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 3, 0);

        // Libro creado por el usuario (inicia nulo)
        Libro libro2 = null;

        int opcion;
        do {
            System.out.println("\n===== MENÚ LIBROS =====");
            System.out.println("1. Crear libro (por consola)");
            System.out.println("2. Mostrar libros");
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
                    libro2 = new Libro(titulo, autor, ejemplares, 0);
                    System.out.println("Libro creado correctamente.");
                    break;

                case 2:
                    System.out.println("\n--- Libro predeterminado ---");
                    System.out.println(libro1);
                    System.out.println("\n--- Libro creado por consola ---");
                    if (libro2 != null) {
                        System.out.println(libro2);
                    } else {
                        System.out.println("No hay libro creado por consola.");
                    }
                    break;

                case 3:
                    System.out.println("¿De qué libro desea prestar? (1 = predeterminado, 2 = creado)");
                    int prestamo = sc.nextInt();
                    if (prestamo == 1) {
                        if (libro1.prestar()) {
                            System.out.println("Se prestó un ejemplar del libro predeterminado.");
                        } else {
                            System.out.println("No hay ejemplares disponibles del libro predeterminado.");
                        }
                    } else if (prestamo == 2 && libro2 != null) {
                        if (libro2.prestar()) {
                            System.out.println("Se prestó un ejemplar del libro creado.");
                        } else {
                            System.out.println("No hay ejemplares disponibles del libro creado.");
                        }
                    } else {
                        System.out.println("Opción inválida o libro no creado.");
                    }
                    break;

                case 4:
                    System.out.println("¿De qué libro desea devolver? (1 = predeterminado, 2 = creado)");
                    int devolucion = sc.nextInt();
                    if (devolucion == 1) {
                        if (libro1.devolver()) {
                            System.out.println("Se devolvió un ejemplar al libro predeterminado.");
                        } else {
                            System.out.println("No hay ejemplares prestados del libro predeterminado.");
                        }
                    } else if (devolucion == 2 && libro2 != null) {
                        if (libro2.devolver()) {
                            System.out.println("Se devolvió un ejemplar al libro creado.");
                        } else {
                            System.out.println("No hay ejemplares prestados del libro creado.");
                        }
                    } else {
                        System.out.println("Opción inválida o libro no creado.");
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
