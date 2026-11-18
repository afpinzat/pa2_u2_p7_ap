package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDate;

public class Pedido {

    private Integer id;
    private Integer cliente_id;
    private String estado;
    private Double total;
    private LocalDate fPedido;

    public Pedido() {
    }

    public Pedido(Integer id, Integer cliente_id, String estado, Double total, LocalDate fPedido) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.estado = estado;
        this.total = total;
        this.fPedido = fPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public LocalDate getfPedido() {
        return fPedido;
    }

    public void setfPedido(LocalDate fPedido) {
        this.fPedido = fPedido;
    }

    
    


    
    
}
