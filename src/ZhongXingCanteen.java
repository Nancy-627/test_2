public class ZhongXingCanteen extends Canteen{


    public ZhongXingCanteen(String canteenName, int capacity,float fund) {
        super(canteenName, capacity,fund);
        super.setWindows(setWindows(getWindows()));
    }


    public Window[] setWindows(Window[] windows) {
        windows = new Window[]{new Window("重庆小面",this), new Window("面食",this),
                new Window("家常套饭",this), new Window("精品套饭",this),new Window("炸鸡",this)};
        return windows;
    }

    @Override
    public void setDishes(String windowName, Window window) {
        Dish[]dishes = new Dish[]{};
        switch (windowName){
            case "重庆小面":dishes = new Dish[]{new Dish("素面", 6), new Dish("刀削面", 8), new Dish("拉面", 8), new Dish("干拌面", 6),
                    new Dish("杂酱燃面", 8), new Dish("小炒肉刀削面", 8), new Dish("酸菜鱼拉面", 9), new Dish("剁椒炸酱干拌面", 8),
                    new Dish("酱香牛肉干拌面", 10)};
                break;
            case "面食" :dishes = new Dish[]{new Dish("红糖方糕", 2.5f), new Dish("桂花糕", 2.5f), new Dish("马拉糕",2.5f),
                    new Dish("糯米鸡",4),new Dish("手抓饼",2.5f),new Dish("牛肉饼",4)};
                break;
            case "家常套饭":dishes = new Dish[]{new Dish("一荤一素", 7), new Dish("一荤两素", 9), new Dish("两荤一素", 11),
                    new Dish("两荤两素", 13)};
                break;
            case "精品套饭":dishes = new Dish[]{new Dish("一荤一素", 8), new Dish("一荤两素", 10), new Dish("两荤一素", 11),
                    new Dish("两荤两素", 13)};
                break;
            case "炸鸡":dishes = new Dish[]{new Dish("爱心土豆饼",3), new Dish("上校鸡块",5), new Dish("香辣鸡腿堡",7),new Dish("香辣鸡腿堡",7),
                    new Dish("香辣鸡米花",7), new Dish("大鸡排",10)};
            break;
            default:break;
        }
        window.setDishes(dishes);

    }
}
