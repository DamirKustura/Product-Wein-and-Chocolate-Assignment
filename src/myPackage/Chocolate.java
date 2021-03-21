package myPackage;

public class Chocolate extends Product{
    //******Get and Set Methods******

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
//*********Finish Get und Set Methods********
    private double weight;

    public Chocolate(){}


    public Chocolate(double weight, String productName, double basicPrice, double barCode){
          super(productName, basicPrice, barCode);
          this.weight = weight;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Weight: " + weight + " Kg";
    }
}
