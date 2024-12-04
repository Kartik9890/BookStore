
public class VIPUser extends User {

	public VIPUser(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
		this.discount = 0.50;
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return discount;
	}

}
