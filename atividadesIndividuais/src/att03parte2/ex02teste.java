package att03parte2;

import att03.ex02;

//Enunciado:
//Modificadores de acesso: Crie uma classe com métodos e variáveis privadas, protegidas, padrão e públicas. 
//Instancie esta classe em outro pacote e tente acessar cada tipo de método e variável.

public class ex02teste {
	public static void main(String args[]) {
		ex02 ex = new ex02();
		//String privada = ex.stringPrivada; vai dar erro
		//String protegida = ex.stringProtegida; // vai dar erro tbm
		//String padrao = ex.stringPadrao; vai dar erro dnv
		String publica = ex.stringPublica(); //unica que da certo pq é publica
	}
}
