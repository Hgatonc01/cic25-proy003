package es.cic.curso25;

public class Coche {
    private int velocidad;
    private double consumo;

    public int getVelocidad() {
        // throw new UnsupportedOperationException("No implementado aun"); <- Metodos definidos pero no implementados
        return velocidad;
    }

    public double getConsumo() {
        return consumo;
    }

    public int acelerar(int incrementoDeVelocidad) {
        throw new UnsupportedOperationException("No implementado aun");
    }

    public int frenar(int decrementoDeVelocidad) {
        throw new UnsupportedOperationException("No implementado aun");
    }

}
