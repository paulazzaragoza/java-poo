package subastas;
import java.util.ArrayList;

public class Subasta {
	
	//constantes
	protected static final int INCREMENTO = 1; 
	
	//atributos 
	private String producto; 
	private String propietario; 
	private boolean abierta; 
	private ArrayList<Puja> pujas; 
	
	
	//propiedad calculada
	public int getPujaMayor(){
		if (pujas.isEmpty()) return 0;
		
		return pujas.getLast().cantidad(); 
	}
	
	
	//getters
	public String getProducto() {
		return producto;
	}
	
	public String getPropietario() {
		return propietario; 
	}
	
	public boolean isAbierta() {
		return abierta; 
	}
	
	public ArrayList<Puja> getPujas(){
		
		return new ArrayList<Puja>(pujas); 
	}
	
	
	//constructor
	public Subasta (String nombreProducto, String nombreUsuario) {
		producto = nombreProducto; 
		propietario = nombreUsuario; 
		abierta = true;
		pujas = new ArrayList<Puja>(); 
	}
	
	
	//metodos
	public boolean pujar(String usuario, int cantidad) {
		
		if (!abierta || usuario == propietario || cantidad < getPujaMayor()) {
			return false;
		}
		
		Puja creada = new Puja(usuario, cantidad); 
		pujas.add(creada);
		return true; 
	}
	
	public boolean pujar(String usuario) {
		int pujaMayor = getPujaMayor();
		
		if (pujaMayor == 0) {
			return this.pujar(usuario, pujaMayor+INCREMENTO);
		}
		
		return this.pujar(usuario, pujaMayor);
	}
	
	public boolean ejecutar(){
		if(pujas.size() != 0 && isAbierta()){ 
			abierta = false; 
			return true; 
		}
		
		return false; 
	}
}
