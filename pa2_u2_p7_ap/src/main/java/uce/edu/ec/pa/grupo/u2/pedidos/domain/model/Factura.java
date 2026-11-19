package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @SequenceGenerator(name = "factura_seq", sequenceName = "factura_seq_db", allocationSize = 1)                                                                                                                                                                                   // incrementar
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "factura_seq")
    @Column(name = "fact_id")
    private Integer id;
    @Column(name = "fact_n_Fact")
    private String nFactura;
    @Column(name = "fact_fecha_emision")
    private LocalDate fechaEmision;
    @Column(name = "fact_subtotal")
    private Double subtotal;
    @Column(name = "fact_total")
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
