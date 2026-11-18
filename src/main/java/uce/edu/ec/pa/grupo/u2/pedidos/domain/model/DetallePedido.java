package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

public class DetallePedido {

    private Integer id;
    private Integer pedido_id;
    private Integer producto_id;
    private Integer cantidad;
    private Double subtotal;

    public DetallePedido() {
    }

    public DetallePedido(Integer id, Integer pedido_id, Integer producto_id, Integer cantidad, Double subtotal) {
        this.id = id;
        this.pedido_id = pedido_id;
        this.producto_id = producto_id;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
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

    public Integer getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Integer producto_id) {
        this.producto_id = producto_id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    

    

}
