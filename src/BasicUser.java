
public class BasicUser extends User {

	public BasicUser(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
		this.discount = 0.10;
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return discount;
	}

}
