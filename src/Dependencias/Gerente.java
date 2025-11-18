package Dependencias;
public class Gerente extends Empleado {
    private int equipoSize;
    
    public Gerente(String id, String nombre, double salario, int equipoSize) {
        super(id, nombre, "Gerente", salario);
        this.equipoSize = equipoSize;
    }
    
    public int getEquipoSize() { return equipoSize; }
    public void setEquipoSize(int equipoSize) { this.equipoSize = equipoSize; }
    
    @Override
    public void trabajar() {
        System.out.println("Gerente " + nombre + " gestionando equipo de " + equipoSize + " personas");
    }
}