package pruebas;
import subastas.*;
import java.util.LinkedList;
import java.util.Collections;

public class PruebaSesion {

	public static void main(String[] args) {
		String n1 = "Juan";
		String n2 = "Enrique";
		
		SubastaLimitada limitada = new SubastaLimitada("Disco duro multimedia", n1, 1);
		SubastaTemporal temporal = new SubastaTemporal("Teclado", n1, 3);
		SubastaMinima minima = new SubastaMinima("Impresora láser", n1, 100);
		
		LinkedList<Subasta> subastas = new LinkedList<Subasta>(); 
		Collections.addAll(subastas, limitada, temporal, minima);
		
		for (Subasta subasta : subastas) {
			System.out.printf("Nombre: %s\n", subasta.getProducto());
			System.out.println("Se ha pujado los 10 euros: " + subasta.pujar(n2, 10));
			System.out.println("Se ha pujado los 20 euros: " + subasta.pujar(n2, 20));
			
			if (subasta instanceof SubastaLimitada limit) {
				System.out.println("Pujas pendientes: " + limit.getPujasPendientes());
			}
			
			if (subasta.isAbierta()) {
				System.out.println("Se ha ejecutado la subasta: " + subasta.ejecutar());
			} else {
				System.out.println("La subasta está cerrada");
			}
			
		}
		
	}

}
