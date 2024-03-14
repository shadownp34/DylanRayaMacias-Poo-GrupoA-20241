class Banco {
    private ArrayList<CuentaBancaria> cuentasBancarias;

    public Banco() {
        this.cuentasBancarias = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentasBancarias.add(cuenta);
    }

    public void listarTodasLasCuentas() {
        for (CuentaBancaria cuenta : cuentasBancarias) {
            System.out.println("Tipo de cuenta: " + cuenta.getTipoCuenta());
            System.out.println("Saldo: " + cuenta.getSaldo());
            System.out.println();
        }
    }

    public void mostrarCuenta(String tipoCuenta) {
        for (CuentaBancaria cuenta : cuentasBancarias) {
            if (cuenta.getTipoCuenta().equals(tipoCuenta)) {
                System.out.println("Tipo de cuenta: " + cuenta.getTipoCuenta());
                System.out.println("Saldo: " + cuenta.getSaldo());
                return;
            }
        }
        System.out.println("No se encontró ninguna cuenta con el tipo especificado.");
    }
}