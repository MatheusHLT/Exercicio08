// Nome: Matheus Honorato Leite Teixeira
// Matricula: 1261929133

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double celsius;

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9.0/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("Fahrenheit: %s °F", fahrenheit);
        System.out.println();
        System.out.printf("Kelvin: %s K", kelvin);

        scanner.close();
    }
}
