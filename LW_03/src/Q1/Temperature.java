package Q1;

public class Temperature {
    private double celsius;

    // No-arg constructor
    public Temperature() {
        this.celsius = 0.0;
    }

    // Parameterized constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter for Fahrenheit
    public double toFahrenheit() {
        return this.celsius * 9 / 5 + 32;
    }

    // Getter for Celsius
    public double toCelsius() {
        return this.celsius;
    }

    // Setter for Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Setter for Fahrenheit
    public void setFahrenheit(double Fahrenheit) {
        this.celsius = (Fahrenheit - 32) * 5 / 9;;
    }



}
