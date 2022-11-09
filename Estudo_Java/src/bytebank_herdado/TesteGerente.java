package bytebank_herdado;

public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		
		g1.setNome("Gleyson Moura");
		g1.setCpf("000.000.000-00");
		g1.setSalario(5000.0);
		
		System.out.println("nome: " + g1.getNome() + " CPF: " + g1.getCpf() + " Salario: " + g1.getSalario());
		g1.setSenha(222);
		boolean autenticou  = g1.autentica(222);
		System.out.println("autenticou? " + autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}
