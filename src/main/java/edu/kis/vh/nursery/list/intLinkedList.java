package edu.kis.vh.nursery.list;

public class intLinkedList {

<<<<<<< HEAD:src/main/java/edu/kis/vh/nursery/list/intLinkedList.java
    node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new node(i);
        else {
            last.next = new node(i);
            last.next.prev = last;
            last = last.next;
        }
    }
=======
	Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}
>>>>>>> 53f9a91 (4.1 Poprawa nazw klas):src/main/java/edu/kis/vh/nursery/list/IntLinkedList.java

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
