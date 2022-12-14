package bytebank_composto;

public class Conta {
	// declaração de variaveis
	
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	// devolve a informação -> recebe informação
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta destino ) {
		
		if (this.saldo >= valor) {
			this.saldo-= valor;
			destino.deposita(valor);
			return true;
		}
			return false;
	}
	// pegar o saldo da conta
	public double getSaldo(){
		return this.saldo;
	}
	
	// altera o saldo da conta
	
}