package uce.edu.ec.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Producto;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.repository.ProductoRepository;

@ApplicationScoped 
public class ProductoRepositoryImpl implements ProductoRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Producto producto) {
       this.entityManager.persist(producto); //hace el insert
    }

    @Override
    public Producto read (Integer id) {
        // TODO Auto-generated method stub
       return this.entityManager.find(Producto.class, id);
    }

    @Override
    public void update(Producto producto) {
        // TODO Auto-generated method stub
        this.entityManager.merge(producto);
    }

    @Override
    public void delete(Integer id) {
        Producto producto = this.read(id);
       this.entityManager.remove(producto);
    }
}
