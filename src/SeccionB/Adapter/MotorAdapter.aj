package SeccionB.Adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

public aspect MotorAdapter {
	
	//despues de la creación de cualquier objeto Motor muestre la fecha
	//en la que se creo.
	after() : execution (public void *motor*(..)){
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Movimiento realizado a las " + formatoDeFecha.format(hora)) ;
	}
	
	//despues de que se encienda cualquier motor muestre la fecha.
	after() : execution (public void encender(..)){
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Motor encendido a las " + formatoDeFecha.format(hora)) ;
	}
	
	//despues de que se apague cualquier motor muestre la fecha.
	after() : execution (public void apagar(..)){
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Motor apagado a las " + formatoDeFecha.format(hora)) ;
	}
	
	//despues de que se acelere un motor muestre la fecha.
	after() : execution (public void acelerar(..)){
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Motor acelerado a las " + formatoDeFecha.format(hora)) ;
	}
}
