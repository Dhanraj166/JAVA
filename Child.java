import mypack.Parent;
public class Child extends Parent{

    public Child(int num){
        // super();
        System.out.println("constructor calling ... in Child");
    }
    public static void main(String[] args){
        Parent obj = new Parent(10);
        obj.hii();
        obj.bye();
    }
}
