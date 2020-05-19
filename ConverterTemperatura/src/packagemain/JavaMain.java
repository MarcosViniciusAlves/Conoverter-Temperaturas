package packagemain;
import temppackage.*;
public class JavaMain {
    public static void main (String[] args){
        Conversor cv = new Conversor();

        cv.setCelsius(10);
        cv.setFahrenheit(10);
        cv.setKelvin(10);

        cv.calculaTodos();
    }
}
