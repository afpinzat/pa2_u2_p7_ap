package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity  //Esta clase es administrada por jakarta Persistence API (JPA) y se mapeará a una tabla en la base de datos.
@Table (name = "pedidos") //nombre de la tabla en la base de datos
public class Pedido {

    @Id 
    @SequenceGenerator (name = "pedido_seq", sequenceName = "pedido_seq_db", allocationSize = 1) //le doy un nombre que le doy al objeto, mapeo al nombre de la secuencia, le deigo en cuanto va a incrementar
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "pedido_seq") 
    @Column (name = "pedd_id") //nombre de la columna en la base de datos
    private Integer id;

    @Column (name = "pedd_producto") //nombre de la columna en la base de datos
    private String producto;

    @Column (name = "pedd_precio") //nombre de la columna en la base de datos
    private Double precio;

    @Column(name = "pedd_fecha")
    private LocalDate fecha;

     @Column(name = "pedd_numero") // nombre de la columna en la base de datos
    private String numero;


    public Pedido() {
    }

    public Pedido(Integer id, String producto, Double precio, LocalDate fecha, String numero) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.fecha = fecha;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

     public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", producto=" + producto + ", precio=" + precio + ", fecha=" + fecha + "]";
    }

   

    
    
}
