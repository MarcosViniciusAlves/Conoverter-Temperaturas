package packagemain;
import temppackage.*;
public class JavaMain {
    public static void main (String[] args){
        Conversor cv = new Conversor();

        cv.setCelsius(12);
        cv.setFahrenheit(12);
        cv.setKelvin(23);

        cv.calculaTodos();
    }
}
