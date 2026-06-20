public class TamilNadu extends SouthIndia{

    static String capital = "Chennai";

    public TamilNadu(String PrimeMinister) {
        super(PrimeMinister);
    }

    
    
    public static void main(String[] args) {

        System.err.println(India.capital);
        System.err.println(TamilNadu.capital);

        SouthIndia si = new TamilNadu("Modi ji");

        si.speakLanguage();
        si.eat();
        si.dress();
        si.cultivate();
        si.livingStyle();
    }
    
    void speakLanguage(){
        System.err.println("speakLanguage is Tamil");
    }

    void eat(){
        System.out.println("South Indian foods");
    }

    void dress(){
        System.out.println("Traditional Dress");
    }

    public void cultivate(){
        System.out.println("Rice and Sugar cane cultivation");
    }

    public void livingStyle(){
        System.out.println("Above Average development");
    }

}