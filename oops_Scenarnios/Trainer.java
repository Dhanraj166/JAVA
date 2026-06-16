public class Trainer{
    String department = "JAVA";
    String institute = "Payilagam";
    int salary = 50000;

    public Trainer(String department, String institute){
        this.department = department;
        this.institute = institute;
    }
    public Trainer(){
        System.out.println("No argument Constructor");
    }

    public static void main(String[] args){
        Trainer trainerKumar = new Trainer("CSE","Payilagam");

        System.out.println(trainerKumar.department);
        System.out.println(trainerKumar.institute);
        // System.out.println(trainerKumar.training());
        trainerKumar.training();
    }

    public int getSalary(){
        return salary;
    }

    public void training(){
        System.out.println("JD Training");
    }
}