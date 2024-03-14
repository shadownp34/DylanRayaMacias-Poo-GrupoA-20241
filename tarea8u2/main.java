import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inicio:");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Registrar libro");
            System.out.println("3. Rentar libro");
            System.out.println("4. Listar todos los usuarios registrados");
            System.out.println("5. Listar todos los libros registrados");
            System.out.println("6. Listar todos los usuarios que hayan rentado al menos un libro");
            System.out.println("7. Listar todos los libros no rentados");
            System.out.println("8. Listar todos los libros rentados");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombreUsuario = scanner.nextLine();
                    System.out.println(libreria.registrarUsuario(nombreUsuario));
                    break;
                case 2:
                    System.out.print("Ingrese el titulo del libro: ");
                    String tituloLibro = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autorLibro = scanner.nextLine();
                    System.out.println(libreria.registrarLibro(tituloLibro, autorLibro));
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombreUsuarioRenta = scanner.nextLine();
                    System.out.print("Ingrese el titulo del libro a rentar: ");
                    String tituloLibroRenta = scanner.nextLine();
                    Usuario usuarioRenta = libreria.buscarUsuario(nombreUsuarioRenta);
                    Libro libroRenta = libreria.buscarLibro(tituloLibroRenta);
                    if (usuarioRenta != null && libroRenta != null) {
                        System.out.println(usuarioRenta.rentarLibro(libroRenta));
                    } else {
                        System.out.println("Usuario o libro no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Usuarios registrados:");
                    System.out.println(libreria.listarUsuarios());
                    break;
                case 5:
                    System.out.println("Libros registrados:");
                    System.out.println(libreria.listarLibros());
                    break;
                case 6:
                    System.out.println("Usuarios que han rentado al menos un libro:");
                    System.out.println(libreria.listarUsuariosConLibros());
                    break;
                case 7:
                    System.out.println("Libros no rentados:");
                    System.out.println(libreria.listarLibrosNoRentados());
                    break;
                case 8:
                    System.out.println("Libros rentados:");
                    System.out.println(libreria.listarLibrosRentados());
                    break;
                case 9:
                    System.out.println("Saliendo");
                    return;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        }
    }
}