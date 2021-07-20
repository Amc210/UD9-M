package Empleados;

public class Volunteer extends Empleado {
	private double ajut;
	
	public Volunteer(String nombre, double sueldoMensual, boolean ajut) throws salarioIncorrecto {
		super(nombre, sueldoMensual);
		if(ajut) {
			this.ajut=300;
		}
	}
	public boolean comprovarSalario (double salarioMensual) throws salarioIncorrecto{
		
		if (salarioMensual <= 0) {
			return true;
		}else{
			throw new salarioIncorrecto(salarioMensual);
		}
	}
	
	//toString
	@Override
	public String toString() {
		return "Volunteer [nombre=" + nombre + ", ayuda= " + ajut + ", sueldoMensual=" + sueldoMensual + ", sueldoMensualNeto="
				+ sueldoMensualNeto + ", salMin=" + salMin + ", salMax=" + salMax + ", sueldoAnualBruto="
				+ sueldoAnualBruto + ", sueldoAnualNeto=" + sueldoAnualNeto + "]";
	}
	public double irpf() {
		return 0;	
	}
	public void bonusSueldo() {
		this.sueldoAnualNeto = this.sueldoAnualNeto+(this.sueldoAnualNeto*0.10);
	}

}
