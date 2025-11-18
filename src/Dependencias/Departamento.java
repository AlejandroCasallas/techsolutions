package Dependencias;
public class Departamento {
    private String departamentoId;
    private String nombre;
    private String directorId;
    private int empleadosCount;
    
    public Departamento(String departamentoId, String nombre, String directorId, int empleadosCount) {
        this.departamentoId = departamentoId;
        this.nombre = nombre;
        this.directorId = directorId;
        this.empleadosCount = empleadosCount;
    }
    
    public String getDepartamentoId() { return departamentoId; }
    public void setDepartamentoId(String departamentoId) { this.departamentoId = departamentoId; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDirectorId() { return directorId; }
    public void setDirectorId(String directorId) { this.directorId = directorId; }
    public int getEmpleadosCount() { return empleadosCount; }
    public void setEmpleadosCount(int empleadosCount) { this.empleadosCount = empleadosCount; }
    
    @Override
    public String toString() {
        return "Departamento: " + nombre + " (" + empleadosCount + " empleados)";
    }
}