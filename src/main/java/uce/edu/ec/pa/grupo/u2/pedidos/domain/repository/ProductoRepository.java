package uce.edu.ec.pa.grupo.u2.pedidos.domain.repository;

import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Producto;

public interface ProductoRepository {

     //Created
    public void create (Producto producto);

    //Read por id
    public Producto read (Integer id);

    //Update
    public void update (Producto producto);

    //Delete
    public void delete (Integer id);
}
