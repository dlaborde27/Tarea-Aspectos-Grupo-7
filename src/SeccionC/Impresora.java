package SeccionC;

public class Impresora {
	private static Impresora instancia;
	
	private Impresora(){
		instancia = this;
	}
	
	public static Impresora getInstancia() {
		return instancia;
	}
}
