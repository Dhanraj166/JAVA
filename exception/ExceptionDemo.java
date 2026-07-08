
public class ExceptionDemo {
	String name = new String("Arun");
	int a = 10;
	int b = 0;
	public static void main(String[] args) {
		ExceptionDemo obj = new ExceptionDemo();
		obj.add();
		
		obj.div();
		obj.hello();
		obj.toString();
	}
	public String toString(String name) {
		return this.name;
	}
	private void div() {
		try {
//			System.exit(0);
			System.out.println(a/b);
			
			System.out.println(name.charAt(0));
		}
		catch (Exception t) {     
          	System.out.println("Exception Message: " + t.getMessage());
            t.printStackTrace();    
        }catch (Error t){
        	System.out.println("Error Message: " + t.getMessage());
            t.printStackTrace();
        }
		finally {
			System.out.println("finally ....");
		}
	}

	private void add() {
		System.out.println(a+b);
	}

	private void hello() {
		System.out.println(name);
	}
	

}
