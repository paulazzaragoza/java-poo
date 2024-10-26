package pruebas;

import geometria.Punto; 

public class PruebaPunto {

	public static void main(String[] args) {
		Punto punto1 = new Punto(1, 3);
		System.out.println("punto1.x = " + punto1.getX());
		System.out.println("punto1.y = " + punto1.getY());
		
		Punto punto2 = new Punto();
		System.out.printf("punto2 = (%d, %d) \n", punto2.getX(), punto2.getY());
		
		Punto punto3 = new Punto(punto1);
		System.out.printf("punto3 = (%d, %d) \n", punto3.getX(), punto3.getY());
		
		//aliasing -> si modificamos punto2 (o punto4) se modifica punto 4 (o punto2)
		Punto punto4 = punto2; 
		System.out.println("punto4.hashCode() = " + punto4.hashCode());
		System.out.println("punto2.hashCode() = " + punto2.hashCode());
		
	}

}
