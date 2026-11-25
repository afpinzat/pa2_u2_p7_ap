package uce.edu.ec.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pedido;

public interface PedidoRepository {

    // Created
    public void create(Pedido pedido);

    // Read por id
    public Optional<Pedido> read(Integer id);

    public Optional<Pedido> readByNumber(String numero);

    public List<Pedido> readAll();

    // Update
    public void update(Pedido pedido);

    // Delete
    public void delete(Integer id);

}
