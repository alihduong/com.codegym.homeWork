import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopManager laptopManager = new LaptopManager();
        Scanner scanner = new Scanner(System.in);
        int chioce;
        do{
            System.out.println("-----Menu Bar-----");
            System.out.println("1. Add a laptop.");
            System.out.println("2. Display all laptop's.");
            System.out.println("3. Edit laptop by id.");
            System.out.println("4. Delete laptop by id.");
            System.out.println("5. Find laptop by trademark.");
            System.out.println("6. Find laptop by color.");
            System.out.println("7. Find laptop by Price Range.");
            System.out.println("0. Exit.");
            System.out.println("Enter Your choice: ");
            chioce = scanner.nextInt();
            try {
                switch (chioce){
                    case 1:
                        laptopManager.addProduct();
                        break;
                    case 2:
                        laptopManager.displayAll();
                        break;
                    case 3:
                        System.out.print("Enter laptop's id you want to edit: ");
                        int editId = scanner.nextInt();
                        laptopManager.editLaptopById(editId);
                        break;
                    case 4:
                        System.out.print("Enter laptop's id you want to delete: ");
                        int deleteId = scanner.nextInt();
                        laptopManager.deleteLaptopById(deleteId);
                        break;
                    case 5:
                        System.out.print("Enter Trademark you want to find: ");
                        String findTrademark = scanner.nextLine();
                        laptopManager.displayByTrademark(findTrademark);
                        break;
                    case 6:
                        System.out.print("Enter laptop's color you want to find: ");
                        String findColor = scanner.next();
                        laptopManager.findByColor(findColor);
                        break;
                    case 7:
                        System.out.println("Enter laptop's Price range you want to find: ");
                        laptopManager.displayByPriceRange();
                        break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (chioce != 0);
    }
}
