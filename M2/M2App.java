import java.util.Scanner;

import Empleados.Boss;
import Empleados.Junior;
import Empleados.Manager;
import Empleados.Mid;
import Empleados.Senior;
import Empleados.Volunteer;
import Empleados.salarioIncorrecto;

public class M2App {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws salarioIncorrecto {
		// Atributos
		String nombre, nivelTrabajo;
		double sueldoMensual;

		System.out.println("Nombre?");
		nombre = teclado.next();
		System.out.println("Nivel laboral?");
		nivelTrabajo = teclado.next().toLowerCase();
		System.out.println("Cuanto cobras mensualmente?");
		sueldoMensual = teclado.nextDouble();

		switch (nivelTrabajo) {
		case ("manager"):
			Manager manager = new Manager(nombre, sueldoMensual);
			System.out.println(manager);
			break;
		case ("boss"):
			Boss boss = new Boss(nombre, sueldoMensual);
			System.out.println(boss);
			break;
		case ("senior"):
			Senior senior = new Senior (nombre, sueldoMensual);
			System.out.println(senior);
			break;
		case ("mid"):
			Mid mid = new Mid (nombre, sueldoMensual);
			System.out.println(mid);
			break;
		case ("junior"):
			Junior junior = new Junior (nombre, sueldoMensual);
			System.out.println(junior);
			break;
		case ("volunteer"):
			System.out.println("Estas becado? (true/false)");
			boolean becado = teclado.hasNext();
			Volunteer volunteer = new Volunteer(nombre, sueldoMensual, becado);
			System.out.println(volunteer);
			break;
		default:
			System.out.println("No existe ese nivel laboral!!");
			break;
		}
	}

}
