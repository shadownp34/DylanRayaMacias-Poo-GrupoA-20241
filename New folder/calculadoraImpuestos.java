public class CalculadoraImpuestos {
    public double calcularImpuestos(int ingresos) {
        return ingresos + 0.15;
    }

    public double calcularImpuestos(double ventas, double porcentajeImpuestos) {
        return ventas * (porcentajeImpuestos / 100);
    }

    public double calcularImpuestos(double dividendos, double porcentajeImpuestos, double exencion) {
        double impuestos = dividendos * (porcentajeImpuestos / 100);
        if (impuestos > exencion) {
            return impuestos - exencion;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos();

        System.out.println("Impuestos a los ingresos: $" + calculadora.calcularImpuestos(12500));
        System.out.println("Impuestos de ventas y porcentaje: $" + calculadora.calcularImpuestos(50000, 15.0));
        System.out.println("Impuestos dividendos,porcentaje impuestos y exencion: $" + calculadora.calcularImpuestos(20000, 15.0,5000));
    }
}