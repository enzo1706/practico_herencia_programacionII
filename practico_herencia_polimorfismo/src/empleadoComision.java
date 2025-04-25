public class empleadoComision extends empleado {

    protected  double salarioMinimo;
    protected int cantidadEmpleadosCaptados;
    protected double montoPorCliente;

    public empleadoComision(String dni, String nombre, String apellido, int anio_ingreso, double salarioMinimo, int cantidadEmpleadosCaptados, double montoPorCliente) {
        super(dni, nombre, apellido, anio_ingreso);
        this.salarioMinimo = salarioMinimo;
        this.cantidadEmpleadosCaptados = cantidadEmpleadosCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public int getCantidadEmpleadosCaptados() {
        return cantidadEmpleadosCaptados;
    }

    @Override
    public double calcularSalario() {
        double sal = montoPorCliente * cantidadEmpleadosCaptados;
        if (sal < salarioMinimo){
            sal = salarioMinimo;
        }
        return sal;
    }
}
