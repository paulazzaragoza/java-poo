package expendedora;

public class Maquina {
	
	//atributos
	private final String producto; 
	private final double precio; 
	private int stock; 
	private Monedero dinero_acumulado; 
	private Monedero dinero_transaccion; 
	
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
	
	public double getDineroAcumulado() {
		return dinero_acumulado.getValorTotalMonedero();
	}
	
	public double getDineroTransaccion() {
		return dinero_transaccion.getValorTotalMonedero();
	}
	
	//constructor
	public Maquina (String init_producto, double init_precio, int init_stock) {
		producto = init_producto; 
		precio = init_precio; 
		stock = init_stock; 
		dinero_acumulado = new Monedero(); 
		dinero_transaccion = new Monedero(); 
	}
	
	//metodos 
	public void insertarMoneda(Moneda moneda) {
		dinero_transaccion.insertar(moneda);
	}
	
	public double devolverDinero() {
		double dinero = dinero_transaccion.getValorTotalMonedero();
		dinero_transaccion.vaciar();
		
		return dinero; 
	}
	
	public boolean comprar() {
		if (!isVacia() && getDineroTransaccion() >= precio) {
			stock--; 
			dinero_acumulado.combinar(dinero_transaccion);
			
			return true; 
		}
		
		return false;
	}
	

}
