package sintaxe_variaveis_e_fluxo;

public class testaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 20;
		int quantidadePesssoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais ou igual de 18 anos");
		} else {
			if (quantidadePesssoas >= 2) {
				System.out.println("vc n tem 18, mas pode entrar, pois ta acompanhado");
			} else {
				System.out.println("Infelizmente vc não pode entrar.");
			}
		}

	}

}
