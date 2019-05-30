package clases;

public class Retiro extends Funcionalidades{
	
	@Override
	public void Transaccion() {
		System.out.print("\nEste es su saldo disponible: " + getSaldo());
		System.out.print("\n*********************************");
		
		System.out.print("\nIntroduzca el monto que desea retirar: " );
		Retiro();
		
		if(retiro > getSaldo()) {
			System.out.print("\n*********************************");
			System.out.print("\n No puede retirar " + getRetiro() + ". La cantidad es mayor que su saldo.\n");
		}
		else if(retiro <= getSaldo()) {
			transaccion = getSaldo();
			
			setSaldo(transaccion - retiro);
			System.out.print("\n*********************************");
			System.out.print("\nProcesando...");
			System.out.print("\n*********************************");
			System.out.print("\nAcaba de retirar: " + getRetiro());
			System.out.print("\n*********************************");
			System.out.print("\n...");
			System.out.print("\n*********************************");
			System.out.print("\nSu saldo actual es: " + getSaldo() + "\n");
		}
		else {System.out.print("\n*********************************"); System.out.print("Esta accion es invalida.\n");}
	}
}