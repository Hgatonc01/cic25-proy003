package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        cut.sumar(1);

        // Ejecuto
        cut.multiplicar(3.4);
        cut.multiplicar(3);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(10.2, valorActual, 0.000001, "La multiplicación ha fallado");

    }

    @Test
    public void testDividir() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(6);

        // Ejecuto
        cut.dividir(3);
        cut.dividir(1.1);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(1.818181, valorActual, 0.000001, "La división ha fallado");

    }

    //@Disabled <- Desabilitar un test, Run with Coverage
    @Test
    public void testDividirPorCero() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(4.2);

        // Ejecuto
        assertThrows(ArithmeticException.class, () -> cut.dividir(0));

    }

    @Test
    void testLimpiar() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(6);

        cut.limpiar();

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(0, valorActual);
    }
}
