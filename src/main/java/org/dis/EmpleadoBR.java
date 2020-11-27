package org.dis;

public class EmpleadoBR {


    public EmpleadoBR() {
    }

    float calculaSalarioBruto(
            String tipo,
            float ventasMes,
            float horasExtra) throws BRException {

        if (tipo=="" || ventasMes < 0 || horasExtra < 0) {
            throw new BRException("Valores de entrada no válidos");
        }

        float total_salario = 0;

        if (tipo == TipoEmpleado.vendedor) {
            total_salario += TipoEmpleado.sueldo_base_vendedor;
        } else if (tipo == TipoEmpleado.encargado) {
            total_salario += TipoEmpleado.sueldo_base_encargado;
        }

        if (ventasMes >= 1000 && ventasMes < 1500) {
            total_salario += 100;
        } else if (ventasMes >= 1500) {
            total_salario += 200;
        }

        float salario_extra = horasExtra * TipoEmpleado.precio_hora;

        total_salario += salario_extra;




        return total_salario;

    }


}
