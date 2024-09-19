package programa;

import bombilla.Bombilla; //importamos el paquete

public class Programa {

	public static void main(String[] args) {
		Bombilla b1 = new Bombilla();
		Bombilla b2 = new Bombilla();
		
		System.out.println("Intensidad de b1: " + b1.getIntesidad());
		b1.encender();
		System.out.println("Intensidad de b1 tras b1.encener(): " + b1.getIntesidad());
		
		b2.subirIntensidad();
		System.out.println("Intensidad de b2 tras b2.subirIntensidad(): " + b2.getIntesidad());

	}

}
