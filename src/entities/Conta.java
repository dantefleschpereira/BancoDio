package entities;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 001;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub

	}

}
