package softwareProduct;

public class game extends softwareProduct {
    public game(int code, String nameOfProduct, double price) {
        super(code, nameOfProduct, price);
    }

    public void calculateNewPrice() {
        price -= price * 0.4;
    }
}
