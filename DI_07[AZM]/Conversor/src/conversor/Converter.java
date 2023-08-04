
package conversor;

public class Converter {
    
    double km;
    double ms;

    public Converter(double km, double ms) {
        this.km = km;
        this.ms = ms;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getMs() {
        return ms;
    }

    public void setMs(double ms) {
        this.ms = ms;
    }
    
    
    public static double convertKmToMs(double kmh) {
        double ms = kmh * 0.27778;
        return ms;
    }

    public static double convertMsToKm(double ms) {
        double kmh = ms * 3.6;
        return kmh;
    }
    
}
