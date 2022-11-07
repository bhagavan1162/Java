import java.util.Scanner;
class BookDetails{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Code:");
		String code = s.nextLine();
		System.out.println("Enter the Name:");
		String name = s.nextLine();
		System.out.println("Enter the Author Name:");
		String author = s.nextLine();
		System.out.println("Enter the Price:");
		int price = s.nextInt();
		System.out.println("Enter the Quantity:");
		int qty = s.nextInt();
		System.out.println("===Details===");
		System.out.println("Book Name: "+name);
		System.out.println("Book Code: "+code);
		System.out.println("Author Name: "+author);
		System.out.println("Book Price: "+price);
		System.out.println("Quantity: "+qty);
	}
}
		