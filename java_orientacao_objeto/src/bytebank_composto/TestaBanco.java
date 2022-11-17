package bytebank_composto;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente gleyson = new Cliente();
		
		gleyson.nome = "Gleyson rocha moura";
		gleyson.cpf = "000.000.000-00";
		gleyson.profissao = "dev";
		
		Conta contaDoGleyson = new Conta();
		
		contaDoGleyson.deposita(100);
		
		contaDoGleyson.titular = gleyson;
		System.out.println("conta do gleyson: " + contaDoGleyson.titular.nome);
	}

}
