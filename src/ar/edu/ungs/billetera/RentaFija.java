package ar.edu.ungs.billetera;

public class RentaFija extends Inversion {
    private double tasaInteres;

    public RentaFija(String id, double monto, String fecha, int plazo, String tipo, double tasaInteres) {
        super(id, monto, fecha, plazo, tipo);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public double calcularResultado(Cuenta cuenta) {
        if (esPrecancelado()) return 0;
        return getMonto() * tasaInteres * plazo;
    }
}