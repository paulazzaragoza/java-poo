package subastas;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SubastaTemporal extends SubastaLimitada{
	
	//atributos 
	private final LocalDateTime duracion = LocalDateTime.now();
	private LocalDateTime vencimiento;
	
	//atributos calculados
	public long getHorasRestantes() {
		return ChronoUnit.HOURS.between(vencimiento, duracion);
	}
	
	//getters 
	public LocalDateTime getDuracion() {
		return duracion; 
	}
	
	public LocalDateTime getVencimieno() {
		return vencimiento; 
	}
	
	//constructores
	public SubastaTemporal(String nombreProducto, String nombreUsuario, int duracionPuja) {
		super(nombreProducto, nombreUsuario, duracionPuja*2);
		vencimiento = LocalDateTime.now().plusHours(duracionPuja);
	}
	
	//metodos
	@Override
	public boolean pujar(String usuario, int cantidad) {
		boolean pujado = super.pujar(usuario, cantidad);
		
		ejecutar(); 
		
		return pujado;
	}
	
	@Override
	public boolean pujar(String usuario) {
		int pujaMayor = getPujaMayor();
		
		if (pujaMayor == 0) {
			return pujar(usuario, pujaMayor + INCREMENTO);
		}
		
		return pujar(usuario, pujaMayor); 
	}
	
	@Override
	public boolean ejecutar() {
		if (this.getHorasRestantes() == 0) {
			return super.ejecutar(); 
		}
		
		return false;
	}
}
