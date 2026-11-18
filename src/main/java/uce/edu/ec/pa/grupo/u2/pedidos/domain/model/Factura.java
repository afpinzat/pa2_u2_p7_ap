package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDate;

public class Factura {

    private Integer id;
    private String nFactura;
    private LocalDate fechaEmision;
    private Double subtotal;
    private Double total;

    public Factura() {
    }

    public Factura(Integer id, String nFactura, LocalDate fechaEmision, Double subtotal, Double total) {
        this.id = id;
        this.nFactura = nFactura;
        this.fechaEmision = fechaEmision;
        this.subtotal = subtotal;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getnFactura() {
        return nFactura;
    }

    public void setnFactura(String nFactura) {
        this.nFactura = nFactura;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    
    
    

}
