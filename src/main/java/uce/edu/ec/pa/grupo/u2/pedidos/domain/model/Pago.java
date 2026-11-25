package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagos")
public class Pago {

    @Id
    @SequenceGenerator(name = "pago_seq", sequenceName = "pago_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pago_seq")
    @Column(name = "pago_id")
    private Integer id;

    @Column(name = "pago_referencia")
    private String referencia;

    @Column(name = "pago_metodo")
    private String metodoPago;

    @Column(name = "pago_monto")
    private Double monto;

    @Column(name = "pago_estado")
    private String estado;

    public Pago() {
    }

    public Pago(Integer id, String referencia, String metodoPago, Double monto, String estado) {
        this.id = id;
        this.referencia = referencia;
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

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
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

    @Override
    public String toString() {
        return "Pago [id=" + id + ", referencia=" + referencia + ", metodoPago=" + metodoPago + ", monto=" + monto
                + ", estado=" + estado + "]";
    }

    
}