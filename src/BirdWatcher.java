
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        if(this.birdsPerDay.length==0){return 0;}
        return this.birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length-1] = getToday()+1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int i = 0;
        int sum = 0;
        while (i < (numberOfDays > this.birdsPerDay.length ? this.birdsPerDay.length : numberOfDays) ) {
            sum += this.birdsPerDay[i];
            i++;
        }
        return sum;
    }

    public int getBusyDays() {
        int i = 0;
        int busyDays = 0;
        while (i<this.birdsPerDay.length){
            if(this.birdsPerDay[i]>=5){
                busyDays++;
            }
            i++;
        }
        return busyDays;
    }
}
