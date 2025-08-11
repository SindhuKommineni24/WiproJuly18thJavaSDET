/*Create a Temperature class
Private field: celsius
Provide:
Method to set temperature
Method to convert to Fahrenheit
Method to convert to Kelvin
Apply encapsulation and validation for physical temperature limits.*/

package labsession4;

public class Temperature {
    private double celsius;

    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Invalid temperature");
            this.celsius = -273.15;
        }
    }

    public double getCelsius() {
        return celsius;
    }

   
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

   
    public double toKelvin() {
        return celsius + 273.15;
    }

  
    public void display() {
        System.out.println(celsius + "°C");
        System.out.println(toFahrenheit() + "°F");
        System.out.println(toKelvin() + " K");
        System.out.println();
    }

    
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        t1.setCelsius(26);
        t1.display();

        Temperature t2 = new Temperature();
        t2.setCelsius(-300);  
        t2.display();
    }
}
