public class Lemon extends Fruit{
    private String type = "Lemon";

    public Lemon() {
    }

    public String getType() {
        return type;
    }

    public void show() {
        System.out.println(String.format("Qua: %s \n Can nang: %s\n vi: %s\n gia: %s\n Mau sac: %s",
                getType(), getCanNang(), getVi(), getGia(), getMauSac()));
    }
}
