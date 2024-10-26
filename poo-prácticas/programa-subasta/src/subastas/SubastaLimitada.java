package subastas;

public class SubastaLimitada extends Subasta {
	
	//atributos
	protected final int MAX_PUJAS;
	
	
	//constructores
	public SubastaLimitada(String nombreProducto, String nombreUsuario, int MAX) {
		super(nombreProducto, nombreUsuario);
		MAX_PUJAS = MAX; 
		
	}
	
	//getters
	public int getPujasPendientes() {
		return MAX_PUJAS - getPujas().size();
	}
	
	//metodos
	@Override
	public boolean pujar(String usuario, int cantidad) {
		boolean pujado = super.pujar(usuario, cantidad); 
		
		ejecutar();
		
		return pujado; 
	}
	
	@Override
	public boolean pujar(String usuario) {
		int pujaMayor = getPujaMayor();
		
		if (pujaMayor == 0) {
			return pujar(usuario, pujaMayor + INCREMENTO);
		}
		
		return pujar(usuario, pujaMayor); 
	}
	
	@Override
	public boolean ejecutar() {
		if (getPujas().size() == MAX_PUJAS) {
			return super.ejecutar();
		}
		
		return false;
	}
}
