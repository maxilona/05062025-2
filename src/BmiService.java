public class BmiService {
    public int calculate(int bmi, double v) {

        double h = 1.87;
        int m = 98;
        int BmiService;
        BmiService = (int) (m / (h * h));
        return BmiService;
    }

       }
