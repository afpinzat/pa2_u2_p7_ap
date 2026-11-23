package uce.edu.ec.pa.grupo.u2.pedidos.application;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pago;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.repository.PagoRepository;


@ApplicationScoped
@Transactional 
public class PagoService {

     @Inject
    private PagoRepository pagoRepository;

    public void guardar(Pago pago) {
        this.pagoRepository.create(pago);
    }

    public Pago buscarPorId(Integer id) {
       return this.pagoRepository.read(id);
    }

    public void actualizar(Pago pago) {
        this.pagoRepository.update(pago);
    }

    public void eliminar(Integer id) {
        this.pagoRepository.delete(id);
    }
}
