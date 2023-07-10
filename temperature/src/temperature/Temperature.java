package temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		ConversorTemperatura conversor = new ConversorTemperatura();
		
		System.out.println("Digite 1 se deseja converter de Fahrenheit ou 2 se deseja converter de Celcius: ");
		Scanner sc = new Scanner(System.in);
		int FC = sc.nextInt();
		
		if(FC == 1) {
			System.out.println("Digite a temperatura em Fahrenheit: ");
			Scanner sc2 = new Scanner(System.in);
			double fahrenheit = sc2.nextDouble();
			
			conversor.setTemperaturaFahrenheit(fahrenheit);
	        double celsius = conversor.converterFahrenheitParaCelsius();
	        System.out.println("A temperatura em Celcius é : " + celsius + "°C");
			sc2.close();
		} else {
			System.out.println("Digite a temperatura em Celcius: ");
			Scanner sc3 = new Scanner(System.in);
			double celcius = sc3.nextDouble();
			
			conversor.setTemperaturaCelsius(celcius);
	        double fahrenheit = conversor.converterCelsiusParaFahrenheit();
	        System.out.println("A temperatura em Fahrenheit é : " + fahrenheit + "°F");
	        sc3.close();
		}
        sc.close();
	}

}
