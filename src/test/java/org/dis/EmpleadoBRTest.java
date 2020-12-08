package org.dis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EmpleadoBRTest{
    EmpleadoBR empleado = null;
    Float expected = Float.parseFloat("0");

    @Before
    public void setUp() throws Exception {
        empleado = new EmpleadoBR();
        expected = (float) 1360;
        System.out.println(expected);
    }
    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCalculaSalarioBruto() throws BRException {
        Float result = empleado.calculaSalarioBruto("vendedor", 2000, 8);
        int is_equal = result.compareTo(expected);
        assertTrue(is_equal == 0);

    }
}