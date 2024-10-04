package geometria;

public class PuntoInmutable {

	//atributos
	private final int x; 
	private final int y; 
	
	//constructores
	public PuntoInmutable(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public PuntoInmutable() {
		this(0, 0);
	}
	
	public PuntoInmutable(PuntoInmutable otro) {
		x = otro.x;
		y = otro.y;
	}
	
	//getters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y; 
	}	
	
	//métodos
	public PuntoInmutable desplazar(int incX, int incY) {
		int newX = x + incX; 
		int newY = y + incY; 
		return new PuntoInmutable(newX, newY);
	}
	
	public PuntoInmutable desplazar(Direccion direccion) {
		PuntoInmutable destino = switch(direccion) {
		case ARRIBA -> {
			yield desplazar(0,1);
		}
		case ABAJO -> desplazar(0, -1);
		case DERECHA -> {
			yield desplazar(1,0);
		}
		case IZQUIERDA -> desplazar(-1,0);
		default ->  null;
		};
		
		return destino;
	}

}
