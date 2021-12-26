import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaptopManager extends Laptop {
    Scanner scanner = new Scanner(System.in);
    List<Laptop> laptopList = new ArrayList<>();
    Laptop[] laptops;

    public void displayAll() {
        for (Laptop lt : laptopList) {
            System.out.println(lt);
        }
    }

    public void displayByTrademark(String trademark) {
        for (Laptop lt : laptopList) {
            if (lt.getTrademark().equals(trademark)) {
                System.out.println(String.format("Id: %s \n Trademark: %s \n Color: %s \n Price: %s \n Quantity: %s \n", lt.getId(), lt.getTrademark(), lt.getColor(), lt.getPrice(), lt.getQuantity()));
                break;
            }
        }
    }

    public void findByColor(String color) {
        for (Laptop lt : laptopList) {
            if (lt.getColor().equals(color)) ;
            System.out.println(String.format("Id: %s \n Trademark: %s \n Color: %s \n Price: %s \n Quantity: %s \n", lt.getId(), lt.getTrademark(), lt.getColor(), lt.getPrice(), lt.getQuantity()));
            break;
        }
    }

    public void displayByPriceRange() {
        System.out.println("Nhập khoảng giá từ: ");
        int minValue = scanner.nextInt();
        System.out.print("đến: ");
        int maxValue = scanner.nextInt();
        for (Laptop lt : laptopList) {
            if (lt.getPrice() >= minValue && lt.getPrice() <= maxValue) {
                System.out.println(String.format("Id: %s \n Trademark: %s \n Color: %s \n Price: %s \n Quantity: %s \n", lt.getId(), lt.getTrademark(), lt.getColor(), lt.getPrice(), lt.getQuantity()));
                break;
            }
        }
    }

    public Laptop addProduct() {
        System.out.println("Nhập mã sản phẩm: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String trademark = scanner.nextLine();
        System.out.println("Nhập màu của laptop: ");
        String color = scanner.nextLine();
        System.out.println("Nhập giá bán của laptop: ");
        float price = scanner.nextFloat();
        System.out.println("Nhập số lượng sản phẩm: ");
        int quantity = scanner.nextInt();
        Laptop laptop = new Laptop(id, trademark, color, price, quantity);
        System.out.println(laptop);
        laptopList.add(laptop);
        return laptop;
    }

    public Laptop editLaptopById(int id) {
        Laptop laptop = null;
        for (Laptop lt : laptopList) {
            if (lt.getId() == id) {
                laptop = lt;
            }
            if (laptop != null) {
                int index = laptopList.indexOf(laptop);
                System.out.println("Nhập tên hãng mới: ");
                String newTrademark = scanner.next();
                laptop.setTrademark(newTrademark);

                System.out.println("Nhập màu sắc mới: ");
                String newColor = scanner.next();
                laptop.setColor(newColor);

                System.out.println("Nhập giá mới cho sản phẩm với id: ");
                float newPrice = scanner.nextFloat();
                scanner.nextLine();
                laptop.setPrice(newPrice);

                System.out.println("Nhập số lượng mới cho sản phẩm với id: ");
                int newQuantity = scanner.nextInt();
                scanner.nextLine();
                laptop.setQuantity(newQuantity);

                laptopList.set(index, laptop);
            }
            System.out.println(String.format("Id: %s \n Trademark: %s \n Color: %s \n Price: %s \n Quantity: %s \n", lt.getId(), lt.getTrademark(), lt.getColor(), lt.getPrice(), lt.getQuantity()));
        }
        return laptop;
    }

    public Laptop deleteLaptopById(int id) {
        Laptop laptop = null;
        for (Laptop lt : laptopList) {
            if (lt.getId() == id) {
                laptop = lt;
            }
        }
        laptopList.remove(laptop);
        System.out.println(toString());
        return laptop;
    }

}
