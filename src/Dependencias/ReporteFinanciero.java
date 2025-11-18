package Dependencias;
public class ReporteFinanciero {
    private String reporteId;
    private String periodo;
    private double ingresos;
    private double gastos;
    private double utilidad;
    
    public ReporteFinanciero(String reporteId, String periodo, double ingresos, double gastos) {
        this.reporteId = reporteId;
        this.periodo = periodo;
        this.ingresos = ingresos;
        this.gastos = gastos;
        this.utilidad = ingresos - gastos;
    }
    
    public String getReporteId() { return reporteId; }
    public void setReporteId(String reporteId) { this.reporteId = reporteId; }
    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }
    public double getIngresos() { return ingresos; }
    public void setIngresos(double ingresos) { this.ingresos = ingresos; this.utilidad = ingresos - gastos; }
    public double getGastos() { return gastos; }
    public void setGastos(double gastos) { this.gastos = gastos; this.utilidad = ingresos - gastos; }
    public double getUtilidad() { return utilidad; }
    
    @Override
    public String toString() {
        return "Reporte: " + reporteId + " - Período: " + periodo + " - Utilidad: $" + utilidad;
    }
}