package uce.edu.ec.pa.grupo.u2.pedidos.domain.repository;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Cliente;


public interface ClienteRepository {

     //Created
    public void create (Cliente cliente);

    //Read por id
    public Cliente read (Integer id);

    //Update
    public void update (Cliente cliente);

    //Delete
    public void delete (Integer id);
}
