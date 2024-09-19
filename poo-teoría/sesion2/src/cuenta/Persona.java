package cuenta;

public class Persona {
	
	//atributos
	private final String nombre;
	private String dni;
	
	
	//constructores
	public Persona (String nombrePersona, String dniPersona) {
		nombre = nombrePersona; 
		dni = dniPersona; 
	}
	
	
	//métodos de consulta
	public String getNombre() {
		return nombre;
	}
	
	public String getDni() {
		return dni; 
	}
	
	
	//métodos de establecimiento
	public void setDni(String nuevoDni) {
		dni = nuevoDni; 
	}
}
