package Empleados;

public class Junior extends Empleado {
	// atributo
	private double reduccion = 0.15; // 10% mas a su salario mensual

	// Constructor
	public Junior(String nombre, double sueldoMensual) throws salarioIncorrecto {
		super(nombre, sueldoMensual);
	}

	public boolean comprovarSalario(double salarioMensual) throws salarioIncorrecto {

		if (salarioMensual < 1600 && salarioMensual >= 9000) {
			return true;
		} else {
			throw new salarioIncorrecto(salarioMensual);
		}
	}
	public void bonusSueldo() {
		this.sueldoAnualNeto = this.sueldoAnualNeto+(this.sueldoAnualNeto*0.10);
	}
	public double irpf() {
		return 0.2;	
	}

	public void salarioPlus(double plusManager) {
		double salarioPlus = plusManager + super.getSueldoMensual();

		System.out.println("Salario con el plus del 10%: " + salarioPlus);
	}

	//toString
	@Override
	public String toString() {
		return "Junior [nombre=" + nombre + ", sueldoMensual=" + sueldoMensual + ", sueldoMensualNeto="
				+ sueldoMensualNeto + ", salMin=" + salMin + ", salMax=" + salMax + ", sueldoAnualBruto="
				+ sueldoAnualBruto + ", sueldoAnualNeto=" + sueldoAnualNeto + "]";
	}

	// gets y sets
	public double getReduccion() {
		return reduccion;
	}

	public void setReduccion(double reduccion) {
		this.reduccion = reduccion;
	}
}
