package pruebas;

import geometria.Punto;
import geometria.Direccion; 

public class PogramaSesion3 {

	public static void main(String[] args) {
		Punto punto1 = new Punto(1,1);
		
		Direccion[] direcciones = Direccion.values(); 
		
		for (int i= 0; i < direcciones.length; i++) {
			System.out.println(direcciones[i]);
		}
		
		for (Direccion direccion : direcciones) {
			punto1.desplazar(direccion);
			System.out.println("Desplazando " + direccion);
			System.out.printf("(%d,%d)\n", punto1.getX(), punto1.getY());
		}
		
		
		
		
		Punto punto2 = new Punto(4, 2);
		
		//opcion1
		Punto[] puntos = {punto1, punto2};
		
		//opcion2
		Punto[] puntos2 = new Punto[] {punto1, punto2}; 
		
		//opcion3
		Punto[] puntos3 = new Punto[2];
		puntos3[0] = punto1; 
		puntos3[1] = punto2; 
		
		for (Punto punto : puntos) {
			System.out.printf("(%d,%d)\n", punto.getX(), punto.getY());
		}
		
		
		
		
		double distancia1_2 = punto1.distancia(punto2);
		System.out.println("Distancia de punto1 entre punto2: " + distancia1_2);
		System.out.printf("Distancia de punto1 entre punto2 con redondeo: %.5f", distancia1_2);
		
		
		
		Punto masLejano = Punto.mayorDistancia(punto1, punto2);
		System.out.printf("\nmasLejano: (%d,%d)", masLejano.getX(), masLejano.getY());
	}

}
