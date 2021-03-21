package myPackage;


public class Wein extends Product {
    //****Get und Set Methods****

    public void setBottleVolume(double bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    public double getBottleVolume() {
        return bottleVolume;
    }
    //****END Get and Set Methods****

    private double bottleVolume;
    public static final double priceforAlcohol = 1.1;

    public Wein() {
    }

    public Wein(double bottleVolume, String productName, double basicPrice, double barCode) {
        super(productName, basicPrice, barCode);
        this.bottleVolume = bottleVolume;
    }

    @Override
    public double calculaterBasePrice() {
        return super.calculaterBasePrice() * priceforAlcohol;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "BottelVolume: " + bottleVolume + "L";
    }
}
