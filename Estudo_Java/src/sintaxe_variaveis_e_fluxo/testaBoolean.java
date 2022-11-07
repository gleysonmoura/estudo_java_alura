package sintaxe_variaveis_e_fluxo;

public class testaBoolean {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 16;
		//int quantidadePesssoas = 3;
		
		boolean acompanhado = true;
		if (idade >= 18 || acompanhado) {
			System.out.println("Você tem mais ou igual de 18 anos");
		} else {
			System.out.println("Infelizmente vc não pode entrar.");
		}
	}

}
