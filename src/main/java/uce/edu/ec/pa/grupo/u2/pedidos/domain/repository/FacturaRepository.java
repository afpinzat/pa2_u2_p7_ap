package uce.edu.ec.pa.grupo.u2.pedidos.domain.repository;

import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Factura;


public interface FacturaRepository {

     //Created
    public void create (Factura factura);

    //Read por id
    public Factura read (Integer id);

    //Update
    public void update (Factura factura);

    //Delete
    public void delete (Integer id);
}
