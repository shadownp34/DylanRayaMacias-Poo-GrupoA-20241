public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Agregar cuenta bancaria a un empleado");
            System.out.println("3. Mostrar información de todos los usuarios");
            System.out.println("4. Mostrar información de un usuario en específico");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreEmpleado = scanner.nextLine();
                    Empleado empleado = new Empleado(nombreEmpleado);
                    empleados.add(empleado);
                    System.out.println("Empleado agregado correctamente");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreEmpleadoCuenta = scanner.nextLine();
                    Empleado empleadoCuenta = null;
                    for (Empleado emp : empleados) {
                        if (emp.getNombre().equals(nombreEmpleadoCuenta)) {
                            empleadoCuenta = emp;
                            break;
                        }
                    }
                    if (empleadoCuenta != null) {
                        System.out.print("Ingrese el tipo de cuenta (A, B o C): ");
                        String tipoCuenta = scanner.nextLine();
                        System.out.print("Ingrese el saldo inicial: ");
                        double saldoInicial = scanner.nextDouble();
                        CuentaBancaria cuenta = new CuentaBancaria(tipoCuenta, saldoInicial);
                        empleadoCuenta.agregarCuenta(cuenta);
                        System.out.println("Cuenta bancaria agregada correctamente");
                    } else {
                        System.out.println("Empleado no encontrado");
                    }
                    break;
                case 3:
                    for (Empleado emp : empleados) {
                        System.out.println("Nombre del empleado: " + emp.getNombre());
                        ArrayList<CuentaBancaria> cuentas = emp.getCuentas();
                        for (CuentaBancaria cuenta : cuentas) {
                            System.out.println("Tipo de cuenta: " + cuenta.getTipoCuenta());
                            System.out.println("Saldo: " + cuenta.getSaldo());
                        }
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreEmpleadoInfo = scanner.nextLine();
                    for (Empleado emp : empleados) {
                        if (emp.getNombre().equals(nombreEmpleadoInfo)) {
                            System.out.println("Nombre del empleado: " + emp.getNombre());
                            ArrayList<CuentaBancaria> cuentas = emp.getCuentas();
                            for (CuentaBancaria cuenta : cuentas) {
                                System.out.println("Tipo de cuenta: " + cuenta.getTipoCuenta());
                                System.out.println("Saldo: " + cuenta.getSaldo());
                            }
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}