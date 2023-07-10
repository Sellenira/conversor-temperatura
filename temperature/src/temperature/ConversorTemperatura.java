package temperature;

public class ConversorTemperatura {
    private double temperaturaFahrenheit;
    private double temperaturaCelsius;

    public void setTemperaturaFahrenheit(double temperatura) {
        this.temperaturaFahrenheit = temperatura;
    }

    public void setTemperaturaCelsius(double temperatura) {
        this.temperaturaCelsius = temperatura;
    }

    public double converterFahrenheitParaCelsius() {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }

    public double converterCelsiusParaFahrenheit() {
        return (temperaturaCelsius * 9 / 5) + 32;
    }
}