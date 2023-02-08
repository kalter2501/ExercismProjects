class NeedForSpeed {
    private int speed;
    private int batteryDrain;

    private int batteryCharge = 100;
    private int distanceDriven;

    public NeedForSpeed(int speed, int batteryDrain) {
        setSpeed(speed);
        setBatteryDrain(batteryDrain);
    }

    public boolean batteryDrained() {
        int batteryCharge = getBatteryCharge();
        return batteryCharge==0 && batteryCharge<getBatteryDrain();
    }

    public int distanceDriven() {
        return getDistanceDriven();
    }

    public void drive() {
        if(batteryDrained()){return;}
        this.setDistanceDriven(this.getDistanceDriven() + this.getSpeed());
        this.setBatteryCharge(this.getBatteryCharge()-this.getBatteryDrain());
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public void setBatteryDrain(int batteryDrain) {
        this.batteryDrain = batteryDrain;
    }

    public int getDistanceDriven() {
        return distanceDriven;
    }

    public void setDistanceDriven(int distanceDriven) {
        this.distanceDriven = distanceDriven;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }
}

class RaceTrack {

    private int distance;

    RaceTrack(int distance) {
        setDistance(distance);
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        int distanceLeft = this.getDistance() - car.distanceDriven();
        return (double)distanceLeft/car.getSpeed()*car.getBatteryDrain()<=(double) car.getBatteryCharge();
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
