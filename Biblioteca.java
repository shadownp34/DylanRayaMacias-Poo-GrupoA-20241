

public class Biblioteca {
    public static void main(String[] args) {
        Libro libroA = new Libro();
        libroA.titulo = "La Odisea";
        libroA.autor = "Homero";
        libroA.anio = 1928;
        System.out.println("Título: " + libroA.titulo);
        System.out.println("Autor: " + libroA.autor);
        System.out.println("Año: " + libroA.anio);
        System.out.println("");

        Libro libroB = new Libro();
        libroB.titulo = "Don Quijote";
        libroB.autor = "Miguel de Cervantes";
        libroB.anio = 1605;
        System.out.println("Título: " + libroB.titulo);
        System.out.println("Autor: " + libroB.autor);
        System.out.println("Año: " + libroB.anio);
        System.out.println("");

        Libro libroC = new Libro();
        libroC.titulo = "Dragon ball";
        libroC.autor = "Akira Toriyama";
        libroC.anio = 1985;
        System.out.println("Título: " + libroC.titulo);
        System.out.println("Autor: " + libroC.autor);
        System.out.println("Año: " + libroC.anio);
        System.out.println("");

        Libro libroD = new Libro();
        libroD.titulo = "Wigetta";
        libroD.autor = "Vegetta y Willirex";
        libroD.anio = 2015;
        System.out.println("Título: " + libroD.titulo);
        System.out.println("Autor: " + libroD.autor);
        System.out.println("Año: " + libroD.anio);
        System.out.println("");

    }
}

class Libro {
    String titulo;
    String autor;
    int anio;
}