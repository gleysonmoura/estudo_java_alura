package bytebank_herdado;

public class TesteReferencias {

	public static void main(String[] args) {

		Gerente ger = new Gerente();
		ger.setNome("Marcos");
		ger.setSalario(5000.0);
		//String nome = ger.getNome();
		
//		Funcionario funci = new Gerente();
//		funci.setSalario(2000.0);
//		funci.setNome("Bene");
//		String nomeF = ger.getNome();

		EditorDeVideo edi = new EditorDeVideo();
		edi.setSalario(2500.0);
		
		Designer desi = new Designer();
		
		//Designer desi = new Designer();
		desi.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
        controle.registra(ger);
		controle.registra(desi);
		controle.registra(edi);


		System.out.println(controle.getSoma());
		//System.out.println("nome Funcionario: " + nomeF + " Salario " + controle.getSoma());

	}

}
