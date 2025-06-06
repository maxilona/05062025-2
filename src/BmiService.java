public class BmiService {
    public int calculate(int bmi, double v) {

        double h;
        h = 1.87;
        int m;
        m = 98;
        bmi = (int) (m / (h * h));
        return bmi;
    }

}
