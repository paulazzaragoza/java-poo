package pruebas;
import expendedora.*;

public class PruebaMonedero {

	public static void main(String[] args) {
		Monedero m1 = new Monedero(Moneda.UN_EURO, 2);
		Monedero m2 = new Monedero(Moneda.UN_EURO, 4);
		Monedero m3 = m1;
		System.out.println("CREANDO...");
		System.out.println("m1 UN_EURO: " + m1.getUnEuro());
		System.out.println("m2 UN_EURO: " + m2.getUnEuro());
		System.out.println("m3 UN_EURO: " + m3.getUnEuro());
		
		m1.insertar(Moneda.DOS_EUROS, 3);
		m2.insertar(Moneda.CINCUENTA_CENTIMOS);
		System.out.println("INSERTANDO...");
		System.out.println("m1 DOS_EUROS: " + m1.getDosEuros());
		System.out.println("m2 CINCUENTA_CENTIMOS: " + m2.getCincuentaCentimos());
		System.out.println("m3 DOS_EUROS: " + m3.getDosEuros());
		
		m1.combinar(m2);
		System.out.println("COMBINANDO...");
		System.out.println("m1 UN_EURO: " + m1.getUnEuro());
		System.out.println("m1 DOS_EUROS: " + m1.getDosEuros());
		System.out.println("m1 CINCUENTA_CENTIMOS: " + m1.getCincuentaCentimos());
		System.out.println("m2 UN_EURO: " + m2.getUnEuro());
		System.out.println("m2 CINCUENTA_CENTIMOS: " + m2.getCincuentaCentimos());
		
		System.out.println("CALCULANDO...");
		double m1Total = m1.getValorTotalMonedero(); 
		System.out.println("m1Total: " + m1Total);

	}

}
