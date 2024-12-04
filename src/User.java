
public abstract class User {
protected String name;
protected double discount;
	
	public User(String name) {
		
		this.name = name;
		
	}
	
	
	public String getName() {
		
		return name;
	}
	
	public abstract double getDiscount();
}
