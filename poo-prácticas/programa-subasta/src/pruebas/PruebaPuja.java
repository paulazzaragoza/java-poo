package pruebas;
import subastas.Puja;

public class PruebaPuja {

	public static void main(String[] args) {
		Puja prueba = new Puja("Paula", 12);
		Puja copia = prueba; 
		
		System.out.println("prueba.pujador() = " + prueba.pujador().hashCode());
		System.out.println("copia.pujador() = " + copia.pujador().hashCode());

	}

}

