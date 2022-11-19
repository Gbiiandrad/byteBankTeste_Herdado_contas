package byteBankTeste_Herdado_contas;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.deposita(100.0);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.registra(contaCorrente);
		calculador.registra(seguroDeVida);
		
		System.out.println("Total de impostos: " + calculador.getTotalImposto());

	}

}
