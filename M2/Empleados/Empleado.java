package Empleados;

public abstract class Empleado {
	// Atributos
		protected String nombre;
		protected double sueldoMensual;
		protected double sueldoMensualNeto;
		protected double salMin;
		protected double salMax;
		protected double sueldoAnualBruto;
		protected double sueldoAnualNeto;
		
		//Constructor
		public Empleado(String nombre, double sueldoMensual) throws salarioIncorrecto{
			if(comprovarSalario(sueldoMensual)==true) {
				this.nombre = nombre;
				this.sueldoMensual = sueldoMensual;
				this.sueldoMensualNeto = (sueldoMensual-(sueldoMensual*irpf()));
				this.sueldoAnualBruto = sueldoAnualBruto*12;
				this.sueldoAnualNeto = this.sueldoMensualNeto*12;
			}else {
				throw new salarioIncorrecto(sueldoMensual);
			}
		}
		
		public abstract void bonusSueldo();
		public abstract double irpf();
		public abstract boolean comprovarSalario(double sueldoMensual) throws salarioIncorrecto;
		
		//toString
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", sueldoMensual=" + sueldoMensual + "]";
		}

		//gets y sets
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getSueldoMensual() {
			return sueldoMensual;
		}

		public void setSueldoMensual(double sueldoMensual) {
			this.sueldoMensual = sueldoMensual;
		}
}
