public class BmiService {
    public int calculateBmi(double weight, double height) {

        double bmi = (weight / Math.pow(height, 2));
        return (int) bmi;

    }
}
