public class Rectangulos {
    public static void main(String[] args) {
        Rectangulo rectanguloA = new Rectangulo(9, 11);
        System.out.println("Area del rectángulo 1: " + rectanguloA.area());
        System.out.println("Perimetro del rectángulo 1: " + rectanguloA.perimetro());
        System.out.println("");

        Rectangulo rectanguloB = new Rectangulo(10, 14);
        System.out.println("Area del rectángulo 1: " + rectanguloB.area());
        System.out.println("Perimetro del rectángulo 1: " + rectanguloB.perimetro());
        System.out.println("");

        Rectangulo rectanguloC = new Rectangulo(8, 2);
        System.out.println("Area del rectángulo 1: " + rectanguloC.area());
        System.out.println("Perimetro del rectángulo 1: " + rectanguloC.perimetro());
        System.out.println("");

        Rectangulo rectanguloD = new Rectangulo(26, 4);
        System.out.println("Area del rectángulo 1: " + rectanguloD.area());
        System.out.println("Perimetro del rectángulo 1: " + rectanguloD.perimetro());
        System.out.println("");



    }
}

class Rectangulo {
    double base;
    double altura;
    double area;
    double perimetro;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        area = base * altura;
        return area;
    }

    public double perimetro() {
        perimetro = 2 * (base + altura);
        return perimetro;
    }
}
