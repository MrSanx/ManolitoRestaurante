package modelo;

/**
 * El mesero (controlador) se acerca al cajero (modelo), donde le solicita la información
 * del pedido del cliente.
 * El cajero revisa la información del cliente y se la devuelve en forma de factura.
 */
public class Cajero {

    //Variables
    private int orden_ID;
    private String orden;
    private int numero_mesa;
    private double precio;
    private String estado;

    //Getters && Setters
    public int getOrdenID() {
        return orden_ID;
    }

    public void setOrdenID(int orden_ID) {
        this.orden_ID = orden_ID;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getNumeroMesa() {
        return numero_mesa;
    }

    public void setNumeroMesa(int numero_mesa) {
        this.numero_mesa = numero_mesa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
