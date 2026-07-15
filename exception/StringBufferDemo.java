
// public class StringBufferDemo {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello");
//         sb.append(" World");
//         System.out.println(sb);        // Hello World
//         sb.insert(5, ",");
//         System.out.println(sb);        // Hello, World
//         sb.replace(7, 12, "Java");
//         System.out.println(sb);        // Hello, Java
//         sb.delete(5, 7);
//         System.out.println(sb);        // HelloJava
//         sb.reverse();
//         System.out.println(sb);        // avaJolleH
//         System.out.println(sb.length());  // 9
//     }
// }


public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        int i = 1;

        while (i <= 5) {
            result.append(i); 
            i++;
        }

        System.out.println(result);  
    }
}





