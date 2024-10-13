package expendedora;

public enum Moneda {
	UN_CENTIMO, DOS_CENTIMOS, CINCO_CENTIMOS, DIEZ_CENTIMOS, VEINTE_CENTIMOS, CINCUENTA_CENTIMOS, UN_EURO, DOS_EUROS
}

//Moneda.values() -> array con valores del enum
//Moneda.UN_EURO.ordinal() -> devuelve la posición del índice en el enum

//private int [] monedas = new int [Moneda.values().length()]