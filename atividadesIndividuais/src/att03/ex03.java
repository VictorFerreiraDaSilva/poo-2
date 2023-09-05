package att03;

//Enunciado:
//Encapsulamento do Construtor: Projete uma classe para uma conta bancária com variáveis privadas para saldo e número da conta. 
//Crie um construtor que inicialize o saldo. Fornece métodos para depositar, sacar e verificar saldo.

public class ex03 {
	private Float saldo;
	private String numConta;
	
	public ex03(Float saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(Float valor) {
		saldo += valor;
	}
	
	public void sacar(Float valor) {
		saldo -= valor;
	}
	
	public Float verificarSaldo() {
		return this.saldo;
	}
	
}
