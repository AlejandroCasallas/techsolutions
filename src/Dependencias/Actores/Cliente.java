package Dependencias.Actores;
import Dependencias.ActorEmpresa;

public class Cliente extends ActorEmpresa {
    private String clienteId;
    private String telefono;
    
    public Cliente(String nombre, String direccion, String clienteId, String telefono) {
        super(nombre, direccion);
        this.clienteId = clienteId;
        this.telefono = telefono;
    }
    
    public String getClienteId() { return clienteId; }
    public void setClienteId(String clienteId) { this.clienteId = clienteId; }
    public String getId() { return clienteId; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    
    @Override
    public void gestionarActividad() {
        System.out.println("Cliente " + nombre + " realizando compra");
    }
}