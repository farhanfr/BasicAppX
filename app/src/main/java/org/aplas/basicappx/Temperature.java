package org.aplas.basicappx;

public class Temperature {

    private double celcius;

    public Temperature() {
        this.celcius = 0;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celcius = ((fahrenheit - 32) * 5) / 9;
    }

    public void setKelvins(double kelvin) {
        this.celcius = kelvin - 273.15;
    }

    public double getCelcius() {
        return celcius;
    }

    public double getFahrenheit() {
        return getCelcius() * 9 / 5 + 32;
    }

    public double getKelvins() {
        return getCelcius() + 273.15;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        switch (oriUnit) {
            case "°C":
                setCelcius(value);
                break;
            case "°F":
                setFahrenheit(value);
                break;
            case "K":
                setKelvins(value);
                break;
        }
        switch (convUnit) {
            case "°C":
                return getCelcius();
            case "°F":
                return getFahrenheit();
            case "K":
                return getKelvins();
        }
        return -1;
    }
}