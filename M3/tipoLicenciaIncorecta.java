
public class tipoLicenciaIncorecta extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public tipoLicenciaIncorecta(String tipoLicencia) {
		super("El tipo de licencia " + tipoLicencia + " no esta en la base de datos");
	}
	
}
