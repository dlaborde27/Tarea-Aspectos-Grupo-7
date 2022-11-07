package SeccionC;

public class Fax {
	private static Fax instancia;
	public String mensaje;
	
	private Fax(){
		instancia = this;
	}
	
	public static Fax getInstancia() {
		return instancia;
	}
	
}
