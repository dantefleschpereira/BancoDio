package entities;

public class Main {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente(new Cliente("Karla"));
		Conta cp = new ContaPoupanca(new Cliente("Julia"));
		
		cc.depositar(100);
		cc.transferir(80, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}
}
