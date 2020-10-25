public class Window {

    private String windowName;

    private Dish[] dishes;
    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }

    public Window(String windowName,Canteen canteen) {
        this.windowName = windowName;
        canteen.setDishes(windowName,this);

    }

    public String getWindowName() {
        return windowName;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    }

