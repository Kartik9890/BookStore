import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Book> books;
	private User user;

	public Cart(User user) {

		this.books = new ArrayList<>();
		this.user = user;

	}

	public void addBook(Book book) {

		books.add(book);

	}

	public double calculateTotal() {

		double total = 0;

		for (Book book : books) {

			total += book.getPrice();

		}
		return total - (total * user.getDiscount());
	}

	
	public void displayCart() {
		
		System.out.println("User: "+user.getName()+", (Discount: "+user.getDiscount() * 100+" %)");
		
		System.out.println("Books in Cart :");
		
		for(Book book : books) {
			
			System.out.println(book);
		}
		System.out.println("Total after discount :"+ calculateTotal());
	}
	
}
