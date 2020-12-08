package org.dis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EmpleadoBRTest{
    EmpleadoBR empleado = null;
    Float expectedNeto = (float) 0;
    Float expectedBruto = (float) 0;

    @Before
    public void setUp() throws Exception {
        empleado = new EmpleadoBR();
        expectedBruto = (float) 1360;
        expectedNeto = (float) 1640;
    }
    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCalculaSalarioBruto() throws BRException {
        Float result = empleado.calculaSalarioBruto("vendedor", 2000, 8);
        int is_equal = result.compareTo(expectedBruto);
        assertTrue(is_equal == 0);
    }

    @Test
    public void calculaSalarioNetoTest() throws BRException {
        Float result = empleado.calculaSalarioNeto(2000);
        int is_equal = result.compareTo(expectedNeto);
        assertTrue(0==is_equal);
    }
}