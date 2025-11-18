package Dependencias;
public class Contrato {
    private String contratoId;
    private String clienteId;
    private String fechaInicio;
    private String fechaFin;
    private double valor;
    
    public Contrato(String contratoId, String clienteId, String fechaInicio, String fechaFin, double valor) {
        this.contratoId = contratoId;
        this.clienteId = clienteId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.valor = valor;
    }
    
    public String getContratoId() { return contratoId; }
    public void setContratoId(String contratoId) { this.contratoId = contratoId; }
    public String getClienteId() { return clienteId; }
    public void setClienteId(String clienteId) { this.clienteId = clienteId; }
    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    public String getFechaFin() { return fechaFin; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    
    @Override
    public String toString() {
        return "Contrato: " + contratoId + " - Cliente: " + clienteId + " - Valor: $" + valor;
    }
}