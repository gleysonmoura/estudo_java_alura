package bytebank_herdado;
// gerente herda da classe funcionario

public class Gerente extends Funcionario{

	private int senha;
		
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica (int senha) {
		if (this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getBonificacao () {
		System.out.println("metodo de bonificação do gerente");
		return super.getBonificacao() + super.getSalario();
	}
}
