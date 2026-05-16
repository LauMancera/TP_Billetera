package ar.edu.ungs.billetera;

public class Divisa extends Inversion {
    private String monedaReferencia;
    private double tasa;

    public Divisa(String id, double monto, String fecha, int plazo, String tipo, String monedaReferencia, double tasa) {
        super(id, monto, fecha, plazo, tipo);
        this.monedaReferencia = monedaReferencia;
        this.tasa = tasa;
    }

    @Override
    public double calcularResultado(Cuenta cuenta) {
        if (esPrecancelado()) return 0;

        double cotizacionActual = Utilitarios.consultarCotizacion(monedaReferencia);
        return (getMonto() * tasa * plazo) * cotizacionActual;
    }
}