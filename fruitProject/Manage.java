import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Manage {
    public static void addFruit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap loai qua muon them!");
        System.out.println("1. Tao");
        System.out.println("2. Chuoi");
        System.out.println("3. Chanh");

        try {
            int type = Integer.parseInt(scanner.nextLine());
            switch (type) {
                case 1:
                    Apple apple = new Apple();
//                    try {
//                        System.out.println("Nhap ten qua!");
//                        String ten = scanner.nextLine();
//                        apple.setName(ten);
//                    } catch (Exception e) {
//                        System.out.println("Ten khong hop le");
//                        break;
//                    }

                    try {
                        System.out.println("Nhap can nang!");
                        Long canNang = Long.valueOf(scanner.nextLine());
                        apple.setCanNang(canNang);
                    } catch (Exception e) {
                        System.out.println("can nang khong hop le");
                        break;
                    }

                    try {
                        System.out.println("Nhap gia!");
                        Long gia = Long.valueOf(scanner.nextLine());
                        apple.setGia(gia);
                    } catch (Exception e) {
                        System.out.println("Gia khong hop le");
                        break;
                    }

                    try {
                        System.out.println("Nhap mau sac");
                        String mauSac = scanner.nextLine();
                        apple.setMauSac(mauSac);
                    } catch (Exception e) {
                        System.out.println("Mau sac khong hop le");
                        break;
                    }

                    try {
                        System.out.println("Nhap vi");
                        String vi = scanner.nextLine();
                        apple.setVi(vi);
                    } catch (Exception e) {
                        System.out.println("Vi khong hop le");
                        break;
                    }
                    Main.apples = new ArrayList<>();
                    Main.apples.add(apple);
                    System.out.println("Them thanh cong");
                    break;
                case 2:
                    Bannana bannana = new Bannana();
//                    try {
//                        System.out.println("Nhap ten qua!");
//                        String ten = scanner.nextLine();
//                        bannana.setName(ten);
//                    } catch (Exception e) {
//                        System.out.println("Ten khong hop le");
//                        break;
//                    }

                    try {
                        System.out.println("Nhap can nang!");
                        Long canNang = Long.valueOf(scanner.nextLine());
                        bannana.setCanNang(canNang);
                    } catch (Exception e) {
                        System.out.println("can nang khong hop le");
                        break;
                    }

                    try {
                        System.out.println("Nhap gia!");
                        Long gia = Long.valueOf(scanner.nextLine());
                        bannana.setGia(gia);
                    } catch (Exception e) {
                        System.out.println("Gia khong hop le");
                        break;
                    }

                    try {
                        System.out.println("Nhap mau sac");
                        String mauSac = scanner.nextLine();
                        bannana.setMauSac(mauSac);
                    } catch (Exception e) {
                        System.out.println("Mau sac khong hop le");
                        break;
                    }
                    try {
                        System.out.println("Nhap vi");
                        String vi = scanner.nextLine();
                        bannana.setVi(vi);
                    } catch (Exception e) {
                        System.out.println("Vi khong hop le");
                        break;
                    }
                    Main.bannanas = new ArrayList<>();
                    Main.bannanas.add(bannana);
                    System.out.println("Them thanh cong");
                    break;
                case 3:
                    Lemon lemon = new Lemon();
//                    try {
//                        System.out.println("Nhap ten qua!");
//                        String ten = scanner.nextLine();
//                        lemon.setName(ten);
//                    } catch (Exception e) {
//                        System.out.println("Ten khong hop le");
//                        break;
//                    }
                    try {
                        System.out.println("Nhap can nang!");
                        Long canNang = Long.valueOf(scanner.nextLine());
                        lemon.setCanNang(canNang);
                    } catch (Exception e) {
                        System.out.println("can nang khong hop le");
                        break;
                    }

                    try {
                        System.out.println("Nhap gia!");
                        Long gia = Long.valueOf(scanner.nextLine());
                        lemon.setGia(gia);
                    } catch (Exception e) {
                        System.out.println("Gia khong hop le");
                        break;
                    }

                    try {
                        System.out.println("Nhap mau sac");
                        String mauSac = scanner.nextLine();
                        lemon.setMauSac(mauSac);
                    } catch (Exception e) {
                        System.out.println("Mau sac khong hop le");
                        break;
                    }
                    try {
                        System.out.println("Nhap vi");
                        String vi = scanner.nextLine();
                        lemon.setVi(vi);
                    } catch (Exception e) {
                        System.out.println("Vi khong hop le");
                        break;
                    }
                    Main.lemons = new ArrayList<>();
                    Main.lemons.add(lemon);
                    System.out.println("Them thanh cong");
                    break;
                default:
                    System.out.println("Loai qua khong hop le!");
                    break;
            }

        } catch (Exception e) {
            System.out.println("Loai qua khong hop le");
        }
    }

    public static void removeFruit() {
        System.out.println("Xoa qua theo ten!");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhap ten qua!");
            String ten = scanner.nextLine();

            if (ten.trim().equalsIgnoreCase("tao")) {
                Main.apples = new ArrayList<>();
                return;
            }
            if (ten.trim().equalsIgnoreCase("chuoi")) {
                Main.bannanas = new ArrayList<>();
                return;
            }
            if (ten.trim().equalsIgnoreCase("chanh")) {
                Main.lemons = new ArrayList<>();
                return;
            }
        } catch (Exception e) {
            System.out.println("Ten khong hop le");
            return;
        }

    }

    public static void showAll() {
        Main.apples.forEach(apple -> apple.show());
        Main.bannanas.forEach(bannana -> bannana.show());
        Main.lemons.forEach(lemon -> lemon.show());
//              for (Apple apple : Main.apples) {
//            apple.show();
//        }
//        for (Bannana bannana : Main.bannanas) {
//            bannana.show();
//        }
//        for (Lemon lemon : Main.lemons) {
//            lemon.show();
//        }
    }

    public static void showLemon() {
        Main.lemons.forEach(lemon -> lemon.show());
    }

    public static void showApple() {
        Main.apples.forEach(apple -> apple.show());
    }

    public static void showBanana() {
        Main.bannanas.forEach(bannana -> bannana.show());
    }

    public static void showMaxPrice() {
        System.out.println(Math.max((Math.max(Main.lemons.get(0).getGia(), Main.apples.get(0).getGia())), Main.bannanas.get(0).getGia()));
    }

    public static void countMaxByMonney() {
        Scanner scanner = new Scanner(System.in);
        Long monney = 0l;
        try {
            System.out.println("Nhap so tien ban co!");
            monney = Long.valueOf(scanner.nextLine());

        } catch (Exception e) {
            System.out.println("So tien khong hop le");
            return;
        }
        Long countLemont = 0l;
        Long countBanana = 0l;
        Long countApple = 0l;
        if (Main.apples != null && Main.apples.size() > 0) {
            countApple = monney / Main.apples.get(0).getGia();
        }

        if (Main.bannanas != null && Main.bannanas.size() > 0) {
            countBanana = monney / Main.bannanas.get(0).getGia();
        }

        if (Main.lemons != null && Main.lemons.size() > 0) {
            countLemont = monney / Main.lemons.get(0).getGia();
        }

        if (countApple <= countLemont && countApple <= countBanana) {
            Main.apples.get(0).show();
        }
        if (countBanana <= countLemont && countBanana <= countApple) {
            Main.bannanas.get(0).show();
        }
        if (countLemont <= countApple && countLemont <= countBanana) {
            Main.lemons.get(0).show();
        }
    }

    public static void exportCsv() {
        try (PrintWriter writer = new PrintWriter(String.format("D:/test_%s.csv", new Date().getTime()))) {

            StringBuilder sb = new StringBuilder();
            sb.append("Qua,");
            sb.append("Vi,");
            sb.append("Mau,");
            sb.append("Can nang,");
            sb.append("Gia,");
            sb.append('\n');

            if (Main.apples != null && Main.apples.size() > 0) {
                sb.append(Main.apples.get(0).getType());
                sb.append(',');
                sb.append(Main.apples.get(0).getVi());
                sb.append(',');
                sb.append(Main.apples.get(0).getMauSac());
                sb.append(',');
                sb.append(Main.apples.get(0).getCanNang());
                sb.append(',');
                sb.append(Main.apples.get(0).getGia());
                sb.append('\n');
            }

            if (Main.bannanas != null && Main.bannanas.size() > 0) {
                sb.append(Main.bannanas.get(0).getType());
                sb.append(',');
                sb.append(Main.bannanas.get(0).getVi());
                sb.append(',');
                sb.append(Main.bannanas.get(0).getMauSac());
                sb.append(',');
                sb.append(Main.bannanas.get(0).getCanNang());
                sb.append(',');
                sb.append(Main.bannanas.get(0).getGia());
                sb.append('\n');
            }

            if (Main.lemons != null && Main.lemons.size() > 0) {
                sb.append(Main.lemons.get(0).getType());
                sb.append(',');
                sb.append(Main.lemons.get(0).getVi());
                sb.append(',');
                sb.append(Main.lemons.get(0).getMauSac());
                sb.append(',');
                sb.append(Main.lemons.get(0).getCanNang());
                sb.append(',');
                sb.append(Main.lemons.get(0).getGia());
                sb.append('\n');
            }

            writer.write(sb.toString());

            System.out.println("done!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
