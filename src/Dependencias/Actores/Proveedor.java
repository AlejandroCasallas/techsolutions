package Dependencias.Actores;
import Dependencias.ActorEmpresa;

public class Proveedor extends ActorEmpresa {
    private String proveedorId;
    private String categoria;
    
    public Proveedor(String nombre, String direccion, String proveedorId, String categoria) {
        super(nombre, direccion);
        this.proveedorId = proveedorId;
        this.categoria = categoria;
    }
    
    public String getProveedorId() { return proveedorId; }
    public void setProveedorId(String proveedorId) { this.proveedorId = proveedorId; }
    public String getId() { return proveedorId; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    
    @Override
    public void gestionarActividad() {
        System.out.println("Proveedor " + nombre + " suministrando productos");
    }
}