package SeccionA.Adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MotorComun extends Motor {
	public MotorComun() {
		super();
		System.out.println("Creando motor comun...");
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Movimiento realizado a las " + formatoDeFecha.format(hora)) ;
		}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encendiendo motor comun...");
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Motor encendido a las " + formatoDeFecha.format(hora)) ;

	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelerando motor comun...");
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Motor acelerado a las " + formatoDeFecha.format(hora)) ;

	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagando motor comun...");
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Motor apagado a las " + formatoDeFecha.format(hora)) ;

	}
	

}
