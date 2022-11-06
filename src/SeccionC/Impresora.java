package SeccionC;

public class Impresora {
	protected static Impresora instancia;
	
	protected Impresora(){
		instancia = this;
	}
	public static Impresora getInstancia() {
		return instancia;
	}
}
