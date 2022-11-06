package SeccionC;

public class Fax {
	protected static Fax instancia;
	public String mensaje;
	
	protected Fax(){
		instancia = this;
	}
	
	public static Fax getInstancia() {
		return instancia;
	}
	
}
