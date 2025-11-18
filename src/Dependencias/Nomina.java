package Dependencias;
import java.util.HashMap;
import java.util.Map;

public class Nomina {
    private String nominaId;
    private String periodo;
    private Map<String, Double> salarios;
    private double totalNomina;
    
    public Nomina(String nominaId, String periodo) {
        this.nominaId = nominaId;
        this.periodo = periodo;
        this.salarios = new HashMap<>();
        this.totalNomina = 0.0;
    }
    
    public String getNominaId() { return nominaId; }
    public void setNominaId(String nominaId) { this.nominaId = nominaId; }
    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }
    public Map<String, Double> getSalarios() { return salarios; }
    public double getTotalNomina() { return totalNomina; }
    
    public void agregarSalario(String empleadoId, double salario) {
        salarios.put(empleadoId, salario);
        calcularTotal();
    }
    
    private void calcularTotal() {
        totalNomina = salarios.values().stream().mapToDouble(Double::doubleValue).sum();
    }
    
    @Override
    public String toString() {
        return "Nómina: " + nominaId + " - Período: " + periodo + " - Total: $" + totalNomina;
    }
}