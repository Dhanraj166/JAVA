import java.io.*;

//     Save Student Details 

public class FileHandlingDemo {

    public static void main(String[] args) {

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/user/Documents/students.txt"));

            bw.write("101,Dhanraj,22,CSE");
            bw.newLine();

            bw.write("102,Rahul,21,ECE");
            bw.newLine();

            bw.write("103,Priya,20,IT");

            bw.close();

            System.out.println("Student Details Saved.");

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}

//     Read All Students

// public class FileHandlingDemo {

//     public static void main(String[] args) {

//         try {

//             BufferedReader br = new BufferedReader(new FileReader("/home/user/Documents/students.txt"));

//             String line;

//             while ((line = br.readLine()) != null) {

//                 System.out.println(line);

//             }

//             br.close();

//         } catch (Exception e) {

//             System.out.println(e);

//         }

//     }

// }



//        Search Student

// public class FileHandlingDemo {

//     public static void main(String[] args) {

//         try {

//             BufferedReader br = new BufferedReader(new FileReader("/home/user/Documents/students.txt"));

//             String line;

//             while ((line = br.readLine()) != null) {

//                 String[] student = line.split(",");

//                 if (student[0].equals("102")) {

//                     System.out.println("Student Found");
//                     System.out.println("Roll No : " + student[0]);
//                     System.out.println("Name : " + student[1]);
//                     System.out.println("Age : " + student[2]);
//                     System.out.println("Department : " + student[3]);

//                 }

//             }

//             br.close();

//         } catch (Exception e) {

//             System.out.println(e);

//         }

//     }

// }


