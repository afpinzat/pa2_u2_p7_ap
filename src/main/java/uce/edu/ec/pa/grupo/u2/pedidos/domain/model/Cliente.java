package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

public class Cliente {

    private Integer id;
    private String nombre;
    private String cedula;
    private String mail;
    private String nTelefono;

    

    public Cliente() {
    }


    public Cliente(Integer id, String nombre, String cedula, String mail, String nTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.mail = mail;
        this.nTelefono = nTelefono;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCedula() {
        return cedula;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getMail() {
        return mail;
    }


    public void setMail(String mail) {
        this.mail = mail;
    }


    public String getnTelefono() {
        return nTelefono;
    }


    public void setnTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }

    

}
