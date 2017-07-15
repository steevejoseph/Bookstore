import java.util.Scanner;
public class Menu {

    Scanner in = new Scanner(System.in);
    Book nb;

	Menu(){
		System.out.println("Hello! Welcome to our bookstore!");
		System.out.println("Please make a selection:");
		System.out.println("1) Inquire about the availability of a book");
		System.out.println("2) Buy a book");
		System.out.println("3) Buy a cliff-noted version of a book");

		int choix = in.nextInt();

		if (choix == 1)
		    one();

	}

	public void one(){
        System.out.println("What is the title of the book?");
        String tit = in.next();

        System.out.println("How many pages does the book have?");
        int pag = in.nextInt();

        System.out.println("How much does the book cost?");
        double cost = in.nextDouble();

        System.out.println("How many of these books would you like?");
        int qu = in.nextInt();

        nb = new Book(tit, pag, cost, qu);

        System.out.println("Here's your book! \n" + nb.toString());

        System.out.println("You owe: $" + nb.sell(qu));
    }
}
