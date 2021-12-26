import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Apple> apples = new ArrayList<>();
    public static List<Bannana> bannanas = new ArrayList<>();
    public static List<Lemon> lemons = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Chon tinh nang:");
            System.out.println("1. Thêm quả.");
            System.out.println("2. Hiển  thị tất cả.");
            System.out.println("3. Hiển thị quả táo.");
            System.out.println("4. Hiển thị quả chanh");
            System.out.println("5. Hiển thị quả chuối");
            System.out.println("6. Hiển thị quả có giá cao nhất");
            System.out.println("7. Hiểm thị quả có thể mua được nhiều nhất theo số tiền.");
            System.out.println("8. Xóa quả theo tên");
            System.out.println("9. Xuất csv");
            Scanner scanner = new Scanner(System.in);

            try {
                int choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        Manage.addFruit();
                        break;
                    case 2:
                        Manage.showAll();
                        break;
                    case 3:
                        Manage.showApple();
                        break;
                    case 4:
                        Manage.showLemon();
                        break;
                    case 5:
                        Manage.showBanana();
                        break;
                    case 6:
                        Manage.showMaxPrice();
                        break;
                    case 7:
                        Manage.countMaxByMonney();
                        break;
                    case 8:
                        Manage.removeFruit();
                        break;
                    case 9:
                        Manage.exportCsv();
                        break;
                    default:
                        System.out.println("Input wrong");

                }
            } catch (Exception e) {
                System.out.println("kí tự không hợp lệ !!!!");
            }
        }
    }

}
