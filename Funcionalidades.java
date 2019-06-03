package clases;
import java.util.Scanner;

/**
 * En esta clase veremos todas las funcionalidades del programa.
 * Esta clase es la que dara a otras clases el codigo para no sobreescribir
 * el codigo varias veces. Por ende, nos ahorraremos tiempo
 * 
 * @author Vilarjimenez
 *
 */
public abstract class Funcionalidades {
	
	Scanner entrada = new Scanner(System.in); // Objecto de tipo Scanner para almacenar desde teclado
	protected String contraseña;
	protected int idUsuario;
	protected double transaccion; // modificador protected
	protected double retiro; // para poder usarlo solo dentro de las clases
	protected double deposito; // que existen en este paquete (clases)
	private static double saldo; // mod privado y campo static porque no queremos que esta informacion salga de esta clase
	
	/**
	 * Metodo que nos provee el menu de opciones.
	 *  Aqui prodemos instanciar nuestras funcionalidades.
	 */
	public void Funciones() {
		System.out.print("\n*********************************");
		System.out.print("\n*********************************");
		System.out.print("\n*********************************");
		
		System.out.print("\nEntre los cuatro digitos de su tarjeta: ");
		idUsuario = entrada.nextInt();
		
		System.out.print("\n*********************************");
		System.out.print("\n*********************************");
		
		System.out.print("\nContraseña: ");
		contraseña = entrada.next();
		
		int cambios = 0;
		int usuario = 0;
		
		do {
			do {
				System.out.print("Bienvenido, " + idUsuario + ". Que desea hacer?"
						+ "\n1. Consultar su balance"
						+ "\n2. Retirar dinero"
						+ "\n3. Depositar dinero"
						+ "\n4. Salir\n");
				usuario = entrada.nextInt();
				System.out.print("\n*********************************");
				
				// Controlando la opcion del usuario
				if(usuario >= 1 && usuario <= 4) {cambios = 1;}
				else {System.out.print("\n*********************************"); System.out.print("\nOpcion invalida.");}
			}
		
		while(cambios == 0);
	
		if(usuario == 1) {
			System.out.print("\n*********************************");
			Funcionalidades funcion = new Consulta();
			funcion.Transaccion();
			
		}
		else if(usuario == 2) {
			System.out.print("\n*********************************");
			Funcionalidades funcion = new Retiro();
			funcion.Transaccion();
			}
		
		else if(usuario == 3) {
			System.out.print("\n*********************************");
			Funcionalidades funcion = new Depositar();
			funcion.Transaccion();
		}
		else if(usuario == 4) {Salir();}
		else {System.out.print("\n*********************************"); System.out.print("\nEsta opcion no existe.");}
		}
		// Queremos que el menu siga apareciendo mientras la opcion no sea 2
		while(cambios != 2);
	}
	
	/**
	 * Este metodo maneja la opcion del retiro
	 */
	public void Retiro() {retiro = entrada.nextDouble();}
	
	/**
	 * Este metodo maneja la opcion del deposito
	 */
	public void Deposito() {deposito = entrada.nextDouble();}
	
	/**
	 * Este metodo maneja la opcion de la salida
	 */
	public void Salir() {
		System.out.print("\n*********************************");
		System.out.print("\nGracias por usar nuestros servicios.");
		System.exit(0);
	}
	
	// Polimorfismo: Metodo Abstracto
	public abstract void Transaccion();
	
	// Getter
	public double getSaldo() {return saldo;}
	
	// Setter
	public void setSaldo(double s) {
		this.saldo = s;
	}
}
