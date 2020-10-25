import java.util.List;
import java.util.Scanner;

public class CanteenPlay implements WeChatPay, AliPay, CardPay {

    protected Canteen[] canteens = new Canteen[]{new QianXiHeCanteen("千喜鹤食堂", 150,10000 ), new YanShenCanteen("延生食堂", 300,10000),
            new YinghaCanteen("樱花食堂", 200, 10000), new ZhongXingCanteen("中心食堂", 300,10000)};

    public void printCanteen(){
        for (int i = 0; i<canteens.length; i++) {
            System.out.println((i+1)+"、"+ canteens[i].getCanteenName()+"   "+"可容纳"+canteens[i].getCapacity()+"人");
        }
    }

    public Canteen selectedCanteen() {
        System.out.println("请输入食堂前的编号选择食堂");
        int canteenCode = new Scanner(System.in).nextInt();
        Canteen selectedCanteen = this.canteens[canteenCode-1];
        return selectedCanteen;
    }

    public void printWindow(Canteen canteen){
        Window[]windows = canteen.getWindows();
        for (int i = 0; i < windows.length; i++) {
            System.out.println(i+1+"、"+windows[i].getWindowName());
        }
    }

    public void printDish( Canteen canteen,Window window) {
       Dish[]dishes = window.getDishes();
        for (int i = 0; i < dishes.length; i++) {
            System.out.println(i+1+"、"+dishes[i].getDishName()+"  "+dishes[i].getDishPrice()+"元");
        }
    }

    public void printBill(List<Dish> dishes, float bill) {
        System.out.println("同学的账单如下：");
        for (int j = 0; j < dishes.size(); j++) {
            System.out.println(dishes.get(j).getDishName()+"   "+dishes.get(j).getDishPrice()+"元");
        }
        System.out.println("合计:"+bill+"元");
    }
    public float calculate(List<Dish> dishes) {
        float bill = 0;
        for (int i = 0;i < dishes.size(); i++) {
            float price = dishes.get(i).getDishPrice();
            bill = bill+price;
        }
        return bill;
    }


    @Override
    public void pay(WeChatPay weChatPay, float bill) {
        System.out.println("请出示微信支付二维码");
        System.out.println("微信支付"+bill+"元");


    }

    @Override
    public void pay(AliPay aliPay, float bill) {
        System.out.println("请出示支付宝二维码");
        System.out.println("支付宝支付"+bill+"元");
    }

    @Override
    public void pay(CardPay cardPay, float bill) {
        System.out.println("请出示校园卡");
        System.out.println("校园卡支付"+bill+"元");

    }
}



