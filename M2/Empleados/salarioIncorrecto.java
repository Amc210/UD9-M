package Empleados;

public class salarioIncorrecto extends Exception {

	private static final long serialVersionUID = 1L;
	public salarioIncorrecto (double salario) {
		super("Salario " + salario + " es incorrecto");
	}
}
