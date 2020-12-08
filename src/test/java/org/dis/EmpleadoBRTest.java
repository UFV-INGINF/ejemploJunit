package org.dis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmpleadoBRTest{
    EmpleadoBR empleado = null;
    Float expected = Float.parseFloat("0");

    @Before
    public void setUp() throws Exception {
        empleado = new EmpleadoBR();
        expected = Float.parseFloat("1360");
        System.out.println(expected);
    }
    @Test
    public void tearDown() throws Exception {
        System.out.print(empleado.calculaSalarioBruto("vendedor", 2100, 8));
        Float result = empleado.calculaSalarioBruto("vendedor", 2000, 8);
        Boolean is_equal = result == expected;
        assertTrue(is_equal);

    }
    @After
    public void testCalculaSalarioBruto() {
    }
}