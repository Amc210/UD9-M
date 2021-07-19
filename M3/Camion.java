import java.util.Arrays;

public class Camion extends Vehiculo {
	private Rueda[] ruedasTraseras;
	private Rueda[] ruedasDelanteras;
	protected int numRuedas = 0;

	public Camion(String matricula, String marca, String color, Rueda ruedasTraseras, Rueda ruedasDelanteras,
			Persona titular) {
		super(matricula, marca, color, ruedasTraseras, ruedasDelanteras, titular);
		this.ruedasDelanteras = new Rueda[3];
		this.ruedasTraseras = new Rueda[3];
		comprovarDiametro(ruedasTraseras.getDiametro());
		comprovarDiametro(ruedasDelanteras.getDiametro());
		for (int i = 0; i < this.ruedasDelanteras.length; i++) {
			this.ruedasDelanteras[i] = ruedasDelanteras;
			this.ruedasTraseras[i] = ruedasTraseras;
		}

	}

	@Override
	public String toString() {
		return super.toString() + "ruedasTraseras=" + Arrays.toString(ruedasTraseras) + ", ruedasDelanteras="
				+ Arrays.toString(ruedasDelanteras) + ", numRuedas=" + numRuedas + "]";
	}
}
