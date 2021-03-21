package myPackage;


public class Product {


    // ***** Get und Set Methods ******
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBarCode(double barCode) {
        this.barCode = barCode;
    }

    public double getBarCode() {
        return barCode;
    }
// ****END Get und Set Methods ***


    private String productName;
    private double basicPrice;
    private double barCode;
    private static final double pricePdv = 1.2;


    public Product() {
    }

    public Product(String productName, double basicPrice, double barCode) {
        this.productName = productName;
        this.basicPrice = basicPrice;
        this.barCode = barCode;
    }

// CREATE CALCULATER BASE PRICE
    public double calculaterBasePrice() {
        return basicPrice * pricePdv;
    }

    // END OF THE CALCULATER BASE PRICE METHOD
// CREATE GET INFO METHOD
    public String getInfo() {
        return "Product name: " + productName + "\n" +
                "Basic Price: " + basicPrice + " Euro " + "\n" +
                "Bar code: " + barCode + "\n" +
                "Price with PDV: " + calculaterBasePrice() + " Euro";

    }
// END OF THE BLOCK CODE GET INFO METHOD
}
