public class Dish {

    private String dishName;

    private float dishPrice;

    public Dish(String dishName, float dishPrice) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;
    }

    public String getDishName() {
        return dishName;
    }

    public float getDishPrice() {
        return dishPrice;
    }

}
