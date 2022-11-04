package SeccionA.Singleton;

public class ConexionBaseDeDatos {
	private static ConexionBaseDeDatos instancia;
	
	private ConexionBaseDeDatos() {}
	
	public static ConexionBaseDeDatos getInstancia() {
		if(instancia == null) {
			instancia = new ConexionBaseDeDatos();
		}
		return instancia;
	}
	
	public void conectar() {
		// Logica para conectar a la base de datos
		System.out.println("Se hizo la conexion a la base de datos");
	}
	
	public void desconectar() {
		// Logica para desconectar de la base de datos
		System.out.println("Se hizo la desconexion de la base de datos");
	}
}
