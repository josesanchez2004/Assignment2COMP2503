package mru.assignment2.comp2503.model;
/**
 * This is the StackNode class for the SinglyLinkedList
 * @author Jose Sanchez and Gabriel Toro
 */

public class StackNode<t>{
	
private t data;
private StackNode<t> next;

/**
 * constructor for the StackNode class .
 * @param data
 */
public StackNode(t data) {
	this.data=data;
}

/**
 * returns data.
 * @return data
 */
public t getData() {
	return data;
}

/**
 * sets the value for data.
 * @param data
 */
public void setData(t data) {
	this.data = data;
}

/**
 * gets the reference for the next object in the list.
 * @return next
 */
public StackNode<t> getNext() {
	return next;
}

/**
 * sets the value for next.
 * @param next
 */
public void setNext(StackNode<t> next) {
	this.next = next;
}




}
