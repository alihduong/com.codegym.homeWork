public class Apple extends Fruit{
    private String type= "Táo";

    public Apple() {
    }

    public String getType() {
        return type;
    }

    public void show() {
        System.out.println(String.format("Qua: %s \n Can nang: %s\n vi: %s\n gia: %s\n Mau sac: %s",
                getType(), getCanNang(), getVi(), getGia(), getMauSac()));
    }
}
