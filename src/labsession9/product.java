package labsession9;

public class product {

    String productName;
    int price;

    public product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return  productName +  ":  "+ price ;
    }
}



