package bytebank_encapsulado;

public class TestaGetSet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setNumero(12345);
		System.out.println("Novo numero da conta: " + conta.getNumero());
		
		Cliente gleyson = new Cliente();
		gleyson.setNome("Gleyson Rocha Moura");
		conta.setTitular(gleyson);
		
		System.out.println("titular da conta: " + conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Dev");
		System.out.println("profissão do titular da conta: " + conta.getTitular().getProfissao());

	}

}
