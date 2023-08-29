package atividade01;

public class ex04 {	
	public static void main(String[] args) throws MyCustomException {
		try {
		    int i = Integer.parseInt("opa");
		} catch (Exception err) {		    
		        throw new MyCustomException("Deu erro meu patrao", err);
		}
    }
}
