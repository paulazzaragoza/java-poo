package geometria;

public class Punto {
	
	//atributos
	private int x; 
	private int y; 
	
	//constructores
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Punto() {
		this(0, 0);
	}
	
	public Punto(Punto otro) {
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
	public void desplazar(int incX, int incY) {
		x += incX; 
		y += incY; 
	}
}
