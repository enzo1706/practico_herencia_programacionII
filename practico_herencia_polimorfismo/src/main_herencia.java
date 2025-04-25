

public class main_herencia {
    public static void main(String[] args) {
         empresa emp = new empresa();

         emp.agregarEmpleados(new empleadoSalarioFijo("42456789", "Gustavo", "Gonzalez", 2020, 50000));
         emp.agregarEmpleados(new empleadoComision("45672893", "Rogelio", "Fernandez", 2012, 70000, 50,2000));
         emp.agregarEmpleados(new empleadoComision("40987123", "Fernando", "Perez", 2023, 50000, 20, 1500));
         emp.agregarEmpleados(new empleadoSalarioFijo("46923751", "Lucas", "García", 2018, 80000));

         emp.mostrarSalario();

        System.out.println(emp.empleadoConMasClientes().nombreCompleto());

    }
}
