package byteBankTeste_Herdado_contas;

public class ContaPoupanca extends ContaTeste {
	
	//construtor especifico:
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero); //chamada do construtor da classe mãe, ou seja, classe ContaTeste.		
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor; // += é a mesma coisa de "this.saldo = this.saldo + valor"
		
	}


}
