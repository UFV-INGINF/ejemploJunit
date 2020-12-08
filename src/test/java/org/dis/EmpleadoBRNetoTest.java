package org.dis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EmpleadoBRNetoTest {
    EmpleadoBR empleado = null;
    Float expected = (float) 0;

    @Before
    public void setUp() throws Exception {
        empleado = new EmpleadoBR();
        expected = (float) 1600;
        System.out.println(expected);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculaSalarioNetoTest() throws BRException {
        Float result = empleado.calculaSalarioNeto(2000);
        int is_equal = result.compareTo(expected);
        assertTrue(0==is_equal);
    }

}