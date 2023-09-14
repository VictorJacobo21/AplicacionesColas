package vj.simulacionordencompra;
import java.util.LinkedList;
import java.util.Queue;

class OrdenCompra {
    private String nombreCliente;
    private int cantidadProductos;

    public OrdenCompra(String nombreCliente, int cantidadProductos) {
        this.nombreCliente = nombreCliente;
        this.cantidadProductos = cantidadProductos;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }
}
