import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес в килограммах: ");
        double weight = scanner.nextDouble();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите рост в метрах: ");
        double height = sc.nextDouble();


        double bmi = service.calculateBmi(weight, height);

        System.out.println("Индекс массы тела: " + bmi);

    }

}
