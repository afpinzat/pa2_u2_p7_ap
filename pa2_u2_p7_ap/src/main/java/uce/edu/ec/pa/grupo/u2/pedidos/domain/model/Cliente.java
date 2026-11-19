package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id 
    @SequenceGenerator (name = "pedido_seq", sequenceName = "pedido_seq_db", allocationSize = 1) //le doy un nombre que le doy al objeto, mapeo al nombre de la secuencia, le deigo en cuanto va a incrementar
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "pedido_seq") 
    @Column (name = "cli_id")
    private Integer id;

    @Column (name = "cli_nombre") 
    private String nombre;
    @Column (name = "cli_cedula") 
    private String cedula;
    @Column (name = "cli_mail") 
    private String mail;
    @Column (name = "cli_telefono") 
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
