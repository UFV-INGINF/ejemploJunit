package org.dis;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        long salario_bruto=0;
        EmpleadoBR empleado = new EmpleadoBR();
        try {
            salario_bruto = empleado.calculaSalarioBruto("vendedor", 2000, 8);
        } catch (BRException e) {
            System.out.print(e);
        }
        System.out.print(salario_bruto);
    }
}
