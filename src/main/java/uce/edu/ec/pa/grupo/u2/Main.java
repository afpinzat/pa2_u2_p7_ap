package uce.edu.ec.pa.grupo.u2;

import java.time.LocalDate;

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
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Cliente;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.DetallePedido;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Factura;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pago;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pedido;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Producto;

@QuarkusMain 
public class Main implements QuarkusApplication{

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

        Pedido pedido = new Pedido();

        pedido.setProducto("Producto de prueba");
        pedido.setPrecio(100.0);

        this.pedidoService.guardar(pedido);

         // Cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Pérez");
        cliente.setCedula("0102030405");
        cliente.setMail("juan.perez@mail.com");
        cliente.setnTelefono("0991234567");
        this.clienteService.guardar(cliente);

        // Producto
        Producto producto = new Producto();
        producto.setNombre("Laptop HP");
        producto.setDescripcion("Laptop HP 15 pulgadas, 8GB RAM, 256GB SSD");
        producto.setPrecioActual(750.00);
        producto.setStock(10);
        this.productoService.guardar(producto);

        // DetallePedido
        DetallePedido detalle = new DetallePedido();
        detalle.setNombreProducto("Laptop HP");
        detalle.setPrecioUnitario(750.00);
        detalle.setCantidad(2);
        detalle.setSubtotal(1500.00);
        this.detallePedidoService.guardar(detalle);

        // Pago
        Pago pago = new Pago();
        pago.setReferencia("TRX-2026-0001");
        pago.setMetodoPago("Tarjeta de crédito");
        pago.setMonto(1500.00);
        pago.setEstado("APROBADO");
        this.pagoService.guardar(pago);

        // Factura
        Factura factura = new Factura();
        factura.setnFactura("FAC-001-001-000000123");
        factura.setFechaEmision(LocalDate.now());
        factura.setSubtotal(1500.00);
        factura.setTotal(1800.00);
        this.facturaService.guardar(factura);

        return 0;
    }

    
}
