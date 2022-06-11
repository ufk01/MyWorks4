import java.util.Scanner;

public class PalindromTester {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DoubleLinkedList dlist = new DoubleLinkedList();
		boolean check=true;
		StackList slist = new StackList();
		System.out.println("Please enter a word to check whether is a polindrome or not");
		String word = keyboard.nextLine();
		for (int i = 0; i < word.length(); i++) {
			dlist.Add(word.charAt(i));
			slist.push(word.charAt(i));

		}
		Node current = dlist.head;
		while (current != null) {
			if (current.item == slist.pop()) {
				current=current.next;
				continue;
			} else {
				check = false;
				break;
			}
		}
		if(check==true) {
			System.out.println("It is polindrome word.");
		}
		else {
			System.out.println("ýt is not polindrome word");
		}
	}
}
