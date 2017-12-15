package termin15Dezember17;

public class Temperaturumwandlung {

    public static void main(String[] args) {

        System.out.println("Fahrenheit\tCelsius");

        for(int i = 0; i <= 300; i++) {
            int fahrenheit = i;
            double celsius = (5.0/9) * (fahrenheit - 32);

            System.out.println(fahrenheit + "\t\t\t" + celsius);
        }

    }

}
