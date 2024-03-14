import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private String autor;
    private Usuario rentadoPor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.rentadoPor = null;
    }

    public String rentar(Usuario usuario) {
        if (this.rentadoPor == null) {
            this.rentadoPor = usuario;
            return "El libro '" + this.titulo + "' ha sido rentado por " + usuario.getNombre() + ".";
        } else {
            return "El libro '" + this.titulo + "' ya está rentado por " + this.rentadoPor.getNombre() + ".";
        }
    }

    public String devolver() {
        if (this.rentadoPor != null) {
            Usuario usuario = this.rentadoPor;
            this.rentadoPor = null;
            return "El libro '" + this.titulo + "' ha sido devuelto por " + usuario.getNombre() + ".";
        } else {
            return "El libro '" + this.titulo + "' no está rentado actualmente.";
        }
    }
}