
public class Samsung extends FactoryDemo {
    static int price = 5000;
    public static void main(String[] args) {
        Samsung sam = new Samsung();
        sam.browse();
        System.out.println(sam.price);
        
    }

    public void verifyFingerPrint() {
        System.out.println("verifyFingerPrint method...");
    }

    public void providePattern() {
        System.out.println("providePattern method...");
    }

    public void receiveCall(){
        System.out.println("receiveCall method ...");
    }

    public void sendMessage(){
        System.out.println("sendMessage method ...");
    }

    public int call(int seconds){
        return seconds / 60;
    }
}
