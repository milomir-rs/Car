package main.car;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        Car audi = new Car();
        audi.printAttributes();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.color = "black";
        audi.printAttributes();
        audi.travel(150);
        audi.printAttributes();
//        audi.fuelUp(30000);
//        audi.travel(300);
        
        
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "X5";
        bmw.printAttributes();
        
        Car fiat = new Car(2010);
        System.out.println("Godina proizvodnje: " + fiat.getBuildYear());
        
        Car lada = new Car("Lada", "Niva", "green", 2018, 0, 50, 10);
        lada.printAttributes();
//        lada.setFuel(343);
        //proveriti gorivo, 

        lada.travel(300);
        lada.printAttributes();
        lada.travel(200);
        lada.printAttributes();
        lada.travel(100);
        lada.printAttributes();
        

        
    }

}
