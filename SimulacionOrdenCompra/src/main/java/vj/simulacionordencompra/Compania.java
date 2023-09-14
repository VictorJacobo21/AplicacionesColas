package vj.simulacionordencompra;
import java.util.LinkedList;
import java.util.Queue;

class Compania {
    private Queue<OrdenCompra> colaOrdenes = new LinkedList<>();

    public void recibirOrden(OrdenCompra orden) {
        colaOrdenes.add(orden);
        System.out.println("Orden recibida de " + orden.getNombreCliente() + ": " + orden.getCantidadProductos() + " productos.");
    }

    public void procesarOrdenes() {
        while (!colaOrdenes.isEmpty()) {
            OrdenCompra orden = colaOrdenes.poll();
            System.out.println("Procesando orden de " + orden.getNombreCliente() + ": " + orden.getCantidadProductos() + " productos.");
        }
    }

    public int cantidadOrdenesPendientes() {
        return colaOrdenes.size();
    }
}