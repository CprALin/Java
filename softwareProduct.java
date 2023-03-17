package softwareProduct;

public abstract class softwareProduct {
    private int code;
    private String nameOfProduct;
    protected double price;

    public softwareProduct(int code, String nameOfProduct, double price) {
        this.code = code;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public abstract void calculateNewPrice();

    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("Type of product: \n");
        sb.append(getClass().getSimpleName());
        sb.append("Name: \n");
        sb.append(nameOfProduct);
        sb.append("Code: \n");
        sb.append(code);
        sb.append("Price: \n");
        sb.append(price);

        return sb.toString();
    }
}
