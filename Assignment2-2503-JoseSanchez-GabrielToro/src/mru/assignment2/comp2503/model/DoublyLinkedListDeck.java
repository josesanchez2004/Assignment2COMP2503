package mru.assignment2.comp2503.model;

public class DoublyLinkedListDeck<T> {

	private Node1<T>start;
	
/**
 * this is the doubly linked list to create a list of cards. 
 */
public DoublyLinkedListDeck() {
	start=null;
}

/**
 * adds node to start of the list. 
 * @param data
 */
public void addToStart(T data) {
	Node1<T> nodeToAdd = new Node1<T>(data);
	if(isEmpty()) {
		start= nodeToAdd;
	}else {
		
		nodeToAdd.setNext(start);
		start.setPrevious(nodeToAdd);
		start = nodeToAdd;
	}
}

/**
 * adds a node at a specific index.
 * @param index
 * @param data
 */
public void addAt(int index,T data) {
	Node1<T> nodeToAdd = new Node1<T>(data);
	if(isEmpty()) {
		addToStart(data);
	}
	else if(size()<= index) {
		addToEnd(data);
	}
	else {
		Node1<T> current = start;
		for(int counter = 0; counter < index - 1; counter++) {
			current = current.getNext();
		}
		current.getNext().setPrevious(nodeToAdd);
		nodeToAdd.setNext(current.getNext());
		current.setNext(nodeToAdd);
		nodeToAdd.setPrevious(current);
	}
}


/**
 * adds node to end of the list, if the list is empty addToStart is called.
 * @param data
 */
public void addToEnd(T data) {
	Node1<T> nodeToAdd= new Node1<T>(data);
	if(isEmpty()) {
		addToStart(data);
	}else {
		Node1<T>current= start;
		while(current.getNext()!=null) {
			current= current.getNext();
		}
		current.setNext(nodeToAdd);
		nodeToAdd.setPrevious(current);
		
	}
}
/**
 * removes item from the start of the list and returns the value. 
 * @return object
 */
public T removeFromStart() {
	T object = null;
	
	if(!isEmpty()) {
		if(start.getNext() == null) {
			object = start.getData();
			start = null;
		}
		else {
			object = start.getData();
			start = start.getNext();
			start.setPrevious(null);
		}
	}
	
	return object;
}

public void removeFromEnd() {
	
}

/**
 * this method counts the length of the linked list.
 * @return counter
 */
public int size() {
	Node1<T> current = start;
	int counter = 0;
	
	while(current != null) {
		counter++;
		current = current.getNext();
	}
	
	return counter;
}

/**
 * 
 * @return true if start equals null, vice versa. 
 */
public boolean isEmpty() {
	return (start == null);
}

/**
 * prints the contents within the list. 
 */
public void print() {
	Node1<T> curr= start;
	while(curr!=null) {
		System.out.println(curr.getData());
		curr= curr.getNext();
	}
	System.out.println("List is done! ");
}



}
