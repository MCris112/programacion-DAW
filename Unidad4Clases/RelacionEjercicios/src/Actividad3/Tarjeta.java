package Actividad3;

public class Tarjeta {

    private String numero, nombre, codigo, fechaVencimiento;

    private Cliente cliente;

    public Tarjeta() {
    }

    public Tarjeta(String numero, String nombre, String codigo, String fechaVencimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return """
           ┌──────────────────────────────────┐
           │   TARJETA DE CLIENTE             │
           │                                  │
           │   Número: %-20s   │
           │   Código: %-20s   │
           │                                  │
           │   Titular: %-19s   │
           │   Vencimiento: %-15s   │
           └──────────────────────────────────┘
           """.formatted(
                   this.numero,
                    this.codigo,
                    this.cliente != null ? this.cliente.getNombre() : "Sin titular",
                    this.fechaVencimiento
                );
    }

}
