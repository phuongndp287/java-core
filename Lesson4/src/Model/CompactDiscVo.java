package Model;

public class CompactDiscVo {
    private int id;
    private String name;
    private String singer;
    private int quantity;
    private double price;

    public CompactDiscVo(int id, String name, String singer, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.quantity = quantity;
        this.price = price;
    }

    public CompactDiscVo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CompactDiscVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
