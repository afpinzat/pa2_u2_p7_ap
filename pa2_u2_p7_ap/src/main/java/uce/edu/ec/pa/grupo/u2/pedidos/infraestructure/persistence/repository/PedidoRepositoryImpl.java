package uce.edu.ec.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pedido;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;

@ApplicationScoped 
public class PedidoRepositoryImpl implements PedidoRepository{

    //Entityt manager es la interfaz q me permite interactuar desde mi repository con mi base de datos
    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Pedido pedido) {
       this.entityManager.persist(pedido); //hace el insert
    }

    @Override
    public Pedido read (Integer id) {
        // TODO Auto-generated method stub
       return this.entityManager.find(Pedido.class, id);
    }

    @Override
    public void update(Pedido pedido) {
        // TODO Auto-generated method stub
        this.entityManager.merge(pedido);
    }

    @Override
    public void delete(Integer id) {
        Pedido pedido = this.read(id);
       this.entityManager.remove(pedido);
    }


}
