package mru.assignment2.comp2503.model;

public class LinkedListStack implements StackInterface<Object> {

	StackNode<Object>start;
	
	public LinkedListStack() {
		start=null;
	}
	
	
	@Override
	public Object pop() {
		Object object = null;
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
	public void push(Object data) {
		StackNode<Object>nodeToAdd= new StackNode<Object>(data);
	
		if(isEmpty()) {
			start=nodeToAdd;
		}else {
			nodeToAdd.setNext(start);
			start=nodeToAdd;
		}
	}

	@Override
	public Object peek() {
		StackNode<Object>curr= start;
		while(curr.getNext()!=null) {
			curr=curr.getNext();
		}
		
		return curr;
	}

	@Override
	public boolean isEmpty() {
		
		return (start == null);
	}


	@Override
	public int size() {
		StackNode<Object>curr= start;
		int i;
		for( i = 0;curr.getNext()!=null; i++ ) {
			curr=curr.getNext();
		}
		return i;
	}
	
	

	

}
