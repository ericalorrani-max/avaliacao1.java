import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = sc.nextDouble();

        // Converte para Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        // Converte para Kelvin
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.println("Temperatura em Fahrenheit (°F): " + fahrenheit);
        System.out.println("Temperatura em Kelvin (K): " + kelvin);

        sc.close();
    }
}

