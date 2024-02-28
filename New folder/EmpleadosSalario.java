public class Empleado {
    public double calcularSalario(double sueldoBase) {
        return sueldoBase;
    }

    public double calcularSalario(double sueldoBase, double bonificacion) {
        return sueldoBase + bonificacion;
    }

    public double calcularSalario(double sueldoBase, double bonificacion, int horasExtras) {
        return sueldoBase + bonificacion + (horasExtras * 20);
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        System.out.println("Salario del empleado (solo sueldo): $" + empleado.calcularSalario(4500.0));
        System.out.println("Salario del empleado (sueldo y bonificación): $" + empleado.calcularSalario(4500.0, 600.0));
        System.out.println("Salario del empleado (sueldo, bonificación y horas extras): $" + empleado.calcularSalario(4500.0, 600.0, 6));
    }
}
