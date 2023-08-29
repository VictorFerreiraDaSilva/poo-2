package atividade01;

public class MyCustomException extends Exception {

	public MyCustomException(String menssagenzinha, Throwable erro) {		
        super(menssagenzinha, erro);
    }
}
