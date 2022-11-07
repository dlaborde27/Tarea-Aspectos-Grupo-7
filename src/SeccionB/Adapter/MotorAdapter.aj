package SeccionB.Adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

public aspect MotorAdapter {
	
	//despues de la creación de cualquier objeto Motor muestre la fecha
	//en la que se creo.
	after() : execution (public void SeccionB.Adapter.*.Motor (..)){
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Movimiento realizado a las " + formatoDeFecha.format(hora)) ;
	}
	
	//despues de que se encienda cualquier motor muestre la fecha.
	after() : execution (public void SeccionB.Adapter.*.encender(..)){
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Motor encendido a las " + formatoDeFecha.format(hora)) ;
	}
	
	//antes de que se apague cualquier motor muestre la fecha.
	before() : execution (public void SeccionB.Adapter.*.apagar(..)){
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Apagando motor a las " + formatoDeFecha.format(hora)) ;
	}
	
	//despues de que se acelere un motor muestre la fecha.
	after() : execution (public void SeccionB.Adapter.*.acelerar(..)){
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Motor acelerado a las " + formatoDeFecha.format(hora)) ;
	}
}
