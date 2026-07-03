import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        double result;

        switch (choice) {
            case 1:
                result = (temp * 9 / 5) + 32;
                System.out.println(temp + "°C is " + result + "°F");
                break;
            case 2:
                result = (temp - 32) * 5 / 9;
                System.out.println(temp + "°F is " + result + "°C");
                break;
            case 3:
                result = temp + 273.15;
                System.out.println(temp + "°C is " + result + "K");
                break;
            case 4:
                result = temp - 273.15;
                System.out.println(temp + "K is " + result + "°C");
                break;
            default:
                System.out.println("That's not a valid option");
        }

        scanner.close();
    }
}