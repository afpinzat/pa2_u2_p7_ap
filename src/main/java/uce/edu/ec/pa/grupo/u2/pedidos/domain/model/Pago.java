package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

public class Pago {

    private Integer id;
    private Integer pedido_id;
    private String metodoPago;
    private Double monto;
    private String estado;

    public Pago() {
    }

    public Pago(Integer id, Integer pedido_id, String metodoPago, Double monto, String estado) {
        this.id = id;
        this.pedido_id = pedido_id;
        this.metodoPago = metodoPago;
        this.monto = monto;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(Integer pedido_id) {
        this.pedido_id = pedido_id;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    

}
