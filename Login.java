public class Login {
    static String school = "payilagam";
    String name;
    int age;
    char grade;
    public static void main(String[] args) {

        byte age = 25;
        short year = 2025;
        int salary = 75000;
        long Population = 8000000000l;

        float height = 5.9F;
        double pi = 3.14159265358979;

        char grade = 'a';

        boolean isStudent = false;  

        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Salary: " + salary);
        System.out.println("World Population: " + Population);
        System.out.println("Height: " + height);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);

        Login studentDetails1 = new Login();
        studentDetails1.name = "Arun";
        studentDetails1.age = 15;
        studentDetails1.grade = 'A';

        Login studentDetails2 = new Login();
        studentDetails2.name = "Bala";
        studentDetails2.age = 16;
        studentDetails2.grade = 'B';

        Login studentDetails3 = new Login();
        // studentDetails3.name = "Murugan";
        // studentDetails3.age = 14;
        // studentDetails3.grade = 'C';

        System.out.println(Login.school);

        System.out.println(studentDetails1.name);
        System.out.println(studentDetails2.age);
        System.out.println(studentDetails3.grade);


    }
}