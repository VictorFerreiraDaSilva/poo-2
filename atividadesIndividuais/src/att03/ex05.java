package att03;

//Classe Imutável: Projete uma classe imutável representando um ponto 2D (x, y). 
//Uma vez criado o ponto, ele não deverá ser modificável. No entanto, suas coordenadas devem ser acessíveis por métodos getters públicos.

public class ex05 {
	Integer[] ponto = new Integer[2];
	
	public ex05(Integer x, Integer y) {
		this.ponto[0] = x;
		this.ponto[1] = y;
	}
	
	public Integer[] getPonto() {
		return ponto;
	}
	
}
