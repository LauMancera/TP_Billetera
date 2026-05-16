package ar.edu.ungs.billetera;

public class FondoEmpresarial extends Inversion {

    public FondoEmpresarial(String id, double monto, String fecha, int plazo, String tipo) {
        super(id, monto, fecha, plazo, tipo);
    }

    @Override
    public double calcularResultado(Cuenta cuenta) {
        if (esPrecancelado()) return 0;
        return getMonto() * 0.08;
    }
    @Override
    public boolean esPrecancelable() {
        return false;
    }
}