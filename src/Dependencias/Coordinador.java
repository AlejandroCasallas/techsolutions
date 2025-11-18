package Dependencias;
public class Coordinador extends Empleado {
    private String area;
    
    public Coordinador(String id, String nombre, double salario, String area) {
        super(id, nombre, "Coordinador", salario);
        this.area = area;
    }
    
    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
    
    @Override
    public void trabajar() {
        System.out.println("Coordinador " + nombre + " coordinando área: " + area);
    }
}