class Usuario {
    private String nombre;
    private List<Libro> librosRentados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosRentados = new ArrayList<>();
    }

    public String rentarLibro(Libro libro) {
        String mensaje = libro.rentar(this);
        if (mensaje.contains("rentado")) {
            this.librosRentados.add(libro);
        }
        return mensaje;
    }

    public String devolverLibro(Libro libro) {
        String mensaje = libro.devolver();
        if (mensaje.contains("devuelto")) {
            this.librosRentados.remove(libro);
        }
        return mensaje;
    }

    public String getNombre() {
        return this.nombre;
    }
}