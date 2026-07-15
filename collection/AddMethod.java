
import java.util.Arrays;



public class AddMethod{
    public static void main(String[] args) {

        int value = 20;
        int insert = 3;
        int[] arr1 = {1,2,3,4,5};

        int[] arr2 = new int[arr1.length+1];

        // for (int i = 0; i < arr2.length; i++) {
        //     if(i == arr1.length){
        //         arr2[i] = value;
        //     }else{
        //         arr2[i] = arr1[i];
        //     }

        // }
        // System.out.println(Arrays.toString(arr2));


        for (int i = 0; i < insert; i++) {
            arr2[i] = arr1[i];
        }
        
        arr2[insert] = value;
        
        for (int i = insert+1; i < arr2.length; i++) {
            arr2[i] = arr1[i-1];
        }
        System.out.println(Arrays.toString(arr2));
    }
}

