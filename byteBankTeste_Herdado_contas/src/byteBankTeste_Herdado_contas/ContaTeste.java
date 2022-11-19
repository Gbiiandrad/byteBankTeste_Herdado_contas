// treinando o modelo de Encapsulamentos e Visibilidades.

package byteBankTeste_Herdado_contas;

import byteBankTeste_Herdado_contas.ContaTeste;


// Tornando essa classe privada
//quando criar o abstrato vc nao pode instanciar mais essa classe, mas irar existir a classe e o tipo, ou seja, essa classe é abstrata
public abstract class ContaTeste {
	
	protected double saldo; // Declando um atributo como "privado" você terá q chama-lo como metodo como "conta.pegaSaldo()"
	private int agencia;
	private int numero;
	private Cliente titular; // pego da class Cliente	
	private static int total;// tributo compartilhado da classe
		

	
	// Construtor especifico:
	public ContaTeste(int agencia, int numero) { // ser obrigado a passar a agencia e o numero
		
		ContaTeste.total++;
		//System.out.println("O total de contas é " + ContaTeste.total);
		
		this.agencia = agencia;
		this.numero = numero;
		
		//System.out.println("Estou criando uma conta " + this.numero);
	}
	
	
	public abstract void deposita(double valor); // lembrando q o void não devolve retorno
		
	
	
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			
			return true;			
		}
		
		else {
			return false;
		}
		
	}
		
	
	public boolean transfere(double valor, ContaTeste destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	// Para mostrar o que está em privado e irá proibir saldo negativo, ou seja, criando metodos
	
	//saldos
	public double getSaldo() {	
		return this.saldo;		
	}
	
	
	//numeros
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não podevalor negativo ou igual a 0 (Zero)");
			return;
		}
		
		this.numero = numero; // é o mesmo nome do int ali em cima.
	}
	
	
	//agencias
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor negativo e igual a 0 (Zero)");
			return; // parar
		}
		
		this.agencia = agencia;
	}
	
	
	//titular
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	
	//Total
	public static int getTotal() {
		return ContaTeste.total;
	}
	
	
}
