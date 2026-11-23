package uce.edu.ec.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pago;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.repository.PagoRepository;

@ApplicationScoped 
public class PagoRepositoryImpl implements PagoRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Pago pago) {
       this.entityManager.persist(pago); //hace el insert
    }

    @Override
    public Pago read (Integer id) {
        // TODO Auto-generated method stub
       return this.entityManager.find(Pago.class, id);
    }

    @Override
    public void update(Pago pago) {
        // TODO Auto-generated method stub
        this.entityManager.merge(pago);
    }

    @Override
    public void delete(Integer id) {
        Pago pago = this.read(id);
       this.entityManager.remove(pago);
    }
}
