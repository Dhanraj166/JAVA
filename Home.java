import mypack.Practice;
public class Home{
    public static void main(String[] args){
        Practice name = new Practice();
        name.hello();
        name.bye();
    }
}


public class Home extends Practice{
    public static void main(String[] args){
        Home name = new Home();
        name.hello();
        name.bye(); 
    }
}


