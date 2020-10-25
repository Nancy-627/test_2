import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("现在是用餐时间啦！");
        CanteenPlay canteenPlay = new CanteenPlay();
        canteenPlay.printCanteen();
        Canteen selectedCanteen = canteenPlay.selectedCanteen(); //选择食堂
        System.out.println("欢迎光临"+selectedCanteen.getCanteenName()+"!");
        System.out.println(selectedCanteen.getCanteenName()+"有以下取餐窗口");
        canteenPlay.printWindow(selectedCanteen);
        Student student = new Student(selectedCanteen,canteenPlay);
        Thread t1 = new Thread(student);
        Thread t2 = new Thread(student);
        Thread t3 = new Thread(student);
        t1.start();
        t2.start();
        t3.start();


    }
}
