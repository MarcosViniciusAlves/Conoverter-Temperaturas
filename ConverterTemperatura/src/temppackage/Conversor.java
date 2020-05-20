package temppackage;

public class Conversor {
    private double celsius;
    private double kelvin;
    private double fahrenheit;

    public void calculaTodos() {
        this.calculaCelsius();
        System.out.println();
        this.calculaKelvin();
        System.out.println();
        this.calculaFahrenheit();
    }

    public void calculaKelvin() {
        double calculaCelsius = this.kelvin - 273.15;
        double calculaFahrenheit = (this.kelvin - 273.15) * 9 / 5 + 32;

        System.out.println("Valor do Kelvin: " + this.kelvin);
        System.out.println("Kelvin para Fahrenheit: " + calculaFahrenheit);
        System.out.println("Kelvin para Celsius: " + calculaCelsius);
    }

    public void calculaCelsius() {
        double calculaKelvin = this.celsius + 273.15;
        double calculaFahrenheit = (this.celsius * 9 / 5) + 32;

        System.out.println("Valor de Celsius: " + this.celsius);
        System.out.println("Celsius para Kelvin: " + calculaKelvin);
        System.out.println("Celsius para Fahrenheit: " + calculaFahrenheit);
    }

    public void calculaFahrenheit() {
        double calculaKelvin = (this.celsius - 32) * 5 / 9 + 273.15;
        double calculaCelsius = (this.celsius - 32) * 5 / 9;

        System.out.println("Valor de Fahrenheit: " + this.fahrenheit);
        System.out.println("Fahrenheit para Kelvin: " + calculaKelvin);
        System.out.println("Fahrenheit para Celsius: " + calculaKelvin);
    }

    public double getCelsius() {
        return this.celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getKelvin() {
        return this.kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getFahrenheit() {
        return this.fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}
