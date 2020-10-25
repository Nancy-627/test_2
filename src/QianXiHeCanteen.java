public class QianXiHeCanteen extends Canteen{


    public QianXiHeCanteen(String canteenName, int capacity, float fund) {
        super(canteenName, capacity, fund);
        super.setWindows(setWindows(getWindows()));
    }

    @Override
    public Window[] setWindows(Window[] windows) {
        windows = new Window[]{ new Window("德玛西亚",this), new Window("河南大饼",this), new Window("饺子家",this),
                new Window("瓦香鸡",this),new Window("嘿米牛肉饭",this), new Window("新奥尔良烤翅",this),
                new Window("八面溢香",this), new Window("麦香蒸包",this)};
        return windows;
    }

    @Override
    public void setDishes(String windowName, Window window) {
        Dish[]dishes = new Dish[]{};
        switch (windowName){
            case "德玛西亚":dishes = new Dish[]{new Dish("烧鸭饭",12), new Dish("鸡排饭",10), new Dish("牛排饭", 10),
            new Dish("鸡腿饭",10), new Dish("香肠饭",12), new Dish("叉烧肉饭", 12)};
            break;
            case "河南大饼":dishes = new Dish[]{new Dish("韭菜鸡蛋饼", 2.5f), new Dish("白菜肉饼", 2.5f), new Dish("鸡蛋火腿玉米饼", 2),
                    new Dish("意大利披萨", 3), new Dish("秘制鸡蛋饼", 3.5f), new Dish("芹菜牛肉饼", 5), new Dish("鸡蛋三丝卷", 3.5f),
                    new Dish("椒盐大饼", 2), new Dish("土豆饼", 2.5f), new Dish("鸡蛋韭菜薄饼", 1.5f)};
                break;
            case "饺子家": dishes = new Dish[]{new Dish("素饺子",7), new Dish("猪肉饺子",9.5f), new Dish("抄手",10)};
            break;
            case "瓦香鸡":dishes = new Dish[]{new Dish("女神沙拉脆皮鸡饭", 12), new Dish("印度咖喱脆皮鸡饭", 13), new Dish("蜜汁番茄脆皮鸡饭", 12),
                    new Dish("韩式脆皮鸡饭", 12), new Dish("孜然脆皮鸡饭", 12), new Dish("沙拉脆皮鸡饭", 12), new Dish("爆浆黑椒脆皮鸡饭", 13)};
                break;
            case "嘿米牛肉饭":dishes = new Dish[]{new Dish("鸡蛋炒饭", 6), new Dish("火腿炒饭", 8), new Dish("培根炒饭", 9), new Dish("火腿蛋炒饭", 9),
                    new Dish("什锦咖喱炒饭", 8), new Dish("芽菜肉末炒饭", 8), new Dish("香菇银牙炒饭", 8), new Dish("什锦金针菇套饭", 10),
                    new Dish("咖喱鸡肉套饭", 12), new Dish("黑椒牛肉套饭", 13)};
                break;
            case "八面溢香":dishes = new Dish[]{new Dish("素面", 6), new Dish("刀削面", 8), new Dish("拉面", 8), new Dish("干拌面", 6),
                    new Dish("杂酱燃面", 8), new Dish("小炒肉刀削面", 8), new Dish("酸菜鱼拉面", 9), new Dish("剁椒炸酱干拌面", 8),
                    new Dish("酱香牛肉干拌面", 10)};
                break;
            case "麦香蒸包":dishes = new Dish[]{new Dish("红糖方糕", 2.5f), new Dish("桂花糕", 2.5f), new Dish("马拉糕",2.5f),
                    new Dish("糯米鸡",4),new Dish("手抓饼",2.5f),new Dish("牛肉饼",4)};
                break;
            default:break;
        }
        window.setDishes(dishes);

    }
}
