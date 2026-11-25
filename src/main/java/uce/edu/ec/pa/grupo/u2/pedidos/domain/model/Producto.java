package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @SequenceGenerator(name = "producto_seq", sequenceName = "producto_seq_db", allocationSize = 1)                                                                                                                                                                                   // incrementar
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producto_seq")
    @Column(name = "prod_id")
    private Integer id;
    @Column(name = "prod_nombre")
    private String nombre;
    @Column(name = "prod_descripcion")
    private String descripcion;
    @Column(name = "prod_precio_actual")
    private Double precioActual;
    @Column(name = "prod_stock")
    private Integer stock;

    

    public Producto() {
    }


    public Producto(Integer id, String nombre, String descripcion, Double precioActual, Integer stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Double getPrecioActual() {
        return precioActual;
    }


    public void setPrecioActual(Double precioActual) {
        this.precioActual = precioActual;
    }


    public Integer getStock() {
        return stock;
    }


    public void setStock(Integer stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precioActual="
                + precioActual + ", stock=" + stock + "]";
    }

    

}
