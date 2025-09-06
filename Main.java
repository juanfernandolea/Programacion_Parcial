public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setTitulo("Cien años de soledad");
        libro1.setAutor("Gabriel García Márquez");
        libro1.setNumEjemplares(3);


        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", 2, 0);

        System.out.println(libro1);
        System.out.println(libro2);

        System.out.println("Préstamo libro1: " + libro1.prestar());
        System.out.println(libro1);

        System.out.println("Devolución libro1: " + libro1.devolver());
        System.out.println(libro1);
    }
}
