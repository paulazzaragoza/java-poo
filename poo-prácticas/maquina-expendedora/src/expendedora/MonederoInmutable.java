package expendedora;
import java.util.Arrays;

public class MonederoInmutable {
	
	//propiedades
	private final int[] monedas; 
	
	
	//propiedades calculada
	public double getValorTotalMonedero() {
		double total = 0; 
		double [] valores = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1.0, 2.0};
		
		for (int i = 0; i<monedas.length; i++) {
			total += monedas[i] * valores[i];
		}
		return total;
	}
	
	
	//getters
	public int getUnCentimo() {
		return monedas[Moneda.UN_CENTIMO.ordinal()]; 
	}
	public int getDosCentimos() {
		return monedas[Moneda.DOS_CENTIMOS.ordinal()]; 
	}
	public int getCincoCentimos() {
		return monedas[Moneda.CINCO_CENTIMOS.ordinal()]; 
	}
	public int getDiezCentimos() {
		return monedas[Moneda.DIEZ_CENTIMOS.ordinal()]; 
	}
	public int getVeinteCentimos() {
		return monedas[Moneda.VEINTE_CENTIMOS.ordinal()]; 
	}
	public int getCincuentaCentimos() {
		return monedas[Moneda.CINCUENTA_CENTIMOS.ordinal()]; 
	}
	public int getUnEuro() {
		return monedas[Moneda.UN_EURO.ordinal()]; 
	}
	public int getDosEuros() {
		return monedas[Moneda.DOS_EUROS.ordinal()]; 
	}
	
	
	//constructores
	public MonederoInmutable(Moneda moneda, int cantidad_moneda) {
		monedas = new int [Moneda.values().length];
		monedas[moneda.ordinal()] = cantidad_moneda; 
	}
	
	//cantidad de la moneda = 1
	public MonederoInmutable(Moneda moneda) {
		this(moneda, 1);
	}
	
	//monedero vacío
	public MonederoInmutable() {
		monedas = new int [Moneda.values().length];
	}
	
	//monedero dado un array
	private MonederoInmutable(int [] monedas) {
		this.monedas = monedas; 
	}
	
	
	//metodos 
	public MonederoInmutable insertar(Moneda moneda, int cantidad_moneda) {
		int [] copia_monedas = Arrays.copyOf(monedas, Moneda.values().length);
		copia_monedas[moneda.ordinal()] = cantidad_moneda;
		
		return new MonederoInmutable(copia_monedas); 
	}
	
	public MonederoInmutable insertar(Moneda moneda) {
		return this.insertar(moneda, 1);
	}
	
	public MonederoInmutable vaciar() {
		return new MonederoInmutable();
	}
	
	public MonederoInmutable combinar(MonederoInmutable otro) {
		int index = 0; 
		
		for (int moneda : monedas){
			monedas[index] = moneda + otro.monedas[index]; 
			index++;
		}
		
		return otro.vaciar();
	}

}
