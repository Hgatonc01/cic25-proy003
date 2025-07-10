package es.cic.curso25;

public class Coche {

    public final double CONSUMO_INSTANTANEO = 4.3;

    private Calculadora calculadora;

    public Coche(){
        this.calculadora = new Calculadora();
    }

    private int velocidad;
    
    public int getVelocidad() {
        // throw new UnsupportedOperationException("No implementado aun"); <- Metodos definidos pero no implementados
        return velocidad;
    }

    public double getConsumo() {  
        calculadora.limpiar();
        calculadora.sumar(velocidad);
        calculadora.dividir(100);
        calculadora.multiplicar(CONSUMO_INSTANTANEO);

        return calculadora.getTotal();
    }

    // TODO: Tratar caso velociad a partir de cierto punto
    public int acelerar(int incrementoDeVelocidad) {
        calculadora.limpiar();
        calculadora.sumar(velocidad);
        calculadora.sumar(incrementoDeVelocidad);

        this.velocidad = (int) Math.round(calculadora.getTotal());

        return velocidad;
    }

    // TODO: Tratar caso velocidad negativa
    public int frenar(int decrementoDeVelocidad) {
        calculadora.limpiar();
        calculadora.sumar(velocidad);
        calculadora.restar(decrementoDeVelocidad);

        this.velocidad = (int) Math.round(calculadora.getTotal());

        return velocidad;
    }

}
