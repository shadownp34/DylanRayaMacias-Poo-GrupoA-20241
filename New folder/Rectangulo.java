public class Rectangulo {
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int calcularArea(int lado1, int lado2) {
        return lado1 * lado2;
    }

    public double calcularArea(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public int calcularPerimetro(int lado1, int lado2) {
        return 2 * (lado1 + lado2);
    }

    public double calcularPerimetro(double lado1, double lado2) {
        return 2 * (lado1 + lado2);
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10.7, 3.5);

        System.out.println("Area del rectangulo: " + rectangulo.calcularArea(12, 3));
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea(20.6, 10.8));
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro(7, 9));
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro(52.2, 15.9));
    }
}