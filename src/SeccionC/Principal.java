package SeccionC;

public class Principal {

	public static void main(String[] args) {
		// Probando que si está implementado el patron Singleton
		// Primero creamos 2 objetos de Fax, lo mismo aplicaria para Impresora ya que tienen la misma implementacion
		System.out.println("Verificacion de que está implementado el patron Singleton");
		Fax fax1 = Fax.getInstancia();
		Fax fax2 = Fax.getInstancia();
		// Escribimos un mensaje en el objeto Fax1 y luego lo presentamos
		fax1.mensaje = "mensaje de Fax1"; 
		System.out.println(fax1.mensaje);
		// Despues escribimos un mensaje distinto en el objeto Fax2 y presentamos el mensaje de Fax1 y Fax2
		fax2.mensaje = "mensaje de Fax2"; 
		System.out.println(fax1.mensaje);
		System.out.println(fax2.mensaje);
		System.out.println("Verificando si las instancias son iguales con el metodo equals utilizando su hashCode: " +fax1.equals(fax2));
		// Como vemos se presenta 2 veces el mensaje de Fax2 ya que está devolviendo una unica instancia, y se está cambiando el mensaje
	
		
		//Ejemplo de la vida real
		// Situacion: una miniempresa con una sola impresora y Fax, todos deben utilizar el mismo equipo de trabajo ya que solo existe uno de cada uno
		// osea, en pocas palabras, en el programa se utilizará LA MISMA INSTANCIA, asi se ahorrarian recursos y sería una buena implementacion
		System.out.println("\nEjemplo de uso en la vida real");
		Trabajador trabajador1 = new Trabajador("Dario",20,"Administrador");
		Trabajador trabajador2 = new Trabajador("Jose",19,"Auxiliar de bodega");
		Trabajador trabajador3 = new Trabajador("Jorge",21,"Jefe de sistemas");
		trabajador1.MandarAImprimir();
		trabajador3.MandarAImprimir();
	}

}
