package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        // Preparo
        Calculadora cut = new Calculadora();


        // Ejecuto
        cut.sumar(5.6);
        cut.sumar(3.4);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(9, valorActual, 0.000001, "La suma ha fallado");
    }

    @Test
    public void testRestar() {
        // Preparo
        Calculadora cut = new Calculadora();


        // Ejecuto
        cut.restar(3.4);
        cut.restar(-3);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(-0.4, valorActual, 0.000001, "La resta ha fallado");
    }

    @Test
    public void testMultiplicar() {
        // Preparo
        Calculadora cut = new Calculadora();


        // Ejecuto
        cut.sumar(1);
        cut.multiplicar(3.4);
        cut.multiplicar(3);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(10.2, valorActual, 0.000001, "La multiplicación ha fallado");

    }
}
