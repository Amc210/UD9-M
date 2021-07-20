package Empleados;

public class Mid extends Empleado {
	// atributo
		private double reduccion = 0.10; // 10% mas a su salario mensual

		// Constructor
		public Mid(String nombre, double sueldoMensual) throws salarioIncorrecto {
			super(nombre, sueldoMensual);
		}

		public void salarioPlus(double plusManager) {
			double salarioPlus = plusManager + super.getSueldoMensual();

			System.out.println("Salario con el plus del 10%: " + salarioPlus);
		}

		public boolean comprovarSalario (double salarioMensual) throws salarioIncorrecto{
			
			if (salarioMensual < 2500 && salarioMensual >= 1800) {
				return true;
			}else{
				throw new salarioIncorrecto(salarioMensual);
			}
		}
		public void bonusSueldo() {
			this.sueldoAnualNeto = this.sueldoAnualNeto+(this.sueldoAnualNeto*0.10);
		}
		public double irpf() {
			return 0.15;	
		}
		
		// toString
		@Override
		public String toString() {
			return "Mid [nombre=" + nombre + ", sueldoMensual=" + sueldoMensual + ", sueldoMensualNeto="
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
