abstract class Canteen {

    private String canteenName;

    private int capacity;

    private Window[]windows;

    private float fund ;

    public float getEarn() {
        return earn;
    }

    public void setEarn(float earn) {
        this.earn = earn;
    }

    private float earn;

    public String getCanteenName() {
        return canteenName;
    }


    public int getCapacity() {
        return capacity;
    }

    public float getFund() {
        return fund;
    }

    public void setFund(float fund) {
        this.fund = fund;
    }

    public Window[] setWindows(Window[] windows) {
        this.windows = windows;
        return windows;
    }

    public abstract void setDishes(String windowName, Window window);

    public Window[] getWindows() {
        return windows;
    }

    public Canteen(String canteenName, int capacity, float fund) {
        this.canteenName = canteenName;
        this.capacity = capacity;
        this.fund = fund;
    }
}
