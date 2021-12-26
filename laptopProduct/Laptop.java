public class Laptop {
    private  int id;
    private  String trademark;
    private String color;
    private double price;
    private int quantity;

    public Laptop() {
    }

    public Laptop(int id, String trademark, String color, double price, int quantity) {
        this.id = id;
        this.trademark = trademark;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", trademark='" + trademark + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
