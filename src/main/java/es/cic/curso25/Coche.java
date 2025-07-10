package es.cic.curso25;

public class Coche {
    private int velocidad;
    private double consumo;
    public final double CONSUMO_INSTANTANEO = 4.3;

    public int getVelocidad() {
        // throw new UnsupportedOperationException("No implementado aun"); <- Metodos definidos pero no implementados
        return velocidad;
    }

    public double getConsumo() {
        consumo = ((double)velocidad) / 100 * CONSUMO_INSTANTANEO;

        return consumo;
    }

    // TODO: Tratar caso velociad a partir de cierto punto
    public int acelerar(int incrementoDeVelocidad) {
        this.velocidad += incrementoDeVelocidad;

        return velocidad;
    }

    // TODO: Tratar caso velocidad negativa
    public int frenar(int decrementoDeVelocidad) {
        this.velocidad -= decrementoDeVelocidad;

        return velocidad;
    }

}
