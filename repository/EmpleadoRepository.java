package credito.repository;

import credito.modelos.Cliente;
import credito.modelos.Empleado;
import java.util.ArrayList;

public class EmpleadoRepository {
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    //crear un cliente desde el sistema
    public void crearCliente(Cliente cliente) {
        if(cliente.getEdad() < 18) {
            System.out.println("El cliente debe ser mayor de edad para crear un cliente.");
            return;
        }else{
            clientes.add(cliente);
            System.out.println("El cliente " + cliente.getNombre() + " ha sido creado correctamente.");
        } 
    }

    //borrar cliente desde el sistema
    public void borrarCliente(String identificacion) {
        for(Cliente cliente : clientes) {
            if(cliente.getCedula().equals(identificacion)) {
                clientes.remove(cliente);
                System.out.println("El cliente " + cliente.getNombre() + " ha sido eliminado correctamente.");
                return;
            }else{
                System.out.println("El cliente con la cedula " + identificacion + " no existe.");
            }
        }
    }

    //buscar cliente por cedula
    public Cliente buscarCliente(String identificacion) {
        for(Cliente cliente : clientes) {
            if(cliente.getCedula().equals(identificacion)) {
                System.out.println("El cliente " + cliente.getNombre() + " ha sido encontrado.");
                return cliente;
            }
        }
        System.out.println("El cliente con la cedula " + identificacion + " no existe.");
        return null;
    }

    //listar todos los clientes
    public void listarClientes() {
        if(clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Lista de clientes:");
            for(Cliente cliente : clientes) {
                System.out.println("Nombre: " + cliente.getNombre() + ", Cedula: " + cliente.getCedula() + ", Edad: " + cliente.getEdad());
            }
        }
    }

    //crear un empleado desde el sistema
    public void crearEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("El empleado " + empleado.getNombreEmpleado() + " ha sido creado correctamente.");
    }
    //borrar empleado desde el sistema
    public void borrarEmpleado(String n_identificacion) {
        for(Empleado empleado : empleados) {
            if(empleado.getN_identificacion().equals(n_identificacion)) {
                empleados.remove(empleado);
                System.out.println("El empleado " + empleado.getNombreEmpleado() + " ha sido eliminado correctamente.");
                return;
            } else {
                System.out.println("El empleado con la identificacion " + n_identificacion + " no existe.");
            }
        }
    }
    //buscar empleado por identificacion
    public Empleado buscarEmpleado(String n_identificacion) {
        for(Empleado empleado : empleados) {
            if(empleado.getN_identificacion().equals(n_identificacion)) {
                System.out.println("El empleado " + empleado.getNombreEmpleado() + " ha sido encontrado.");
                return empleado;
            }
        }
        System.out.println("El empleado con la identificacion " + n_identificacion + " no existe.");
        return null;
    }

    //listar todos los empleados
    public void listarEmpleados() {
        if(empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for(Empleado empleado : empleados) {
                System.out.println("Nombre: " + empleado.getNombreEmpleado() + ", Identificacion: " + empleado.getN_identificacion() + ", Usuario: " + empleado.getUsuario());
            }
        }
    }

}
