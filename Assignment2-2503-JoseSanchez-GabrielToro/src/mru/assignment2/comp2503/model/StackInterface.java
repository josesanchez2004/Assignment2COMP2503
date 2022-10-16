package mru.assignment2.comp2503.model;

public interface StackInterface <t>{
	
public t pop();
public void push(t object);
public t peek();
public boolean isEmpty();

public int size();


}
