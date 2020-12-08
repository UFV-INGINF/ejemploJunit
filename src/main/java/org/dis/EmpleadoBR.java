package org.dis;

public class EmpleadoBR {


    public EmpleadoBR() {
    }
    private long total_salario=0;



    long calculaSalarioBruto(String tipo,long ventasMes, long horasExtra) throws BRException {

        total_salario=0;

        if (tipo=="" || ventasMes<0 || horasExtra < 0){

            throw new BRException("Valores de entrada mal escritos");

        }

        if(tipo == TipoEmpleado.encargado){
            total_salario=1500;


        }else {

            total_salario=1000;




        }

        if (ventasMes<1500){

            total_salario+=100;
        }else{

            total_salario+=200;

        }

        total_salario+=horasExtra*20;



        return total_salario;
    }


}
