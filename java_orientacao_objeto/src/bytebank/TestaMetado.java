package bytebank;

public class TestaMetado {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println("conta do paulo: " + contaDoPaulo.saldo );
		
		contaDoPaulo.saca(20);
		System.out.println("novo saldo conta do paulo: " + contaDoPaulo.saldo);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		if(contaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("transferencia com sucesso");
		}
		else {
			System.out.println("Sem saldo");
		}
		System.out.println("conta da marcela " + contaMarcela.saldo);
		System.out.println("conta do paulo: " + contaDoPaulo.saldo );
		
		contaDoPaulo.titular = "paulo silveira";
		System.out.println("titular da conta paulo: " + contaDoPaulo.titular);
	}
}
