package byteBankTeste_Herdado_contas;

public class ContaCorrente extends ContaTeste {
	
	//construtor especifico:
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); //chamada do construtor da classe mãe, ou seja, classe ContaTeste.		
	}
	
	//rescrever o metódo:
	@Override
	public boolean saca(double valor) {	
		double valorASacar = valor + 0.2;		
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor; // += é a mesma coisa de "this.saldo = this.saldo + valor"
		
	}

}
