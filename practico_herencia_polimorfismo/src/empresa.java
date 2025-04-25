import java.util.ArrayList;
import java.util.List;

public class empresa {
    private List<empleado> empleados = new ArrayList<>();

    public void agregarEmpleados(empleado e){
        this.empleados.add(e);
    }

    public void mostrarSalario(){
        for (empleado e : empleados){
            System.out.println(e.nombreCompleto() + ": $" + e.calcularSalario());
        }
    }

    public empleado empleadoConMasClientes(){
        int max = -1;
       empleado elMayor = null;
       for (empleado e : empleados) {
           if (e instanceof empleadoComision){
               empleadoComision eac = (empleadoComision) e;
               int cant = eac.getCantidadEmpleadosCaptados();
               if (cant > max) {
                   elMayor = e;
               }
           }
       }
       return elMayor;
    }

}
