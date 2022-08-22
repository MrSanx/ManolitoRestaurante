package vista;

/**
 * El cliente le solicita el pago al mesero (controlador), quien consulta la
 * información al cajero (modelo) y este se la devuelve como factura.
 */
public class Factura {
    
    // Metodo que muestra la factura del cliente
    public void imprimirFactura(int orden_ID, String orden, int numero_mesa, double precio,String estado) {
        System.out.println("Numero del pedido: " + orden_ID);
        System.out.println("Orden: " + orden);
        System.out.println("Mesa: " + numero_mesa);
        System.out.println("Precio: " + precio + "$ COL");
        System.out.println("Estado: " + estado);
    }
}
