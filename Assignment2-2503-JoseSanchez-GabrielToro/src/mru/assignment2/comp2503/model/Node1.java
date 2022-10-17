package mru.assignment2.comp2503.model;
/**
 * This is the Node class for the DoublyLinkedList. 
 * @author Jose Sanchez and Gabriel Toro
 */
public class Node1<T> {
 
	private T data;
	private Node1<T> next=null;
	private Node1<T> previous=null;
	
	/**
	 * this is the constructor for the node. 
	 * @param data
	 */
	public Node1(T data) {
		this.data=data;
	}

	/**
	 * returns the object
	 * @return data
	 */
	public T getData() 
	{
		return data;
	}

	
	/**
	 * sets the objects data type
	 * @param data
	 */
	public void setData(T data) 
	{
		this.data = data;
	}

	/**
	 * returns the reference of the next object.
	 * @return
	 */
	public Node1<T> getNext() {
		return next;
	}

	/**
	 * sets the reference for the next object.
	 * @param next
	 */
	public void setNext(Node1<T> next) {
		this.next = next;
	}

	/**
	 * returns the reference for the previous object.
	 * @return previous
	 */
	public Node1<T> getPrevious() {
		return previous;
	}

	/**
	 * sets the reference for the previous object.
	 * @param previous
	 */
	public void setPrevious(Node1<T> previous) {
		this.previous = previous;
	}
	
}
