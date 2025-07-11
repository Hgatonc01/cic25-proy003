package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CocheIntegrationTest {

    private Coche cut;

    @BeforeEach
    public void setUp() {
        cut = new Coche();
    }

    @Test
    void testAcelerar() {
        cut.acelerar(34);
        int velocidadFinal = cut.acelerar(23);

        assertEquals(57, velocidadFinal);
    }

    @Test
    void testFrenar() {
        cut.acelerar(50);
        int velocidadFinal = cut.frenar(23);

        assertEquals(27, velocidadFinal);
    }

    @Test
    void testGetConsumo() {
        cut.acelerar(50);

        double consumoActual = cut.getConsumo();

        assertEquals(2.15, consumoActual, 0.001);
    }

    @Test
    void testGetVelocidad() {
        cut.acelerar(50);

        int velocidadFinal = cut.getVelocidad();

        assertEquals(50, velocidadFinal);
    }

    @Test
    void testAcelerarMas300() {
        cut.acelerar(299);
        int velocidadFinal = cut.acelerar(23);

        assertEquals(300, velocidadFinal);
    }

    @Test
    void testFrenarMenos0() {
        cut.acelerar(50);
        int velocidadFinal = cut.frenar(60);

        assertEquals(0, velocidadFinal);
    }
}
