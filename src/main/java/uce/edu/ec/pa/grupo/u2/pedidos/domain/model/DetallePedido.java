package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@Table(name = "detalle_pedidos")
public class DetallePedido {

    @Id
    @SequenceGenerator(name = "detalle_pedido_seq", sequenceName = "detalle_pedido_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detalle_pedido_seq")
    @Column(name = "det_pedd_id")
    private Integer id;

    @Column(name = "det_pedd_nombre_producto")
    private String nombreProducto;

    @Column(name = "det_pedd_precio_unitario")
    private Double precioUnitario;

    @Column(name = "det_pedd_cantidad")
    private Integer cantidad;

    @Column(name = "det_pedd_subtotal")
    private Double subtotal;

    public DetallePedido() {
    }

    public DetallePedido(Integer id, String nombreProducto, Double precioUnitario, Integer cantidad, Double subtotal) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
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
