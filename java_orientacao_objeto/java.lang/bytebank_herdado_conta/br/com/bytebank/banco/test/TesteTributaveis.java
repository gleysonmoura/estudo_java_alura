package bytebank_herdado_conta.br.com.bytebank.banco.test;

import bytebank_herdado_conta.br.com.bytebank.banco.modelo.CalculadorDeImposto;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.SeguroDeVida;

//classe Teste
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
