import myPackage.*;
import myPackage.Chocolate;
import myPackage.Wein;

public class JavaProgram {

    public static void main(String[] args) {
//********** CREATE OBJECT ONE ***********
        Wein wein1 = new Wein();
        wein1.setProductName("Vranca Pro Corde");
        wein1.setBasicPrice(12);
        wein1.setBarCode(584.54);
        wein1.setBottleVolume(0.75);
        wein1.calculaterBasePrice();

//********** CREATE OBJECT TWO ***********
        Chocolate chocolate1 = new Chocolate();
        chocolate1.setProductName("Braco i Seka");
        chocolate1.setBasicPrice(1);
        chocolate1.setBarCode(554.5);
        chocolate1.setWeight(0.2);
        chocolate1.calculaterBasePrice();
//********** CALL GET INFO METHOD **********
        String massage = wein1.getInfo();
        String massage1 = chocolate1.getInfo();
//********** MASSAGE ***********
        System.out.println(massage + "\n"+ "\n" + massage1);


    }
}
