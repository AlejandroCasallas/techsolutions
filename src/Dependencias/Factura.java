package Dependencias;
public class Factura {
    private String facturaId;
    private String clienteId;
    private String fecha;
    private double subtotal;
    private double impuestos;
    private double total;
    
    public Factura(String facturaId, String clienteId, String fecha, double subtotal, double impuestos) {
        this.facturaId = facturaId;
        this.clienteId = clienteId;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.impuestos = impuestos;
        this.total = subtotal + impuestos;
    }
    
    public String getFacturaId() { return facturaId; }
    public void setFacturaId(String facturaId) { this.facturaId = facturaId; }
    public String getClienteId() { return clienteId; }
    public void setClienteId(String clienteId) { this.clienteId = clienteId; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; this.total = subtotal + impuestos; }
    public double getImpuestos() { return impuestos; }
    public void setImpuestos(double impuestos) { this.impuestos = impuestos; this.total = subtotal + impuestos; }
    public double getTotal() { return total; }
    
    @Override
    public String toString() {
        return "Factura: " + facturaId + " - Cliente: " + clienteId + " - Total: $" + total;
    }
}