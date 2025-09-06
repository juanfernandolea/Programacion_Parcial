public class Libro {
    private String titulo;
    private String autor;
    private int numeroDeEjemplares;
    private int numeroDeEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroDeEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.numeroDeEjemplaresPrestados = 0;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }
    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }
    public int getNumeroDeEjemplaresPrestados() {
        return numeroDeEjemplaresPrestados;
    }
    public void setNumeroDeEjemplaresPrestados(int numeroDeEjemplaresPrestados) {
        this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }
    public boolean prestamoDeLibro() {
        if (numeroDeEjemplares > numeroDeEjemplaresPrestados) {
            numeroDeEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }
    public boolean devolucionDeLibro() {
        if (numeroDeEjemplaresPrestados > 0) {
            numeroDeEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroDeEjemplares=" + numeroDeEjemplares
                + ", numeroDeEjemplaresPrestados=" + numeroDeEjemplaresPrestados + "]";
    }
}