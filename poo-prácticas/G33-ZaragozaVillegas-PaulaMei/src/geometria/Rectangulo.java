package geometria;

public class Rectangulo {
	//atributos
	private int ladoX; 
	private int ladoY; 
	private Point verticeII;
	private Point verticeSD;
	
	
	
	//atributo calculado
	public int getPerimetro() {
		return 2*ladoY + 2*ladoX;
	}
	
	
	
	//getters
	public int getLadoX() {
		return ladoX;
	}
	
	public int getLadoY() {
		return ladoY;
	}
	
	public Point getVerticeII() {
		return verticeII; 
	}
	
	public Point getVerticeSI() {
		return new Point(verticeII.getX(), verticeSD.getY()); 
	}
	
	public Point getVerticeSD() {
		return verticeSD; 
	}
	
	public Point getVerticeID() {
		return new Point(verticeSD.getX(), verticeII.getY()); 
	}
	
	
	
	//constructores
	public Rectangulo(Point vII, int lX, int lY) {
		verticeII = vII; 
		ladoX = lX; 
		ladoY = lY;
		verticeSD = new Point(verticeII.getX()+ladoX,  verticeII.getY()+ladoY);
	}
	
	public Rectangulo(Point vII, Point vSD) { //poner un constructor con this
		this(vII, vII.getX()-vSD.getX(),vSD.getY()-vII.getY());
	}
	
	
	
	//metodos
	public void desplazar(int incX, int incY) {
		verticeII = verticeII.desplazar(incX, incY);
		verticeSD = verticeSD.desplazar(incX, incY);
	}
	
	public void escalar(double porcentaje) { 
		ladoX = (int)(ladoX * porcentaje / 100); 
		ladoY = (int)(ladoY * porcentaje / 100); 
		
		verticeSD = new Point(verticeII.getX() + ladoX, verticeII.getY() + ladoY);
	}
	
}
