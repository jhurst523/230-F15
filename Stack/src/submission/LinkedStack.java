package submission;

import adt.Stack;

public class LinkedStack<T> implements Stack<T> {
	private Node top;
	private int n;
	
	public LinkedStack()
	{
	top = null;
	}
	
	@Override
	public void push(T newEntry) {
		// TODO Auto-generated method
		Node newNode = new Node(newEntry, top);
		top = newNode;
	}

	@Override
	public T pop() {
		T topp = peek();
		if (top != null)
		top = top.next;
		return topp;
	}

	@Override
	public T peek() {
		T topp = null;
		if (top != null)
			topp = top.data;
			return topp;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void clear() {
		top = null;
	}
	
	public String toString() {
		String s = "";
		for (Node n = top; n != null; n = n.next)
			s += "| " + n.data + " |\n";
		s+= "+++++\n";
		return s;
	}
	
	private class Node 
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor

		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node

}
