package Dependencias;
public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected String posicion;
    protected double salario;
    
    public Empleado(String id, String nombre, String posicion, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
    }
    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    
    public abstract void trabajar();
    
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Posición: " + posicion + ", Salario: " + salario;
    }
}