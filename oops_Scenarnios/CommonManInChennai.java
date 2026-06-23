package tamilnadu.chennai;

public class CommonManInChennai implements TrafficRules {

    public void goByDieselVehicle() {
        System.out.println("Chennai: Diesel vehicles allowed with rules");
    }

    public void goByBicycle() {
        System.out.println("Chennai: Bicycle is allowed");
    }

    public static void main(String[] args) {

        CommonManInChennai man = new CommonManInChennai();

        System.out.println("Traffic Commissioner: " + CommonManInChennai.trafficCommisssioner);

        man.goByDieselVehicle();
        man.goByBicycle();
    }
}