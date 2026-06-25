package mypack;

public class StringDemo {
	
	public static void main(String[] args) {
//		String name = "Anbumani";
//		String name2 = "AnbuMANI";
//		StringDemo obj = new StringDemo();
//		System.out.println(name.length());
//		System.out.println(name.charAt(4));
//		System.out.println(name.equals(name2));
//		System.out.println(name.substring(3));
//		System.out.println(name.substring(1, 6));
//		System.out.println(name == name2);
//		System.out.println(name.equalsIgnoreCase(name2));
//		System.out.println(name.toLowerCase());
//		System.out.println(name.toUpperCase());
//		System.out.println(name.contains("mani"));
//		char[] ch = name.toCharArray();
//		System.out.println(ch[4]);
//		System.out.println(name[2]);
		
		String password = "Admin123  ";
		if(password.trim().equals("Admin123")) {
			System.out.println("Password is Correct");
		}else {
			System.out.println("Password is incorrect");
		}
		
		
		String name = "Vijay";
		System.out.println(name.equalsIgnoreCase("vijay"));
		
		String s1 = "java";
		String s2 = new String("java");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		String mail = "kathir@123";
		System.out.println(mail.contains("@"));
		
		String s = "1234";
		int num = Integer.parseInt(s);
		System.out.println(num + 10);
		
		String s11 = "   Welcome to Java   ";
		System.out.println(s11.trim());
		
		
		String s12 = "Java is easy. Java is powerful.";
        int count = 0;
        String[] words = s12.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Java")) {
                count++;
            }
        }
        System.out.println(count);
        
        String s13 = "powerful";
        String reverse = "";
        for(int i=s13.length()-1;i>=0;i--) {
        	reverse += s13.charAt(i);
        }
        System.out.println(reverse);
        
        String s14 = "madam";
        String rev = "";

        for(int i = s14.length()-1; i >= 0; i--) {
            rev += s14.charAt(i);
        }

        if(s14.equals(rev)) {
            System.out.println("Palindrome");
        }else {
        	System.out.println("Not Palindrome");
        }
		
        
        String log = "ERROR: File not found";
        System.out.println(log.substring(7));
        
        
        String csv = "Vijay,25,Chennai";
        String[] data = csv.split(",");
        
        String userName = data[0];
        String age = data[1];
        String city = data[2];
        
        
        String s15 = "I love Java programming";
        System.out.println(s15.replace("Java", "Spring Boot"));
        
        
        String s16 = "aabbccdd";
        String result = "";

        for (int i = 0; i < s16.length(); i++) {
            char ch = s16.charAt(i);
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        
        System.out.println(result);


        String s17 = "apple#banana#mango";
        String[] fruits = s17.split("#");

        for(String f : fruits) {
            System.out.println(f);
        }
        
        
	}

}
