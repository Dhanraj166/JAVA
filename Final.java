// final class Final{
//     private final String name;
//     public Final(String name){
//         this.name = name;
//     }
//     final String hii(String name){
//         return "hello " + name;
//     }
//     public String getName(){
//         return name;
//     }


    // public void setName(String newName){
    //     if(newName != null){
    //         name  = newName;
    //     }
    // }


    // public static void main(String[] args){
    //     Final obj = new Final("vimal");

    //     String hello =  obj.hii(obj.name);
    //     System.out.println(hello);
    //     // obj.name = "Ganesh";
    // }
// }






public class Final extends Parent{
    public void study(){
        System.out.println("Engineering study method here...");
    };
    public static void main(String[] args){

        Final obj = new Final();
        obj.motivate();

    }
}
