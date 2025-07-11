package credito.service;

import credito.modelos.Empleado;
import credito.repository.EmpleadoRepository;
import credito.modelos.Cliente;

public class EmpleadoService {

    private EmpleadoRepository empleadoRepository = new EmpleadoRepository();

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public void crearEmpleado(Empleado empleado) {
        empleadoRepository.crearEmpleado(empleado);
    }

    public void borrarEmpleado(String identificacion) {
        empleadoRepository.borrarEmpleado(identificacion);
    }

    public Empleado buscarEmpleado(String identificacion) {
        return empleadoRepository.buscarEmpleado(identificacion);
    }

    public void listarEmpleados() {
        empleadoRepository.listarEmpleados();
    }

    public void crearCliente(Cliente cliente) {
        empleadoRepository.crearCliente(cliente);
    }

    public void borrarCliente(String identificacion) {
        empleadoRepository.borrarCliente(identificacion);
    }

    public Cliente buscarCliente(String identificacion) {
        return empleadoRepository.buscarCliente(identificacion);
    }

    public void listarClientes() {
        empleadoRepository.listarClientes();
    }

}
