package clases;

/**
 * Esta clase hereda los atributos de la
 * clase Funcionalidades
 * 
 * @author Vilarjimenez
 *
 */
public class Consulta extends Funcionalidades{

	// Haciendo una instancia de la clase Funcionalidades
	@Override
	public void Transaccion() {
		System.out.print("\nSu saldo es: $" + getSaldo());
		System.out.print("\n*********************************\n");
	}
}
