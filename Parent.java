// public class Parent extends Final{
//     public Parent(String name){
//         super(name);
//     }
//     // public void hii(String msg){
//     //     System.out.println("hello " + msg);
//     // }
    
//     public static void main(String[] args){
//         Parent obj = new Parent("mathan");
//         System.out.println(obj.hii("hiiii"));
//         // obj.setName("Maran");
//         System.out.println(obj.getName());
        
//     }
// }



public abstract class Parent{

    public final abstract void study();

    public void motivate(){
        System.out.println("Motivate method here...");
    }
    
}
