package org.aplas.basicappx;

public class Weight {
    private double gram;

    public Weight() {
        this.gram = 0;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public void setOunce(double ounce) {
        this.gram = ounce * 28.3495231;
    }

    public void setPound(double pound) {
        this.gram = pound * 453.59237;
    }

    public double getGram() {
        return gram;
    }

    public double getOunce() {
        return getGram() / 28.3495231;
    }

    public double getPound() {
        return getGram() / 453.59237;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        switch (oriUnit) {
            case "Grm":
                setGram(value);
                break;
            case "Onc":
                setOunce(value);
                break;
            case "Pnd":
                setPound(value);
                break;
        }
        switch (convUnit) {
            case "Grm":
                return getGram();
            case "Onc":
                return getOunce();
            case "Pnd":
                return getPound();
        }
        return -1;
    }
}
