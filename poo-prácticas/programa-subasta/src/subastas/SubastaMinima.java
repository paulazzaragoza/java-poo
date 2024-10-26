package subastas;

public class SubastaMinima extends Subasta{
	//atributos
	private int cantidadMinima; 
	
	//getters
	public int getCantidadMinima() {
		return cantidadMinima; 
	}
	
	//setters
	public void setCantidadMinima(int cantidad) {
		cantidadMinima = cantidad; 
	}
	
	//constructor
	public SubastaMinima(String nombreProducto, String nombreUsuario, int cantidad) {
		super(nombreProducto, nombreUsuario);
		cantidadMinima = cantidad; 
	}
	
	//metodos
	@Override
	public boolean ejecutar() {
		if (getPujaMayor() >= cantidadMinima) {
			return ejecutar();
		}
		
		return false; 
	}
}
