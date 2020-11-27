package org.dis;

import com.sun.xml.internal.ws.policy.privateutil.RuntimePolicyUtilsException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Float salario_bruto = Float.valueOf(0);
        EmpleadoBR empleado = new EmpleadoBR();
        try {
            salario_bruto = empleado.calculaSalarioBruto("vendedor", 1500, 3);
        } catch (BRException e) {
            System.out.print(e);
        }
        System.out.print(salario_bruto);
    }
}
