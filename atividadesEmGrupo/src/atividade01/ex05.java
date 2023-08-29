package atividade01;

public class ex05 {
	public static void testa(String num) {
		try {
			int i = Integer.parseInt(num);
		} catch(Exception e) {
			throw e;
		} finally {
			System.out.println("ve se deu erro");
		}
	}
	public static void main(String args[]) {
		//não detectando exceção:
		testa("13");
		//detectando exceção:
		testa("treze");
	}
}
