
public class PremiumUser extends User {

	public PremiumUser(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
		this.discount = 0.25;
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return discount;
	}

}
