package Actividad4.Relaciones;

import Actividad4.Cliente;
import Actividad4.CocheNuevo;
import Actividad4.Vendedor;
import Utilities.Table;

public class ClienteCompraCocheNuevoConVendedor {

    private Cliente cliente;
    private CocheNuevo cocheNuevo;
    private Vendedor vendedor;

    private String fecha;

    public ClienteCompraCocheNuevoConVendedor(Cliente cliente, CocheNuevo cocheNuevo, Vendedor vendedor, String fecha) {
        this.cliente = cliente;
        this.cocheNuevo = cocheNuevo;
        this.vendedor = vendedor;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CocheNuevo getCocheNuevo() {
        return cocheNuevo;
    }

    public void setCocheNuevo(CocheNuevo cocheNuevo) {
        this.cocheNuevo = cocheNuevo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void show() {
        Table.instance()
                .addRow("COMPRA DE COCHE NUEVO")
                .addRow("Fecha", fecha)
                .addRow("Matricula", this.cocheNuevo.getMatricula())
                .addRow("Cliente", cliente.getNombre() + " " + cliente.getApellido())
                .addRow("Teléfono", cliente.getTelefono())
                .addRow("Coche", cocheNuevo.getMatricula())
                .addRow("Vendedor", vendedor.getNombre() + " " + vendedor.getApellido())
                .addRow("Contacto vendedor", vendedor.getTelefono())
                .print();
    }

}
