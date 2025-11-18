package Dependencias;
public class Director extends Empleado {
    private String departamento;
    
    public Director(String id, String nombre, double salario, String departamento) {
        super(id, nombre, "Director", salario);
        this.departamento = departamento;
    }
    
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    
    @Override
    public void trabajar() {
        System.out.println("Director " + nombre + " dirigiendo departamento: " + departamento);
    }
}