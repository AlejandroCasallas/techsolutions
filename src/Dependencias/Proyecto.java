package Dependencias;
public class Proyecto {
    private String proyectoId;
    private String nombre;
    private String estado;
    private double presupuesto;
    
    public Proyecto(String proyectoId, String nombre, String estado, double presupuesto) {
        this.proyectoId = proyectoId;
        this.nombre = nombre;
        this.estado = estado;
        this.presupuesto = presupuesto;
    }
    
    public String getProyectoId() { return proyectoId; }
    public void setProyectoId(String proyectoId) { this.proyectoId = proyectoId; }
    public String getId() { return proyectoId; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public double getPresupuesto() { return presupuesto; }
    public void setPresupuesto(double presupuesto) { this.presupuesto = presupuesto; }
    
    @Override
    public String toString() {
        return "Proyecto: " + nombre + " - Estado: " + estado + " - Presupuesto: $" + presupuesto;
    }
}