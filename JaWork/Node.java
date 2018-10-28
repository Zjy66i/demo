package JaWork;

public class Node {
	public Object data;
	public Node next;

	public Node() {
		
	}

	public Node(Object data) {
		this(data, null);
	}

	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}

}