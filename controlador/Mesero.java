package controlador;

import modelo.Cajero;
import vista.Factura;

public class Mesero {
    //
    private Cajero cajero;
    private Factura factura;

    //
    public Mesero(Cajero modelo, Factura factura) {
        this.cajero = modelo;
        this.factura = factura;
    }

    //
    public int getOrdenID() {
        return cajero.getOrdenID();
    }

    public void setOrdenID(int orden_ID) {
        cajero.setOrdenID(orden_ID);
    }

    public String getOrden() {
        return cajero.getOrden();
    }

    public void setOrden(String orden) {
        cajero.setOrden(orden);
    }

    public int getNumeroMesa() {
        return cajero.getNumeroMesa();
    }

    public void setNumeroMesa(int numero_mesa) {
        cajero.setNumeroMesa(numero_mesa);
    }

    public double getPrecio() {
        return cajero.getPrecio();
    }

    public void setPrecio(double precio) {
        cajero.setPrecio(precio);
    }

    public String getEstado() {
        return cajero.getEstado();
    }

    public void setEstado(String estado) {
        cajero.setEstado(estado);
    }

    //
    public void actualizarFactura() {
        factura.imprimirFactura(cajero.getOrdenID(), cajero.getOrden(), cajero.getNumeroMesa(), cajero.getPrecio(), cajero.getEstado());
    }
}
