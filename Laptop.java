public class Laptop {

    int ram;          
    String processor;
    int storage;      
    int price;        

    public Laptop(int ram, String processor, int storage, int price) {
        this.ram = ram;
        this.processor = processor;
        this.storage = storage;
        this.price = price;
    }

    public Laptop() {
    }

    public static void main(String[] args) {

        Laptop l1 = new Laptop(8, "Intel i5", 512, 60);
        Laptop l2 = new Laptop(16, "Intel i7", 1024, 85);

        l2.compareLaptop(l1);
    }

    public static void compareLaptop(Laptop l1) {
        System.out.println("Laptop 1 Price: " + this.price);
        System.out.println("Laptop 2 Price: " + l1.price);

        if (this.price > l1.price) {    
            System.out.println("Laptop 1 is more expensive");
        } else if (this.price < l1.price) {
            System.out.println("Laptop 2 is more expensive");
        } else {
            System.out.println("Both laptops have the same price");
        }

        if (this.ram > l1.ram) {
            System.out.println("Laptop 1 has more RAM");
        } else {
            System.out.println("Laptop 2 has more RAM");
        }
    }
}