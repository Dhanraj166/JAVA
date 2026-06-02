public class Constructor{

    String name;
    int price;
    int quantity;
    
    public Constructor(String name, int price){
        this.name = name;
        this.price = price;
    }
    public Constructor(int price){
        this.price = price;
    }
    public Constructor(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args){
        Constructor product1 = new Constructor("soap",20);
        Constructor product2 = new Constructor("comp",40,60);
        Constructor product3 = new Constructor(100);
        
        System.out.println(product1.name);
        System.out.println(product1.price);
        System.out.println(product2.name);
        System.out.println(product2.quantity);
        System.out.println(product3.price); 
    }
}