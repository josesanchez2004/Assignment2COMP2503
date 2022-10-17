package mru.assignment2.comp2503.model;

public class LinkedListStack<T> implements StackInterface<T> {

	StackNode<T>start;
	
	public LinkedListStack() {
		start=null;
	}
	
	
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

	@Override
	public T peek() {
		StackNode<T>curr= start;
		while(curr.getNext()!=null) {
			curr=curr.getNext();
		}
		
		return curr.getData();
	}

	@Override
	public boolean isEmpty() {
		
		return (start == null);
	}


	@Override
	public int size() {
		StackNode<T>curr= start;
		int i;
		for( i = 0;curr.getNext()!=null; i++ ) {
			curr=curr.getNext();
		}
		return i;
	}
	
	

	

}
