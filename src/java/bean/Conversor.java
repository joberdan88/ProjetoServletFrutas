package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class Conversor {
    double celsius;
    double fahrenheit;
    boolean naocalculado = true;
    
    public Conversor() {
        
    }

    public void converterCpF() {
        fahrenheit = (celsius * 9/5) + 32;
        naocalculado = false;
    }
    
    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double farenheit) {
        this.fahrenheit = fahrenheit;
    }

    public boolean isNaocalculado() {
        return naocalculado;
    }

    public void setNaocalculado(boolean naocalculado) {
        this.naocalculado = naocalculado;
    }   
}
