
public class ActorSivakumar implements Actor {
    static String address = "Coimbatore";
    
    String car;
    int age;

    public static void main(String[] args) {
        ActorSivakumar as = new ActorSivakumar(65, “Audi Car”);
    }

    public ActorSivakumar(int age,String car){
        this.age = age;
        this.car = car;
    }

    public void speaking(){

    }

    @Override
    public void act() {
        System.out.println("act like a MGR");
    }

    @Override
    public void dance() {
        System.out.println("dance like a Prabudeva");
    }

    @Override
    public void sing() {
        System.out.println("sing like a Aniruth");
    }
}
