package main;

import controlador.Mesero;
import modelo.Cajero;
import vista.Factura;

public class ManolitoRestaurante {
    public static void main(String[] args) {
        // fetching the employee record based on the employee_id from the database
        Cajero cajero = solicitarFactura();

        // Se crea una nueva factura (vista), luego se crea la interacción del Cajero
        // con la Factura, a través del Mesero.
        Factura factura = new Factura();
        Mesero mesero = new Mesero(cajero, factura);
        mesero.actualizarFactura();

        // El cliente "paga" al mesero y este le dice al Cajero que cambie el estado de
        // la factura a "PAGADO"
        mesero.setEstado("PAGADO");
        System.out.println("\nEstado de el pedido actualizado!");
        mesero.actualizarFactura();
    }

    private static Cajero solicitarFactura() {
        Cajero Cajero = new Cajero();
        Cajero.setOrdenID(1);
        Cajero.setOrden("Hamburgesa en combo");
        Cajero.setNumeroMesa(42);
        Cajero.setPrecio(24000);
        Cajero.setEstado("SIN PAGAR");
        return Cajero;
    }

}