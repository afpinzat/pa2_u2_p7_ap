package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

public class Producto {

    private Integer id;
    private String nombre;
    private String descripcion;
    private Double precioActual;
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

    

}
