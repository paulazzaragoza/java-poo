package pruebas;
import expendedora.*;

public class PruebaMaquina {

	public static void main(String[] args) {
		System.out.println("CREANDO...");
		Maquina agua = new Maquina("Agua", 0.6, 10);
		System.out.println("Producto: " + agua.getProducto());
		System.out.println("Precio: " + agua.getPrecio());
		System.out.println("Stock: " + agua.getStock());
		System.out.println("Dinero acumulado: " + agua.getDineroAcumulado());
		System.out.println("Dinero trasanccioón: " + agua.getDineroTransaccion());
		System.out.println("Está vacía: " + agua.isVacia());

		
		System.out.println("INSERTANDO...");
		agua.insertarMoneda(Moneda.UN_EURO);
		System.out.println("dinero_transaccion: " + agua.getDineroTransaccion());
		
		System.out.println("DEVOLVIENDO...");
		double dinero_devuelto = agua.devolverDinero();
		System.out.println("dinero_devuelto: " + dinero_devuelto);
		System.out.println("dinero_transaccion: " + agua.getDineroTransaccion());
		
		
		System.out.println("INSERTANDO...");
		agua.insertarMoneda(Moneda.CINCUENTA_CENTIMOS);
		System.out.println("dinero_transaccion: " + agua.getDineroTransaccion());
		
		System.out.println("COMPRANDO...");
		boolean exito_compra = agua.comprar(); 
		System.out.println("exito_compra: " + exito_compra);
		
		
		System.out.println("INSERTANDO...");
		agua.insertarMoneda(Moneda.VEINTE_CENTIMOS);
		System.out.println("dinero_transaccion: " + agua.getDineroTransaccion());
		
		System.out.println("COMPRANDO...");
		exito_compra = agua.comprar(); 
		System.out.println("exito_compra: " + exito_compra);
		
		System.out.println("Producto: " + agua.getProducto());
		System.out.println("Precio: " + agua.getPrecio());
		System.out.println("Stock: " + agua.getStock());
		System.out.println("Dinero acumulado: " + agua.getDineroAcumulado());
		System.out.println("Dinero trasacción: " + agua.getDineroTransaccion());
		System.out.println("Está vacía: " + agua.isVacia());
	}

}
