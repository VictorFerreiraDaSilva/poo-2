package att03;

//Enunciado:
//Lógica Getter e Setter: Implemente uma classe que representa uma temperatura em Celsius. 
//Use variáveis privadas para armazenar a temperatura e forneça métodos para defini-la em Celsius e obtê-la em Fahrenheit.

public class ex04 {
	private Float temperaturaCelsius;
	
	public void setTemperaturaCelsius(Float temperatura) {
		this.temperaturaCelsius = temperatura;
	}
	
	public Float getTemperaturaFahrenheit() {
		return ((this.temperaturaCelsius*9)/5)+32;
	}
}
