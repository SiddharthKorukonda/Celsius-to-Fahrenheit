package Labs.Lab2;
import java.util.*;
public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of celsius: ");
        int celsius = s.nextInt();

        double fahrenheit = (((9.0*celsius))/5)+32;

        System.out.print("The fahrenheit equivalent is "+fahrenheit);
    }
}
