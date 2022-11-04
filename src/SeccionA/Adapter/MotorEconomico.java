package SeccionA.Adapter;

public class MotorEconomico extends Motor {
	public MotorEconomico() {super();
	System.out.println("Creando motor economico...");}
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encendiendo motor economico...");

	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelerando motor economico...");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagando motor economico...");
	}
	
}
