package india.newDelhi;

import tamilnadu.chennai.TrafficRules;

public class CommonManInDelhi implements TrafficRulesDelhi, TrafficRules {


    public void dontGoByDieselVehicle() {
        System.out.println("Delhi: Diesel vehicles are NOT allowed");
    }

    public void goByBicycle() {
        System.out.println("Delhi: Bicycle is allowed");
    }

    public void goByDieselVehicle() {
        System.out.println("Chennai rule followed in Delhi class");
    }

    public static void main(String[] args) {

        CommonManInDelhi man = new CommonManInDelhi();

        System.out.println("Delhi Traffic Commissioner: " + TrafficRulesDelhi.trafficCommisssioner);

        System.out.println("Chennai Traffic Commissioner: " + TrafficRules.trafficCommisssioner);

        man.dontGoByDieselVehicle();
        man.goByDieselVehicle();
        man.goByBicycle();
    }
}