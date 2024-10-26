//TODO: cambiar los monederos inmutables a monederos normales
package expendedora;

public class Maquina {
	
	//atributos
	private final String producto; 
	private final double precio; 
	private int stock; 
	private Monedero dineroAcumulado; 
	private Monedero dineroTransaccion; 
	
	//propiedad calculada
	public boolean isVacia() {
		return stock == 0; 
	}
	
	//getters
	public String getProducto() {
		return producto;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public int getStock() {
		return stock;
	}

	public Monedero getDineroAcumulado() {
		return dineroAcumulado.copiar();
	}

	public Monedero getDineroTransaccion() {
		return dineroTransaccion.copiar(); 
	}
	
	//constructor
	public Maquina (String init_producto, double init_precio, int init_stock) {
		producto = init_producto; 
		precio = init_precio; 
		stock = init_stock; 
		dineroAcumulado = new Monedero(); 
		dineroTransaccion = new Monedero(); 
	}
	
	//metodos 
	public void insertarMoneda(Moneda moneda) {
		dineroTransaccion.insertar(moneda);
	}
	
	public double devolverDinero() {
		double dinero = dineroTransaccion.getValorTotalMonedero();
		dineroTransaccion.vaciar();
		
		return dinero; 
	}
	
	public boolean comprar() {
		if (!isVacia() && dineroTransaccion.getValorTotalMonedero() >= precio) {
			stock--; 
			dineroAcumulado.combinar(dineroTransaccion);
			
			return true; 
		}
		
		return false;
	}
	

}
