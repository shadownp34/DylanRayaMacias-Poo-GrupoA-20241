class Empleado {
    private String nombre;
    private ArrayList<CuentaBancaria> cuentas;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentas;
    }
}