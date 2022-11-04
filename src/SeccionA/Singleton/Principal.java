package SeccionA.Singleton;

public class Principal {
	public static void main(String[] args) {
		ConexionBaseDeDatos conexion = ConexionBaseDeDatos.getInstancia();
		conexion.conectar();
		conexion.desconectar();
		
		
		// Esto regresa la misma instancia, realmente conexion y conexion 1 hacen referencia a la misma instancia
		ConexionBaseDeDatos conexion2 = ConexionBaseDeDatos.getInstancia();
		
		
		// Como veremos el codigo acontinuacion no es valido, ya que su constructor es privado
		// asi que no es posible crear mas instancias de la clase "ConexionBaseDeDatos"
		// ConexionBaseDeDatos conexionHerrada = new ConexionBaseDeDatos();
	}
}
