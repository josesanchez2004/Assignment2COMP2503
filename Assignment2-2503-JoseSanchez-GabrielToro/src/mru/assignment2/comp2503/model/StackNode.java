package mru.assignment2.comp2503.model;

public class StackNode<t>{
private t data;
private StackNode<t> next;

public StackNode(t data) {
	this.data=data;
}

public t getData() {
	return data;
}

public void setData(t data) {
	this.data = data;
}

public StackNode<t> getNext() {
	return next;
}

public void setNext(StackNode<t> next) {
	this.next = next;
}




}
