public class SQLTrainer extends Trainer{
    public SQLTrainer(){
        // super();
    }
    public static void main(String[] args){
        SQLTrainer ram = new SQLTrainer();
        System.out.println(ram.institute);
        System.out.println(ram.department);
        System.out.println(ram.getSalary());
        ram.training();

    }
}




// 2) Create a sub class “SQLTrainer” under “Trainer”.
// – Have main method in it.
// – Create instance ram for this class
// – Handle with proper super class constructor
// – Access parent class instance variables
// – Call parent class instance method training()
// – Access salary using getter method in parent class