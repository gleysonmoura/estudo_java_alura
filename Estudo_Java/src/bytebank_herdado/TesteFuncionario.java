package bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente gleyson = new Gerente();
		gleyson.setNome("Gleyson Rocha Moura");
		gleyson.setCpf("007.580.761-01");
		gleyson.setSalario(2600.0);
		
		System.out.println("Nome: " + gleyson.getNome() + "\nCPF: " + gleyson.getCpf() + "\nSalario: " + gleyson.getSalario() + "\nBonificação " + gleyson.getBonificacao());
		
	}

}
