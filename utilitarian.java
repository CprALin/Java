package softwareProduct;

public class utilitarian extends softwareProduct {
    public utilitarian(int code, String nameOfProduct, double price) {
        super(code, nameOfProduct, price);
    }

    public void calculateNewPrice() {
        price -= (price * 0.4);
    }
}
