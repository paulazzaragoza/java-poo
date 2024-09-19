package cuenta;

public class Cuenta {
	//atributos
	private final Persona titular; 
	private double saldo; 
	private EstadoCuenta estado;
	
	
	//constructor
	public Cuenta(Persona nombre, double saldoInicial) {
		titular = nombre;
		saldo = saldoInicial; 
		estado = EstadoCuenta.OPERATIVA;
	}
	
	public Cuenta (String nombre, String dni) {
		this(new Persona(nombre, dni), 100.0);
	}
	
	
	//métodos de consulta
	public Persona getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo; 
	}
	
	public EstadoCuenta getEstadoCuenta() {
		return estado;
	}
	
	
	//métodos
	public void ingreso(double cantidad) {
		saldo += cantidad;
	}
	
	public void reintegro(double cantidad) {
		if(saldo > cantidad)
			saldo -= cantidad; 
	}

}
