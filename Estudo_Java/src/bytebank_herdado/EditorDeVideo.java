package bytebank_herdado;
// gerente herda da classe funcionario

public class EditorDeVideo extends Funcionario{
	
	public double getBonificacao () {
		System.out.println("metodo de bonificação do editor de video");

		return super.getBonificacao() + 100;
	}
}
