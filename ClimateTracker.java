import java.util.Scanner;

public class ClimateTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your temperature in celsius;");
        double temperature = input.nextDouble();

        if (temperature < 20) {
            System.out.println("The weather is cold.");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("The weather is normal.");
        } else {
            System.out.println("The weather is hot.");
        }
        input.close();
    }
}