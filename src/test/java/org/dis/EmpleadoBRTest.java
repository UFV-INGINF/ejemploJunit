package org.dis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmpleadoBRTest {

    long expected = 0;
    int horas=0;
    long ventas=0;
    String tipo = null;
    EmpleadoBR empleado=null;


    @Before
    public void setUp() throws Exception {

        horas=8;
        ventas=2000;
        tipo = "vendedor";
        empleado = new EmpleadoBR();
        expected =  1360;

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldAnswerWithTrue() throws BRException {
        assertEquals(expected,empleado.calculaSalarioBruto(tipo,ventas,horas));

   // assertTrue(true);
    }


}