package pruebas;
import subastas.Subasta;

public class PruebaSubastas {
	public static void main (String [] args) {
		
		Subasta primeraSubasta = new Subasta("Teléfono movil", "Juan"); 
		
		primeraSubasta.pujar("Pedro", 100); 
		System.out.println("Puja mayor de la subasta = " + primeraSubasta.getPujaMayor());
		
		primeraSubasta.pujar("Enrique", 50); 
		System.out.println("Puja mayor de la subasta = " + primeraSubasta.getPujaMayor());
		
		boolean esEjecutada = primeraSubasta.ejecutar();
		System.out.println("Es ejecutada = " + esEjecutada);
		
		boolean esPujada = primeraSubasta.pujar("Enrique", 200);
		System.out.println("Es pujada = " + esPujada);
		
	}
}
