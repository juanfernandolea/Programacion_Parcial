import java.util.Scanner;   
public class App {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 5);
        
        System.out.println("Datos del libro 1: " + libro1);

        Libro libro2 = new Libro();

        System.out.println("Datos del libro 2: " + libro2);

        System.out.print("Ingrese el título del libro: ");
        String titulo = sc.nextLine();
        libro2.setTitulo(titulo);
        System.out.print("Ingrese el autor del libro: ");
        String autor = sc.nextLine();
        libro2.setAutor(autor);
        System.out.print("Ingrese el número de ejemplares: ");
        int ejemplares = sc.nextInt();
        libro2.setNumeroDeEjemplares(ejemplares);
        System.out.println("Datos del libro 2: " + libro2);

        sc.nextLine();
        boolean salir = false;
        while (!salir) {
            System.out.println("\nOpciones para libro2:");
            System.out.println("1. Prestar libro");
            System.out.println("2. Devolver libro");
            System.out.println("3. Mostrar datos del libro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = 0;
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida.");
                continue;
            }
            switch (opcion) {
                case 1:
                    if (libro2.prestamoDeLibro()) {
                        System.out.println("Préstamo realizado correctamente.");
                    } else {
                        System.out.println("No hay ejemplares disponibles para prestar.");
                    }
                    break;
                case 2:
                    if (libro2.devolucionDeLibro()) {
                        System.out.println("Devolución realizada correctamente.");
                    } else {
                        System.out.println("No hay ejemplares prestados para devolver.");
                    }
                    break;
                case 3:
                    System.out.println("Datos del libro 2: " + libro2);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
                
            }
        }
    sc.close();
    }

}
