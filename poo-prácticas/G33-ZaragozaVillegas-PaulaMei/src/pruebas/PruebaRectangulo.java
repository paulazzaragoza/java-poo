package pruebas;
import geometria.*;

public class PruebaRectangulo {

	public static void main(String[] args) {
		Point verticeII = new Point (3, 1);
		Rectangulo azul = new Rectangulo (verticeII, 2, 5);
		
		System.out.println("Creando rectángulo...");
		System.out.printf("VérticeII rectángulo = {%d,%d}\n", azul.getVerticeII().getX(), azul.getVerticeII().getY());
		
		
		azul.desplazar(0, -7);
		System.out.println("Desplazando rectángulo...");
		System.out.printf("VérticeSI rectángulo = {%d,%d}\n", azul.getVerticeSI().getX(), azul.getVerticeSI().getY());
		
		azul.escalar(50);
		System.out.println("Escalando rectángulo...");
		System.out.printf("ladoX: %d\n", azul.getLadoX());
		System.out.printf("VérticeII rectángulo = {%d,%d}\n", azul.getVerticeII().getX(), azul.getVerticeII().getY());
		System.out.printf("VérticeID rectángulo = {%d,%d}\n", azul.getVerticeID().getX(), azul.getVerticeID().getY());
		System.out.printf("VérticeSD rectángulo = {%d,%d}\n", azul.getVerticeSD().getX(), azul.getVerticeSD().getY());
		System.out.printf("VérticeSI rectángulo = {%d,%d}\n", azul.getVerticeSI().getX(), azul.getVerticeSI().getY());

	}

}
