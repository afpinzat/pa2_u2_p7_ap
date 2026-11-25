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
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Pérez");
        cliente.setCedula("0102030405");
        cliente.setMail("juan.perez@mail.com");
        cliente.setnTelefono("0991234567");
        this.clienteService.guardar(cliente);
        System.out.println("Cliente guardado: " + cliente);

        // READ
        Cliente cliente2 = this.clienteService.buscarPorId(cliente.getId());
        System.out.println("Cliente encontrado: " + cliente2);

        // UPDATE
        System.out.println("Valor anterior: " + cliente2.getNombre());
        cliente2.setNombre("Juan Pérez Actualizado");
        this.clienteService.actualizar(cliente2);

        Cliente cliente3 = this.clienteService.buscarPorId(cliente2.getId());
        System.out.println("Cliente actualizado: " + cliente3);

        // DELETE
        this.clienteService.eliminar(cliente2.getId());
        System.out.println("Cliente eliminado correctamente.");



        // CREATE
        Producto producto = new Producto();
        producto.setNombre("Laptop HP");
        producto.setDescripcion("Laptop HP 15 pulgadas, 8GB RAM, 256GB SSD");
        producto.setPrecioActual(750.00);
        producto.setStock(10);
        this.productoService.guardar(producto);
        System.out.println("Producto guardado: " + producto);

        // READ
        Producto producto2 = this.productoService.buscarPorId(producto.getId());
        System.out.println("Producto encontrado: " + producto2);

        // UPDATE
        System.out.println("Valor anterior: " + producto2.getPrecioActual());
        producto2.setPrecioActual(800.00);
        this.productoService.actualizar(producto2);

        Producto producto3 = this.productoService.buscarPorId(producto2.getId());
        System.out.println("Producto actualizado: " + producto3);

        // DELETE
        this.productoService.eliminar(producto2.getId());
        System.out.println("Producto eliminado correctamente.");



        // CREATE
        DetallePedido detalle = new DetallePedido();
        detalle.setNombreProducto("Laptop HP");
        detalle.setPrecioUnitario(750.00);
        detalle.setCantidad(2);
        detalle.setSubtotal(1500.00);
        this.detallePedidoService.guardar(detalle);
        System.out.println("DetallePedido guardado: " + detalle);

        // READ
        DetallePedido detalle2 = this.detallePedidoService.buscarPorId(detalle.getId());
        System.out.println("DetallePedido encontrado: " + detalle2);

        // UPDATE
        System.out.println("Valor anterior: " + detalle2.getCantidad());
        detalle2.setCantidad(3);
        detalle2.setSubtotal(detalle2.getPrecioUnitario() * detalle2.getCantidad());
        this.detallePedidoService.actualizar(detalle2);

        DetallePedido detalle3 = this.detallePedidoService.buscarPorId(detalle2.getId());
        System.out.println("DetallePedido actualizado: " + detalle3);

        // DELETE
        this.detallePedidoService.eliminar(detalle2.getId());
        System.out.println("DetallePedido eliminado correctamente.");



        // CREATE
        Pago pago = new Pago();
        pago.setReferencia("TRX-2026-0001");
        pago.setMetodoPago("Tarjeta de crédito");
        pago.setMonto(1500.00);
        pago.setEstado("APROBADO");
        this.pagoService.guardar(pago);
        System.out.println("Pago guardado: " + pago);

        // READ
        Pago pago2 = this.pagoService.buscarPorId(pago.getId());
        System.out.println("Pago encontrado: " + pago2);

        // UPDATE
        System.out.println("Valor anterior: " + pago2.getEstado());
        pago2.setEstado("PENDIENTE");
        this.pagoService.actualizar(pago2);

        Pago pago3 = this.pagoService.buscarPorId(pago2.getId());
        System.out.println("Pago actualizado: " + pago3);

        // DELETE
        this.pagoService.eliminar(pago2.getId());
        System.out.println("Pago eliminado correctamente.");



        // CREATE
        Factura factura = new Factura();
        factura.setnFactura("FAC-001-001-000000123");
        factura.setFechaEmision(LocalDate.now());
        factura.setSubtotal(1500.00);
        factura.setTotal(1800.00);
        this.facturaService.guardar(factura);
        System.out.println("Factura guardada: " + factura);

        // READ
        Factura factura2 = this.facturaService.buscarPorId(factura.getId());
        System.out.println("Factura encontrada: " + factura2);

        // UPDATE
        System.out.println("Valor anterior: " + factura2.getTotal());
        factura2.setTotal(2000.00);
        this.facturaService.actualizar(factura2);

        Factura factura3 = this.facturaService.buscarPorId(factura2.getId());
        System.out.println("Factura actualizada: " + factura3);

        // DELETE
        this.facturaService.eliminar(factura2.getId());
        System.out.println("Factura eliminada correctamente.");



        // CREATE
        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba");
        pedido.setPrecio(100.0);
        pedido.setFecha(LocalDate.now());
        this.pedidoService.guardar(pedido);
        System.out.println("Pedido guardado: " + pedido);

        // READ
        Pedido pedido2 = this.pedidoService.buscarPorId(pedido.getId());
        System.out.println("Pedido encontrado: " + pedido2);

        // UPDATE
        System.out.println("Valor anterior: " + pedido2.getPrecio());
        pedido2.setPrecio(200.0);
        this.pedidoService.actualizar(pedido2);

        Pedido pedido3 = this.pedidoService.buscarPorId(pedido2.getId());
        System.out.println("Pedido actualizado: " + pedido3);

        // DELETE
        this.pedidoService.eliminar(pedido2.getId());
        System.out.println("Pedido eliminado correctamente.");
        return 0;
    }
}
