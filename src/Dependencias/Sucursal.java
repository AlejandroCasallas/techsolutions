package Dependencias;
public class Sucursal {
    private String sucursalId;
    private String nombre;
    private String direccion;
    private String regionId;
    
    public Sucursal(String sucursalId, String nombre, String direccion, String regionId) {
        this.sucursalId = sucursalId;
        this.nombre = nombre;
        this.direccion = direccion;
        this.regionId = regionId;
    }
    
    public String getSucursalId() { return sucursalId; }
    public void setSucursalId(String sucursalId) { this.sucursalId = sucursalId; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getRegionId() { return regionId; }
    public void setRegionId(String regionId) { this.regionId = regionId; }
    
    @Override
    public String toString() {
        return "Sucursal: " + nombre + " - " + direccion;
    }
}