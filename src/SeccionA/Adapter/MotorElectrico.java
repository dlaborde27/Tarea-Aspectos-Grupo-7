package SeccionA.Adapter;

// No se puede hacer que motor electrico herede de motor ya que este requiere de metodos distintos
// Entonces esta es la clase que sera adaptada conocida como adaptee
public class MotorElectrico {
	private boolean conectado=false;
	public MotorElectrico() {
		System.out.println("Creando motor electrico...");
		this.conectado=false;
	}
	public void conectar() {
		System.out.println("Conectando motor electrico...");
		
	}
	
	public void activar() {
		if(!this.conectado) {
			System.out.println("No se puede activar porque no esta conectado el motor...");
			
		}else {
			
			System.out.println("Esta conectado,activando motor electrico...");
			
		}}
		public void moverMasRapido() {
			if(!this.conectado) {
				System.out.println("No se puede mover rapido el motro electrico porque no esta conectado");
				
			}else {
				
				System.out.println("Moviendo mas rapido aumentando el voltaje del motor electrico..");
			}
			
			
		}
		public void detener() {
			if(!this.conectado) {
				System.out.println("No se puede detener motor electrico porque no esta conectado..");
				
			}else {
				System.out.println("Deteniendo moto electrico");
			}
			
		}
		public void desconectar() {
			System.out.println("Desconectando motor electrico");
			this.conectado=false;
		}
		
	}


