import java.util.ArrayList;
import java.util.Scanner;

class CuentaBancaria {
    private String tipoCuenta;
    private double saldo;

    public CuentaBancaria(String tipoCuenta, double saldoInicial) {
        if (tipoCuenta.equals("A") || tipoCuenta.equals("B") || tipoCuenta.equals("C")) {
            this.tipoCuenta = tipoCuenta;
        } else {
            System.out.println("Tipo de cuenta no válido. Debe ser A, B o C.");
            return;
        }

        if (tipoCuenta.equals("A") && saldoInicial > 50000) {
            System.out.println("El saldo inicial máximo para una cuenta tipo A es $50,000.");
            return;
        } else if (tipoCuenta.equals("B") && saldoInicial > 100000) {
            System.out.println("El saldo inicial máximo para una cuenta tipo B es $100,000.");
            return;
        }

        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser mayor que cero.");
            return;
        }

        if (tipoCuenta.equals("A") && saldo + monto > 50000) {
            System.out.println("El saldo máximo para este tipo de cuenta es $50,000.");
            return;
        } else if (tipoCuenta.equals("B") && saldo + monto > 100000) {
            System.out.println("El saldo máximo para este tipo de cuenta es $100,000.");
            return;
        }

        saldo += monto;
        System.out.println("Se ha depositado $" + monto + " en la cuenta.");
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor que cero.");
            return;
        }

        if (saldo - monto < 0) {
            System.out.println("No hay suficiente saldo en la cuenta.");
            return;
        }

        if (tipoCuenta.equals("A") && saldo - monto < 1000) {
            System.out.println("El saldo mínimo para este tipo de cuenta es $1,000.");
            return;
        } else if (tipoCuenta.equals("B") && saldo - monto < 5000) {
            System.out.println("El saldo mínimo para este tipo de cuenta es $5,000.");
            return;
        } else if (tipoCuenta.equals("C") && saldo - monto < 10000) {
            System.out.println("El saldo mínimo para este tipo de cuenta es $10,000.");
            return;
        }

        saldo -= monto;
        System.out.println("Se ha retirado $" + monto + " de la cuenta.");
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

}