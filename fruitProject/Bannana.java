public class Bannana extends Fruit{
    private String type = "Banana";

    public Bannana() {
    }

    public String getType() {
        return type;
    }

    public void show() {
        System.out.println(String.format("Qua: %s \n Can nang: %s\n vi: %s\n gia: %s\n Mau sac: %s",
                getType(), getCanNang(), getVi(), getGia(), getMauSac()));
    }
}
