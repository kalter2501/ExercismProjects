
public class CarsAssemble {
    private final int minProducedCars = 221;

    public double productionRatePerHour(int speed) {
        return (double) minProducedCars * speed * getSuccessRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
       return (int)((double)minProducedCars/60 * speed * getSuccessRate(speed));
    }

    static double getSuccessRate(int speed) {
        int successRate = 0;
        if (speed >= 1 && speed <= 4) {
            successRate = 100;
        } else if (speed >= 5 && speed <= 8) {
            successRate = 90;
        } else if (speed == 9) {
            successRate = 80;
        } else if (speed == 10) {
            successRate = 77;
        }

        return (double) successRate/100;
    }
}

class CarsAssembleTest {
    public static void main(String[] args) {
        CarsAssemble ca = new CarsAssemble();
        System.out.println(ca.workingItemsPerMinute(6));
    }
}