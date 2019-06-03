package clases;

public class Depositar extends Funcionalidades{

	@Override
	public void Transaccion() {
		System.out.print("\n*********************************");
		System.out.print("\nIntroduzca la cantidad del deposito: $");
		Deposito();
		
		System.out.print("\n*********************************");
		if(deposito > 0) {
			transaccion = getSaldo();
			setSaldo(transaccion + deposito);
			System.out.print("\n*********************************");
			System.out.print("\nProcesando...");
			System.out.print("\nSu saldo actual es: $" + getSaldo());
			System.out.print("\n*********************************\n");
			}
		else {System.out.print("\nEl deposito debe ser mayor que 0\n");}
	}
	
}
