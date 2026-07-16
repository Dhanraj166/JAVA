// package collectionDemo;

public class Products implements Comparable<Products>{

	

    public Products(String name, int price, int rating) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Products [name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}

	String name;
	int price;	
	int rating;
	
	@Override
	public int compareTo(Products obj) {
		System.out.println(this.name+" - "+obj.name);
		if(this.rating > obj.rating) {
			return 48;
		}else if(this.rating < obj.rating) {
			return -373;
		}else {
			return 0;	
		}
		
	}
	

}
