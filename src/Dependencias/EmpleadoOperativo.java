package Dependencias;
public class EmpleadoOperativo extends Empleado {
    private String turno;
    
    public EmpleadoOperativo(String id, String nombre, double salario, String turno) {
        super(id, nombre, "Operativo", salario);
        this.turno = turno;
    }
    
    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
    
    @Override
    public void trabajar() {
        System.out.println("Empleado " + nombre + " trabajando turno: " + turno);
    }
}