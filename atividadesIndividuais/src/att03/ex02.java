package att03;

//Enunciado:
//Modificadores de acesso: Crie uma classe com métodos e variáveis privadas, protegidas, padrão e públicas. 
//Instancie esta classe em outro pacote e tente acessar cada tipo de método e variável.

public class ex02 {
	public ex02() {
		
	}
	
	private String stringPrivada;
	protected String stringProtected;
	String stringPadrao;
	
	public String stringPublica() {
		return "Salllve";
	}
}
