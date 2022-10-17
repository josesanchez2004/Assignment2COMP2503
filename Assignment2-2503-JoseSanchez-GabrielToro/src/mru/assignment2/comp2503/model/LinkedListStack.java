package mru.assignment2.comp2503.model;

/**
 * This is the LinkedListStack class that implements the StackInterface. 
 * @author Jose Sanchez and Gabriel Toro
 */
public class LinkedListStack<T> implements StackInterface<T> {

	StackNode<T>start;
	
	/**
	 * this is the constructor for the LinkedListStack class.
	 */
	public LinkedListStack() {
		start=null;
	}
	
	/**
	 * pop returns and removes the first value in the list. 
	 */
	@Override
	public T pop() {
		T object = null;
		if(!isEmpty()) {
			
			if(start.getNext()==null) {
				object = start.getData();
				start = null;
			}else {
				object = start.getData();
				start=start.getNext();
			}
			
		}
		
		return object;
	}

	/**
	 *  push adds an item to the list.
	 */
	@Override
	public void push(T data) {
		StackNode<T>nodeToAdd= new StackNode<T>(data);
	
		if(isEmpty()) {
			start=nodeToAdd;
		}else {
			nodeToAdd.setNext(start);
			start=nodeToAdd;
		}
	}
	
	/**
	 * peek returns the value for the top of the list. 
	 */
	@Override
	public T peek() {
		T object= null;
		StackNode<T>curr= start;
		while(curr.getNext()!=null) {
			curr=curr.getNext();
		}
		object=curr.getData();
		return object;
	}
	
	/**
	 * isEmpty checks the list and returns a boolean value whether the list is empty or not.
	 */
	@Override
	public boolean isEmpty() {
		
		return (start == null);
	}

	/**
	 * size counts and returns the size of the linked list. 
	 */
	@Override
	public int size() {
		StackNode<T>curr= start;
		int i;
		for( i = 0;curr.getNext()!=null; i++ ) {
			curr=curr.getNext();
		}
		i++;
		return i;
	}
	
	

	

}
