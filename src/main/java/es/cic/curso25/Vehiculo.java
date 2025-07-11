package es.cic.curso25;

public class Vehiculo {

    public final double CONSUMO_INSTANTANEO = 4.3;

    protected Calculadora calculadora;
    protected int velocidad;

    public Vehiculo() {
        this.calculadora = new Calculadora();
    }

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

    public int acelerar(int incrementoDeVelocidad) {
        calculadora.limpiar();
        calculadora.sumar(velocidad);
        calculadora.sumar(incrementoDeVelocidad);

        this.velocidad = (int) Math.round(calculadora.getTotal());

        if(velocidad > 300) {
            // Se podria hacer con: return velocidad = 300;
            int diferencia = velocidad - 300;
            velocidad -= diferencia;
            return velocidad;
        }else {
            return velocidad;
        }
    }

    public int frenar(int decrementoDeVelocidad) {
        calculadora.limpiar();
        calculadora.sumar(velocidad);
        calculadora.restar(decrementoDeVelocidad);

        this.velocidad = (int) Math.round(calculadora.getTotal());

        if(velocidad < 0) {
            // Se podria hacer con: return velocidad = 0;
            velocidad -= velocidad;
            return velocidad;
        }else {
            return velocidad;
        }

    }

}
