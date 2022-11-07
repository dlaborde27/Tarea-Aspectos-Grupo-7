package SeccionA.Adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

// Clase Adapter que sirve como puente entre la clase que se va a adaptar y Motor
// Tiene como atributo una referencia de la clase adaptee(la que se va a adaptar) para asi hacer uso de motor electrico y adecuarlo segun los metodos que se requiere
//ahora ya son compatibles
public class MotorElectricoAdapter extends Motor {
	private MotorElectrico motorElectrico; //Referencia de la clase adaptee
	public MotorElectricoAdapter() {
		
		super();
		System.out.println("Creando motor electrico adapter..");
		this.motorElectrico=new MotorElectrico();
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Movimiento realizado a las " + formatoDeFecha.format(hora)) ;
	}
	//Le da cuerpo a los metodos abstractos haciendo uso de la  referencia que tiene de la clase que se va a adaptar
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encendiendo motor electrico adapter..");
		this.motorElectrico.conectar();//cuando se  llame a encender usara los metodos conectar y activar de la clase motor electrico
		this.motorElectrico.activar();
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Motor encendido a las " + formatoDeFecha.format(hora)) ;
	}
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelerando motor electrico adapter..");
		this.motorElectrico.moverMasRapido();
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Motor acelerado a las " + formatoDeFecha.format(hora)) ;
	}
	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagando motor electrico adapter..");
		this.motorElectrico.detener();
		this.motorElectrico.desconectar();
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Motor apagado a las " + formatoDeFecha.format(hora)) ;
	}
}
