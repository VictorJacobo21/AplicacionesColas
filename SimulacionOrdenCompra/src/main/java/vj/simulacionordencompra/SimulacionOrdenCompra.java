package vj.simulacionordencompra;
import java.util.LinkedList;
import java.util.Queue;

public class SimulacionOrdenCompra {
    public static void main(String[] args) {
        Compania compania = new Compania();

        // Recibiendo órdenes
        compania.recibirOrden(new OrdenCompra("Cliente A", 5));
        compania.recibirOrden(new OrdenCompra("Cliente B", 10));
        compania.recibirOrden(new OrdenCompra("Cliente C", 8));

        // Verificando la cantidad de órdenes pendientes
        int ordenesPendientes = compania.cantidadOrdenesPendientes();
        System.out.println("Cantidad de órdenes pendientes: " + ordenesPendientes);

        // Procesando las órdenes
        System.out.println("Procesando órdenes...");
        compania.procesarOrdenes();

        // Verificando la cantidad de órdenes pendientes después de procesar
        ordenesPendientes = compania.cantidadOrdenesPendientes();
        System.out.println("Cantidad de órdenes pendientes después de procesar: " + ordenesPendientes);
    }
}