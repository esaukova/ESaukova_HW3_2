import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес в килограммах: ");
        double weight = scanner.nextDouble();

        System.out.println("Введите рост в метрах: ");
        double height = scanner.nextDouble();


        double bmi = service.calculateBmi(weight, height); // при вводе веса 98 кг и росте 1.87 м ИМТ = 28

        System.out.println("Индекс массы тела: " + bmi);

    }

}
