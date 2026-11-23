package uce.edu.ec.pa.grupo.u2.pedidos.domain.repository;

import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pago;


public interface PagoRepository {

     //Created
    public void create (Pago pago);

    //Read por id
    public Pago read (Integer id);

    //Update
    public void update (Pago pago);

    //Delete
    public void delete (Integer id);
}
