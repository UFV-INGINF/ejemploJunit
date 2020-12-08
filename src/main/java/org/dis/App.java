package org.dis;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Float salario_bruto = Float.valueOf(0);
        Float salario_neto = (float) 0;
        EmpleadoBR empleado = new EmpleadoBR();
        try {
            salario_bruto = empleado.calculaSalarioBruto("vendedor", 2000, 3);
            salario_neto = empleado.calculaSalarioNeto(-1);
        } catch (BRException e) {
            System.out.print(e);
        }
    }
}
