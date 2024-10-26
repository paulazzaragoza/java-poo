package pruebas;
import expendedora.MonederoInmutable;
import expendedora.Moneda;

public class PruebaMonedero {

	public static void main(String[] args) {
		MonederoInmutable m1 = new MonederoInmutable(Moneda.UN_EURO, 2);
		MonederoInmutable m2 = new MonederoInmutable(Moneda.UN_EURO, 4);
		MonederoInmutable m3 = m1;
		System.out.println("CREANDO...");
		System.out.println("m1 UN_EURO: " + m1.getUnEuro());
		System.out.println("m2 UN_EURO: " + m2.getUnEuro());
		System.out.println("m3 UN_EURO: " + m3.getUnEuro());
		
		MonederoInmutable m4 = m1.insertar(Moneda.DOS_EUROS, 3);
		MonederoInmutable m5 = m2.insertar(Moneda.CINCUENTA_CENTIMOS);
		System.out.println("INSERTANDO...");
		System.out.println("m4 DOS_EUROS: " + m4.getDosEuros());
		System.out.println("m5 CINCUENTA_CENTIMOS: " + m5.getCincuentaCentimos());
		System.out.println("m3 DOS_EUROS: " + m3.getDosEuros());
		
		MonederoInmutable m6 = m4.combinar(m5);
		System.out.println("COMBINANDO...");
		System.out.println("m4 UN_EURO: " + m4.getUnEuro());
		System.out.println("m4 DOS_EUROS: " + m4.getDosEuros());
		System.out.println("m4 CINCUENTA_CENTIMOS: " + m4.getCincuentaCentimos());
		System.out.println("m6 UN_EURO: " + m6.getUnEuro());
		System.out.println("m6 CINCUENTA_CENTIMOS: " + m6.getCincuentaCentimos());
		
		System.out.println("CALCULANDO...");
		double m4Total = m4.getValorTotalMonedero(); 
		System.out.println("m4Total: " + m4Total);

	}

}
