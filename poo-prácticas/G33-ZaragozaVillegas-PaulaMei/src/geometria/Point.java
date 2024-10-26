package geometria;

public record Point(int x, int y) {
	
	//constructores
	public Point() {
		this(0,0);
	}
	
	public Point(Point otro) {
		this(otro.x, otro.y); 
	}
	
	//getters
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y; 
		}

	//metodos
	public Point desplazar(int incX, int incY) {
		int newX = x + incX; 
		int newY = y + incY; 
		
		return new Point(newX, newY); 
	}
	
	public Point desplazar(Direccion direccion) {
		return switch(direccion) {
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
	}
	
}
