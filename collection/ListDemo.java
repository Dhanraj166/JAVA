
import java.util.ArrayList;

public class ListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(2, 20);
        System.out.println(al);
            

    }
}