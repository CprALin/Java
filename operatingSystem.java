package softwareProduct;

public class operatingSystem extends softwareProduct {
    public operatingSystem(int code, String nameOfProduct, double price) {
        super(code, nameOfProduct, price);
    }

    public void calculateNewPrice() {
        price -= (price * 0.4);
        price -= (price * 3);
    }
}
