public class ElonsToyCar {
    private int distance, battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.distance);
    }

    public String batteryDisplay() {
        if(batteryEmpty()){
            return "Battery empty";
        }
        return String.format("Battery at %d%%", this.battery);
    }

    public void drive() {
        if(batteryEmpty()){
            return;
        }
        this.distance += 20;
        this.battery -= 1;
    }

    private boolean batteryEmpty(){
        return this.battery == 0;
    }
}
