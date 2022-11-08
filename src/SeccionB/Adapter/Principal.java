package SeccionB.Adapter;
//Esta es la pequeña implementacion de un programa para el uso de las clases
//Para esta sección se desea que cada método informe la hora en la que
//se es ejecutado, para eso facilitar esta tarea utilizamos Aspectos.
import java.util.Scanner;
//Esta clase principal hace uso de motor, hace uso de polimorfismo ya que indirectamente se usan las otras clases hijas de motor
public class Principal {
	 private static Scanner s= new Scanner(System.in);
	 private static Motor motor;

	public static void main(String[] args) {
		int opcion;
		do {
			opcion=preguntarOpcion();
			switch(opcion) {
			case 1:
				motor= new MotorComun();
				usarMotor();
				break;
			case 2:
				motor= new MotorEconomico();
				usarMotor();
				break;
			case 3:
				motor= new MotorElectricoAdapter();
				usarMotor();
				break;
			case 4:
				System.out.println("Cerrando programa");
				break;
			default:
				System.out.println("La opcion ingresada no es valida");
			}	
		}while(opcion!=4);
		
	}
	private static int preguntarOpcion() {
		System.out.print(
				"MENU DE OPCIONES\n"
				+"1. Encender motor comun.\n"
				+"2. Encender motor economico\n"
				+"3. Encender motor Electrico\n"
				+"4. Salir\n"
				+"Seleccione opcion:"
				
				
				);
			return Integer.parseInt(s.nextLine());
	}
	private static void usarMotor() {
		motor.encender();
		motor.acelerar();
		motor.apagar();
		
	}
}
