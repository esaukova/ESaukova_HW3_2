public class BmiService {
    public double calculateBmi(double weight, double height) {

        double bmi = (weight / Math.pow(height, 2));
        double roundBmi = Math.round(bmi);
        return (int) roundBmi;

    }
}
