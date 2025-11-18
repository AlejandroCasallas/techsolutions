package Dependencias;
public class Oficina {
    private String oficinaId;
    private String ubicacion;
    private int capacidad;
    private String sucursalId;
    
    public Oficina(String oficinaId, String ubicacion, int capacidad, String sucursalId) {
        this.oficinaId = oficinaId;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.sucursalId = sucursalId;
    }
    
    public String getOficinaId() { return oficinaId; }
    public void setOficinaId(String oficinaId) { this.oficinaId = oficinaId; }
    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
    public String getSucursalId() { return sucursalId; }
    public void setSucursalId(String sucursalId) { this.sucursalId = sucursalId; }
    
    @Override
    public String toString() {
        return "Oficina: " + ubicacion + " (Capacidad: " + capacidad + ")";
    }
}