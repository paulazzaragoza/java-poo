package expendedora;

public class Monedero {
	
	//propiedades
	private int [] monedas; 
	
	
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
	public int [] getMonedero() {
		int [] res = new int [Moneda.values().length]; 
		int index = 0; 
		
		for (int moneda : monedas) {
			res[index] = moneda; 
			index++;
		}
		return res; 
	}
	
	
	//monedero vacío
	public Monedero() {
		monedas = new int [Moneda.values().length];
	}
	
	//constructores
	public Monedero(Moneda moneda, int cantidad_moneda) {
		this();
		monedas[moneda.ordinal()] = cantidad_moneda; 
	}
	
	//cantidad de la moneda = 1
	public Monedero(Moneda moneda) {
		this(moneda, 1);
	}
	
	
	//metodos 
	public void insertar(Moneda moneda, int cantidad_moneda) {
		monedas[moneda.ordinal()] = cantidad_moneda;
	}
	
	public void insertar(Moneda moneda) {
		this.insertar(moneda, 1);
	}
	
	public void vaciar() {
		monedas = new int [Moneda.values().length];
	}
	
	public void combinar(Monedero otro) {
		int index = 0; 
		
		for (int moneda : monedas){
			monedas[index] = moneda + otro.monedas[index]; 
			index++;
		}
		
		otro.vaciar();
	}
	
	public Monedero copiar() {
		Monedero copia = new Monedero();
		
		for (int i = 0; i<monedas.length; i++){
			copia.monedas[i] = this.monedas[i];
		}
		return copia;
	}

}