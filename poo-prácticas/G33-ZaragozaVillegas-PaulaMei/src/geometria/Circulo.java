package geometria;

//cambiamos todas las referencias de Punto a PuntoInmutable

public class Circulo {
	//constantes 
	public static final PuntoInmutable ORIGEN_COORDENADAS = new PuntoInmutable();
	public static final int RADIO_POR_DEFECTO = 5;
	
	//atributos
	private PuntoInmutable centro; 
	private int radio; 
	
	//getters
	public PuntoInmutable getCentro() {
		//return centro -> alisasing
		return new PuntoInmutable(centro);
	}
	
	public int getRadio() {
		return radio; 
	}
	
	//propiedad calculada
	public double getPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	//constructores
	public Circulo(PuntoInmutable centro, int radio) {
		//this.centro = centro -> aliasing
		this.centro = new PuntoInmutable(centro); 
		this.radio = radio; 
	}
	
	public Circulo () {
		this(ORIGEN_COORDENADAS, RADIO_POR_DEFECTO);
	}
	
	//funcinalidad 
	public void desplazar(int incX, int incY) {
		centro.desplazar(incX, incY);
		//centro = centro.desplazar(incX, incY);
	}
	
	public void escalar(double porcentaje) {
		radio = (int)(radio * porcentaje/100);
		
	}
	
}
