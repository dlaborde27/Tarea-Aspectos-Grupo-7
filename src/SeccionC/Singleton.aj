package SeccionC;

privileged public aspect Singleton {
	
	pointcut mismoFax():
		execution(Fax Fax.getInstancia());
	
	pointcut mismaImpresora():
		execution(Impresora Impresora.getInstancia());
	
	
	Fax around(): mismoFax(){
		Fax instancia = Fax.instancia;
		if(instancia == null) {
			instancia = new Fax();
		}
		return instancia;
	}
	
	Impresora around(): mismaImpresora(){
		Impresora instancia = Impresora.instancia;
		if(instancia == null) {
			instancia = new Impresora();
		}
		return instancia;
	}
	
}
