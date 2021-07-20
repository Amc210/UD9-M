package Empleados;

public class Boss extends Empleado{
	//atributo
	private double plusBoss = 0.5;//50% mas a su salario mensual
	
	
	// Constructor
	public Boss(String nombre, double sueldoMensual) throws salarioIncorrecto {
		super(nombre, sueldoMensual);
		
	}
	public void salarioPlus(double plusBoss) {
		double salarioPlus = plusBoss + super.getSueldoMensual();
		
		System.out.println("Salario con el plus del 50%: " + salarioPlus);
	}
	public double irpf() {
		return 0.32;	
	}
	public void bonusSueldo() {
		this.sueldoAnualNeto = this.sueldoAnualNeto+(this.sueldoAnualNeto*0.10);
	}
	public boolean comprovarSalario (double salarioMensual) throws salarioIncorrecto{
		
		if (salarioMensual >= 8000) {
			return true;
		}else{
			throw new salarioIncorrecto(salarioMensual);
		}
	}
	
	//toString
	@Override
	public String toString() {
		return "Boss [nombre=" + nombre + ", sueldoMensual=" + sueldoMensual + ", sueldoMensualNeto="
				+ sueldoMensualNeto + ", salMin=" + salMin + ", salMax=" + salMax + ", sueldoAnualBruto="
				+ sueldoAnualBruto + ", sueldoAnualNeto=" + sueldoAnualNeto + "]";
	}
	//gets y sets
	public double getPlusBoss() {
		return plusBoss;
	}


	public void setPlusBoss(double plusBoss) {
		this.plusBoss = plusBoss;
	}
	
	
}
