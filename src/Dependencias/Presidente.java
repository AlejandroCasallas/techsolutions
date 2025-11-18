package Dependencias;
public class Presidente extends Empleado {
    private String estrategia;
    
    public Presidente(String id, String nombre, double salario, String estrategia) {
        super(id, nombre, "Presidente", salario);
        this.estrategia = estrategia;
    }
    
    public String getEstrategia() { return estrategia; }
    public void setEstrategia(String estrategia) { this.estrategia = estrategia; }
    
    @Override
    public void trabajar() {
        System.out.println("Presidente " + nombre + " definiendo estrategia: " + estrategia);
    }
}