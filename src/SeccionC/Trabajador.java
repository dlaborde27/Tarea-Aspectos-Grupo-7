package SeccionC;

public class Trabajador {
	private final String nombre;
	private int edad;
	private String rol;
	
	public Trabajador(String nombre, int edad, String rol) {
		this.nombre = nombre;
		this.edad = edad;
		this.rol = rol;
	}
	
	public void MandarAImprimir() {
		// Siempre se devolverá la misma instancia de la impresora
		Impresora impresora = Impresora.getInstancia();
		System.out.println("\nEl trabajador "+nombre+" ha mandado a imprimir\n***IMPRIMIENDO***");
	}
}
