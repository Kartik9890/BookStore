
public class Main {
	public static void main(String[] args) {

		Book book1 = new Book("kartikhavingBook", "Bykartik", 50.0);
		Book book2 = new Book("SoumikhavingBook", "BySoumik", 100.0);
		Book book3 = new Book("ArunhavingBook", "ByArun", 150.0);

		User basicUser = new BasicUser("A");
		User premiumUser = new PremiumUser("B");
		User VIPUser = new VIPUser("C");

		Cart basicUserCart = new Cart(basicUser);
		Cart premiumUserCart = new Cart(premiumUser);
		Cart VIPUserCart = new Cart(VIPUser);

		basicUserCart.addBook(book1);
		basicUserCart.addBook(book2);

		premiumUserCart.addBook(book2);
		premiumUserCart.addBook(book3);

		VIPUserCart.addBook(book1);
		VIPUserCart.addBook(book3);

		System.out.println("Cart for Basic user :");
		basicUserCart.displayCart();
		System.out.println();

		System.out.println("Cart for Premium User:");
		premiumUserCart.displayCart();
		System.out.println();

		System.out.println("Cart for VIP User:");
		VIPUserCart.displayCart();
		System.out.println();

	}
}
