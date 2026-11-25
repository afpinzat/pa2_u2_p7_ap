package uce.edu.ec.pa.grupo.u2;

import java.util.Optional;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.ec.pa.grupo.u2.pedidos.application.ClienteService;
import uce.edu.ec.pa.grupo.u2.pedidos.application.DetallePedidoService;
import uce.edu.ec.pa.grupo.u2.pedidos.application.FacturaService;
import uce.edu.ec.pa.grupo.u2.pedidos.application.PagoService;
import uce.edu.ec.pa.grupo.u2.pedidos.application.PedidoService;
import uce.edu.ec.pa.grupo.u2.pedidos.application.ProductoService;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pedido;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private ClienteService clienteService;

    @Inject
    private ProductoService productoService;

    @Inject
    private DetallePedidoService detallePedidoService;

    @Inject
    private PagoService pagoService;

    @Inject
    private FacturaService facturaService;

    @Inject
    private PedidoService pedidoService;

    public static void main(final String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello Quakus!");

         // CREATE
        Pedido pedido2 = new Pedido();

        pedido2.setNumero("PED-001");
        pedido2.setProducto("Laptop");
        pedido2.setPrecio(850.00);

        pedidoService.guardar(pedido2);

        System.out.println("Pedido guardado: " + pedido2);

        // READ (BUSCAR POR ID)
        System.out.println("\n========== READ POR ID ==========");

        Optional<Pedido> pedido = pedidoService.buscarPorId(pedido2.getId());

        if (pedido.isPresent()) {
            System.out.println("Pedido encontrado: " + pedido.get());
        } else {
            System.out.println("Pedido no encontrado");
        }

        // READ BY NUMBER
        System.out.println("\n========== READ BY NUMBER ==========");

        Optional<Pedido> pedidoByNumber =
                pedidoService.buscarPorNumero("PED-001");

        if (pedidoByNumber.isPresent()) {
            System.out.println("Pedido encontrado por numero: "
                    + pedidoByNumber.get());
        } else {
            System.out.println("Pedido no encontrado por numero");
        }

        return 0;
    }
}
