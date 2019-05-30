package clases;

public class Depositar extends Funcionalidades{

	@Override
	public void Transaccion() {
		System.out.print("\nEste es su saldo actual: " + getSaldo());
		
		System.out.print("\n*********************************");
		System.out.print("\nIntroduzca la cantidad del deposito: ");
		Deposito();
		
		System.out.print("\n*********************************");
		if(deposito > 0) {
			System.out.print("\n*********************************");
			setSaldo(transaccion + deposito);
			System.out.print("\n*********************************");
			System.out.print("\nProcesando...");
			System.out.print("\n*********************************");
			System.out.print("\nDepositaste: " + getDeposito());
			System.out.print("\n*********************************");
			System.out.print("\nSu saldo actual es: " + getSaldo() + "\n");
			}
		else {System.out.print("\nEl deposito debe ser mayor que 0");}
	}
	
}