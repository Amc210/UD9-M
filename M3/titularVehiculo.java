
public class titularVehiculo extends Persona {
	private boolean seguro;
	private boolean garaje;

	public titularVehiculo(String nom, String cognom, String dataDeNaixement, boolean seguro, boolean garaje,
			Llicencia licencia) {
		super(nom, cognom, dataDeNaixement, licencia);
		this.seguro = seguro;
		this.garaje = garaje;
	}

	@Override
	public String toString() {
		return super.toString() + " [seguro=" + seguro + ", garage=" + garaje + "]";
	}
}
