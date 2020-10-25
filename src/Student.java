import java.util.*;

public class Student extends CanteenPlay implements Runnable{

    public Student(Canteen selectedCanteen, CanteenPlay canteenPlay) {
        this.selectedCanteen = selectedCanteen;
        this.canteenPlay = canteenPlay;
    }

    public Canteen getSelectedCanteen() {
        return selectedCanteen;
    }

    public void setSelectedCanteen(Canteen selectedCanteen) {
        this.selectedCanteen = selectedCanteen;
    }

    public int getCanteenCode() {
        return canteenCode;
    }

    public void setCanteenCode(int canteenCode) {
        this.canteenCode = canteenCode;
    }

    private Canteen selectedCanteen;

    private float firstFund = 10000;

    public CanteenPlay getCanteenPlay() {
        return canteenPlay;
    }

    public void setCanteenPlay(CanteenPlay canteenPlay) {
        this.canteenPlay = canteenPlay;
    }

    private CanteenPlay canteenPlay;

    private int canteenCode;

    public List<Dish> selected(Canteen canteen){
        Window selectedWindow = this.selectedWindow(canteen);
        List<Dish>dishes = this.selectedDish(selectedWindow);
        return dishes;
    }

    public Window selectedWindow(Canteen canteen) {
        Window[]windows = canteen.getWindows();
        int windowCode = (int)(1+Math.random()*(windows.length));
        Window selectedWindow = windows[windowCode-1];
        return selectedWindow;
    }

    public List<Dish> selectedDish(Window window) {
        List<Dish>selectedDishes = new ArrayList<Dish>();
        Dish[]dishes = window.getDishes();
        for (int i = 1; i < dishes.length; i++) {
            int dishCode = (int)(1+Math.random()*(dishes.length-1+1));
            selectedDishes.add(dishes[dishCode-1]);
            int selectedCode = (int)((int)0+Math.random()*1);
            if (selectedCode ==0 || selectedDishes.size() >=5) {
                break;
            }
        }
        return selectedDishes;
    }

    public void selectedPayment (CanteenPlay canteenPlay, float bill) {
        System.out.println("请选择支付方式：1、微信支付，2、支付宝支付，3、饭卡支付");
        int payCode = (int)(1+Math.random()*3);
        switch (payCode) {
            case 1:
                WeChatPay weChatPay = canteenPlay;
                canteenPlay.pay(weChatPay,bill);
                break;
            case 2 :
                AliPay aliPay = canteenPlay;
                canteenPlay.pay(aliPay, bill);
                break;
            case 3 :
                CardPay cardPay = canteenPlay;
                canteenPlay.pay(cardPay,bill);
                break;
            default:
                break;
        }

    }

    public float setEarn(Canteen canteen, float bill) {
        canteen = this.getSelectedCanteen();
        float earn = (float) (bill*0.4)+canteen.getEarn();
        return earn;
    }
    public float setFund(Canteen canteen,float earn) {
        canteen = this.getSelectedCanteen();
        float fund = earn + canteen.getFund();
        return fund;
    }


    @Override
    public void run() {
        boolean flag = false;
        for (int i = 0; i < 50; i++) {
            List<Dish> selectedDish = this.selected(this.getSelectedCanteen());
            float bill = this.canteenPlay.calculate(selectedDish);
            canteenPlay.printBill(selectedDish, bill);
            this.selectedPayment(canteenPlay, bill);
            synchronized (this.getSelectedCanteen()){
                if (bill > 0) {

                    this.getSelectedCanteen().setEarn(this.setEarn(this.getSelectedCanteen(),bill));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        float earn = this.selectedCanteen.getEarn();
        this.getSelectedCanteen().setFund(this.setFund(this.getSelectedCanteen(),earn));
        System.out.println(this.selectedCanteen.getCanteenName()+"目前资金为"+this.selectedCanteen.getFund()+"元");

    }
}


