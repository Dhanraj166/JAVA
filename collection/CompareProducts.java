// package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareProducts implements Comparator<String> {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("xyz");
        al.add("abc");
        al.add("bcd");
        Products p1 = new Products("HP", 25000, 4);
        Products p2 = new Products("Lenovo", 33000, 3);
//		al.add(new Products("hp", 25000, 4));
//		al.add(new Products("lenovo", 33000, 3));
//		al.add(new Products("asus", 28000, 4));	
//		al.add(new Products("asus", 28000, 5));	
//				
        Collections.sort(al, new CompareProducts());
        System.out.println(al);

    }

    @Override
    public int compare(String str1, String str2) {
        if (str1.compareTo(str2) > 0) {
            return -1;
        } else if (str1.compareTo(str2) < 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
