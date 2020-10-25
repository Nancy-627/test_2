public class YanShenCanteen extends Canteen {

    public YanShenCanteen(String canteenName, int capacity, float fund) {
        super(canteenName, capacity,fund);
        super.setWindows(setWindows(getWindows()));
    }

    @Override
    public Window[] setWindows(Window[] windows) {
        windows = new Window[]{new Window("河南饼",this), new Window("小咯咯脆皮鸡",this), new Window("山东煎饼",this),
                new Window("水煮坊",this), new Window("营养套餐（自选菜）",this), new Window("铁板炒饭",this),
                new Window("宜宾燃面",this)};
        return windows;
    }

    public void setDishes(String windowName, Window window) {
        Dish[]dishes = new Dish[]{};
        switch (windowName) {
            case "河南饼":
                dishes = new Dish[]{new Dish("韭菜鸡蛋饼", 2.5f), new Dish("白菜肉饼", 2.5f), new Dish("鸡蛋火腿玉米饼", 2),
                        new Dish("意大利披萨", 3), new Dish("秘制鸡蛋饼", 3.5f), new Dish("芹菜牛肉饼", 5), new Dish("鸡蛋三丝卷", 3.5f),
                        new Dish("椒盐大饼", 2), new Dish("土豆饼", 2.5f), new Dish("鸡蛋韭菜薄饼", 1.5f)};
                break;
            case "小咯咯脆皮鸡":
                dishes = new Dish[]{new Dish("女神沙拉脆皮鸡饭", 12), new Dish("印度咖喱脆皮鸡饭", 13), new Dish("蜜汁番茄脆皮鸡饭", 12),
                        new Dish("韩式脆皮鸡饭", 12), new Dish("孜然脆皮鸡饭", 12), new Dish("沙拉脆皮鸡饭", 12), new Dish("爆浆黑椒脆皮鸡饭", 13)};
                break;
            case "山东煎饼":
                dishes = new Dish[]{new Dish("原味煎饼", 5), new Dish("鱼排煎饼", 7), new Dish("蟹排煎饼", 7), new Dish("肉松煎饼", 6),
                        new Dish("培根煎饼", 7), new Dish("双蛋煎饼", 6), new Dish("里脊煎饼", 7)};
                break;
            case "水煮坊":
                dishes = new Dish[]{new Dish("素水煮", 11), new Dish("水煮血旺", 11), new Dish("水煮肉片", 14), new Dish("水煮鸡片", 13),
                        new Dish("水煮排骨(小份)", 15), new Dish("水煮排骨", 19), new Dish("水煮海三鲜", 16), new Dish("水煮鸭肠（小份）", 15),
                        new Dish("水煮鸭肠(大份)", 17), new Dish("水煮鱼（小份）", 13), new Dish("水煮鱼", 15), new Dish("水煮毛肚", 15)};
                break;
            case "营养套餐（自选菜）":
                dishes = new Dish[]{new Dish("一荤一素", 7), new Dish("一荤两素", 9), new Dish("两荤一素", 11),
                        new Dish("两荤两素", 13)};
                break;
            case "铁板炒饭":
                dishes = new Dish[]{new Dish("鸡蛋炒饭", 6), new Dish("火腿炒饭", 8), new Dish("培根炒饭", 9), new Dish("火腿蛋炒饭", 9),
                        new Dish("什锦咖喱炒饭", 8), new Dish("芽菜肉末炒饭", 8), new Dish("香菇银牙炒饭", 8), new Dish("什锦金针菇套饭", 10),
                        new Dish("咖喱鸡肉套饭", 12), new Dish("黑椒牛肉套饭", 13)};
                break;
            case "宜宾燃面":
                dishes = new Dish[]{new Dish("素面", 6), new Dish("刀削面", 8), new Dish("拉面", 8), new Dish("干拌面", 6),
                        new Dish("杂酱燃面", 8), new Dish("小炒肉刀削面", 8), new Dish("酸菜鱼拉面", 9), new Dish("剁椒炸酱干拌面", 8),
                        new Dish("酱香牛肉干拌面", 10)};
                break;

            default:
                break;
        }
        window.setDishes(dishes);
        }

    }

