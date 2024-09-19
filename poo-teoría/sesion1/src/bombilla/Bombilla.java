package bombilla;

public class Bombilla {
	
	//atributos 
	private int intensidad;
	
	
	//métodos de acceso de las propiedades
	public int getIntesidad() {
		return intensidad; 
	}
	
	public boolean isEncendida() {
		return intensidad > 0;
	}
	
	
	//métodos
	public void encender() {
		intensidad = 3; 
	}
	
	public void apagar() {
		intensidad = 0;
	}
	
	public void subirIntensidad() {
		if(intensidad < 3) intensidad++;
	}
	
	public void bajarIntensidad() {
		if(intensidad > 0) 
			intensidad--;
	}

}
