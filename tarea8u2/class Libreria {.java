class Libreria {
    private List<Usuario> usuarios;
    private List<Libro> libros;

    public Libreria() {
        this.usuarios = new ArrayList<>();
        this.libros = new ArrayList<>();
    }

    public String registrarUsuario(String nombre) {
        Usuario usuario = new Usuario(nombre);
        this.usuarios.add(usuario);
        return "Usuario '" + nombre + "' registrado correctamente.";
    }

    public String registrarLibro(String titulo, String autor) {
        Libro libro = new Libro(titulo, autor);
        this.libros.add(libro);
        return "Libro '" + titulo + "' de " + autor + " registrado correctamente.";
    }

    public List<String> listarUsuarios() {
        List<String> nombresUsuarios = new ArrayList<>();
        for (Usuario usuario : this.usuarios) {
            nombresUsuarios.add(usuario.getNombre());
        }
        return nombresUsuarios;
    }

    public List<String[]> listarLibros() {
        List<String[]> listaLibros = new ArrayList<>();
        for (Libro libro : this.libros) {
            listaLibros.add(new String[]{libro.titulo, libro.autor});
        }
        return listaLibros;
    }

    public List<String[]> listarUsuariosConLibros() {
        List<String[]> listaUsuariosConLibros = new ArrayList<>();
        for (Usuario usuario : this.usuarios) {
            List<String> titulosLibros = new ArrayList<>();
            for (Libro libro : usuario.librosRentados) {
                titulosLibros.add(libro.titulo);
            }
            listaUsuariosConLibros.add(new String[]{usuario.nombre, String.join(", ", titulosLibros)});
        }
        return listaUsuariosConLibros;
    }

    public List<String[]> listarLibrosNoRentados() {
        List<String[]> listaLibrosNoRentados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.rentadoPor == null) {
                listaLibrosNoRentados.add(new String[]{libro.titulo, libro.autor});
            }
        }
        return listaLibrosNoRentados;
    }

    public List<String[]> listarLibrosRentados() {
        List<String[]> listaLibrosRentados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.rentadoPor != null) {
                listaLibrosRentados.add(new String[]{libro.titulo, libro.autor, libro.rentadoPor.getNombre()});
            }
        }
        return listaLibrosRentados;
    }
}