package Empleados;

public class Manager extends Empleado {
	//atributo
	private double plusManager = 0.1; //10% mas a su salario mensual
	
	//Constructor
	public Manager(String nombre, double sueldoMensual) throws salarioIncorrecto {
		super(nombre, sueldoMensual);
	}
	
	public void salarioPlus(double plusManager) {
		double salarioPlus = plusManager + super.getSueldoMensual();
		
		System.out.println("Salario con el plus del 10%: " + salarioPlus);
	}
	public double irpf() {
		return 0.26;	
	}
	public void bonusSueldo() {
		this.sueldoAnualNeto = this.sueldoAnualNeto+(this.sueldoAnualNeto*0.10);
	}
	public boolean comprovarSalario (double salarioMensual) throws salarioIncorrecto{
		
		if (salarioMensual < 5000 && salarioMensual > 3000) {
			return true;
		}else{
			throw new salarioIncorrecto(salarioMensual);
		}
	}
	
	//toString
	@Override
	public String toString() {
		return "Manager [nombre=" + nombre + ", sueldoMensual=" + sueldoMensual + ", sueldoMensualNeto="
				+ sueldoMensualNeto + ", salMin=" + salMin + ", salMax=" + salMax + ", sueldoAnualBruto="
				+ sueldoAnualBruto + ", sueldoAnualNeto=" + sueldoAnualNeto + "]";
	}

	//gets y sets
	public double getPlusManager() {
		return plusManager;
	}

	public void setPlusManager(double plusManager) {
		this.plusManager = plusManager;
	}
	
	
}
