package geometria;

import static java.lang.Math.*;

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
	
	public double distancia(Punto punto) {
		int difX = x - punto.getX();
		int difY = y - punto.getY();
		
		return sqrt(pow(difX, 2) + pow(difY,2));
	}
	
	public void desplazar(Direccion direccion) {
		switch(direccion) {
		case ARRIBA:
			desplazar(0, 1); 
			break;
		case ABAJO: 
			desplazar(0, -1);
			break; 
		case DERECHA: 
			desplazar(1, 0);
			break; 
		case IZQUIERDA: 
			desplazar(-1, 0); 
			break; 
		default: 
			break; 
		}
	}
	
	public static Punto mayorDistancia(Punto...puntos) {
		Punto masLejano = null;
		double mayorDistancia = 0; 
		
		Punto origen = new Punto(); //punto origen (0,0)
		
		for(Punto punto : puntos) {
			double distanciaActual = origen.distancia(punto);
			
			if(distanciaActual > mayorDistancia) {
				masLejano = punto; 
				mayorDistancia = distanciaActual; 
			}
		}
		
		return masLejano; 
		
	}
}
