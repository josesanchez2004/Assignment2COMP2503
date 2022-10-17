package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mru.assignment2.comp2503.model.LinkedListStack;

class LinkedListStackTest {

	LinkedListStack<Integer> list;
	
	@BeforeEach
	void initialize() {
		list= new LinkedListStack<>();
	}
	
	@Test
	void testPop() {
		for(int i=0;i<4;i++) {
			list.push(i*2);
		}
		list.pop();
		int result= list.pop();
		int expectedValue= 4; 
		
		assertEquals(expectedValue, result);
	}
	
	@Test
	void testSize() {
		for(int i =0; i<3;i++) {
			list.push(i*3);
			
		}
		int result = list.size();
		int expectedValue=3;
		assertEquals(expectedValue, result);
	}
	
	@Test
	void testIsEmpty() {
		for(int i=0; i<3;i++) {
			list.push(3);
			list.push(2);
			list.pop();
		}
		boolean expectedValue= false;
		boolean result= list.isEmpty();
		assertEquals(expectedValue, result);
		
	}
	
	@Test
	void testPush() {
		for(int i=0;i<2;i++) {
			list.push(i*i);
		}
		int result = list.pop();
		int expectedValue= 1;
		assertEquals(expectedValue, result);
		
	}
	
	@Test
	void testPeek() {
		for(int i=0;i<3;i++) {
			list.push(i*i+2*2);
		}
		int result= list.peek();
		int expectedValue=4;
		assertEquals(expectedValue, result);
	}
	
	

}
