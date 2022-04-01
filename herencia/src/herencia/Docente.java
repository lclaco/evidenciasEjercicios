package herencia;

public class Docente extends Empleado{
	 private int horasTrabajadas;

	public Docente(String nombre, String rut, int sueldo,int horasTrabajadas) {
		super(nombre, rut, sueldo);
		this.horasTrabajadas = horasTrabajadas;
	}
	 
		
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	private void sop(String t) {
        System.out.println(t);
    }
 
    public void mostrarLiquidacion(){
        // NO puedo llamar directamente 
        // a this.nombre porque es private 
        sop( this.getNombre() );
        // a sueldo si, pq es protected 
        sop( "Sueldo:" + this.sueldo );
        // por implementar ...
    }

}
