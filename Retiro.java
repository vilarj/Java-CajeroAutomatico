package clases;

public class Retiro extends Funcionalidades{
	
	@Override
	public void Transaccion() {
		System.out.print("\n*********************************");
		
		System.out.print("\nIntroduzca el monto que desea retirar: $" );
		Retiro();
		
		if(retiro > getSaldo()) {
			System.out.print("\n*********************************");
			System.out.print("\n No puede retirar esta cantidad. La cantidad es mayor que su saldo.\n");
		}
		else if(retiro <= getSaldo()) {
			transaccion = getSaldo();
			
			setSaldo(transaccion - retiro);
			System.out.print("\n*********************************");
			System.out.print("\nProcesando...");

			System.out.print("\nSu saldo actual es: $" + getSaldo());
			System.out.print("\n*********************************\n");
		}
		else {System.out.print("\n*********************************"); System.out.print("Esta accion es invalida.\n");}
	}
}
