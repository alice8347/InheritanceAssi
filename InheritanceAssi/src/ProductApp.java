import java.util.Scanner;
import java.util.ArrayList;

public class ProductApp {

	public static void main(String[] args) {
		String product;
		Scanner sc = new Scanner(System.in);		
		String choice = "y", status = "";
		ArrayList<Book> book = new ArrayList<Book>();
		ArrayList<Software> software = new ArrayList<Software>();

		while (choice.equalsIgnoreCase("y")) {
			boolean isValid = false;
			while (isValid == false) {
				System.out.print("Please enter the product type (book/software): ");
				product = sc.nextLine();
				
				if (product.equalsIgnoreCase("book")) {
					Book myBook = new Book();
					isValid = true;
					System.out.print("Please enter the product code: ");
					myBook.setCode(sc.nextLine());
					System.out.print("Please enter the author: ");
					myBook.setAuthor(sc.nextLine());
					System.out.print("Please enter the product description: ");
					myBook.setDescription(sc.nextLine());
					System.out.print("Please enter the product price: ");
					myBook.setPrice(sc.nextDouble());
					sc.nextLine();
					book.add(myBook);
				} else if (product.equalsIgnoreCase("software")) {
					Software mySoftware = new Software();
					isValid = true;
					System.out.print("Please enter the product code: ");
					mySoftware.setCode(sc.nextLine());
					System.out.print("Please enter the version: ");
					mySoftware.setVersion(sc.nextLine());
					System.out.print("Please enter the product description: ");
					mySoftware.setDescription(sc.nextLine());
					System.out.print("Please enter the product price: ");
					mySoftware.setPrice(sc.nextDouble());
					sc.nextLine();
					software.add(mySoftware);
				} else {
					System.out.println("Invalid product type. Try again.");
				}
			}
			
			System.out.print("Continue? (y/n)");
			choice = sc.nextLine();
			System.out.println();
		}
		
		System.out.print("Type of list you want (detail/simple): ");
		status = sc.nextLine();
		
		for (int i = 0; i < book.size(); i++) {
			System.out.println(book.get(i).toString(status));
		}
		
		for (int i = 0; i < software.size(); i++) {
			System.out.println(software.get(i).toString(status));
		}
		
	}

}
