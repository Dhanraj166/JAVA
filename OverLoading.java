public class OverLoading{
    public static void main(String[] args){
        OverLoading transaction = new OverLoading();

        transaction.process();
        boolean bank = transaction.process("ACC101", 12000);
        String online = transaction.process("ACC101", 12000, 2422);
        String national = transaction.process("ACC101", 12000, "HDFCINBB");

        System.out.println(bank);
        System.out.println(online);
        System.out.println(national);
    }

    void process(){
        System.out.println("HDFC Bank");
    }

    boolean process(String account, int amount){
        if(account == null && amount>=0){
            return false;
        }
        return true;
    }
    
    String process(String account, int amount, int pin){
        if(pin == 2422){
            return amount + " Withdraw successfully in " + account;
        }else{
            return "Enter pin correctly";
        }
    }

    String process(String account, int amount, String bankCode){
        return amount + " Deposit to your account no : " + account;
    }
    
}