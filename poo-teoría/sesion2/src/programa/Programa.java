package programa;

import cuenta.Cuenta;
import cuenta.Persona;

public class Programa {

	public static void main(String[] args) {
		otros.Cuenta c0 = null; //si hay dos clases nombradas iguales pero en paquetes distintos. No tiene objeto
		System.out.println("El valor de c0 es: " + c0);
		c0 = new otros.Cuenta(); //el objeto se ha creado
		System.out.println("El valor de c0 despues de new es: " + c0);
		
		Persona p1 = new Persona("Juan","123456A");
		Cuenta c1 = new Cuenta(p1, 100.0);
		Cuenta c2 = new Cuenta(p1, 450.0);
		
		System.out.println("DNI del titular en c1 = "+c1.getTitular().getDni());
		System.out.println("DNI del titular en c2 = "+c2.getTitular().getDni());
		
		//aliasing
		p1.setDni("654321Z");
		System.out.println("DNI del titular en c1 tras p1.setDni() = "+c1.getTitular().getDni());
		System.out.println("DNI del titular en c2 tras el p1.setDni() = "+c2.getTitular().getDni());

	}

}
