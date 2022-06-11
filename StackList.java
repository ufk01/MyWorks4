
public class StackList {
	Node first;

	public StackList() {
		first = null;
	}

	public void push(char item) {

		Node oldfirst = first;
		Node temp = new Node(item);
		first = temp;
		first.next = oldfirst;

	}

	public char pop() {
		char item = first.item;
		first = first.next;
		return item;
	}

}
