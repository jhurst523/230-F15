package submission;

import java.rmi.NoSuchObjectException;

import adt.Queue;

public class LinkedQueue<T> implements Queue<T> 
{
	private Node head, tail;
	int size = 0;
	
	public LinkedQueue()
	{
	head = null;
	tail = null;
	}
	
	@Override
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry, null);
		if (isEmpty())
		head = newNode;
		else
		tail.next(newNode);
		tail = newNode;
	}
	
	public T getFront()
	{
	T front = null;
	if (!isEmpty())
	front = head.data;
	return front;
	}

	@Override
	public T dequeue() {
		T front = null;
		if (!isEmpty())
		{
		front = head.data;
		head = (LinkedQueue<T>.Node) head.data;
		if (head == null)
		tail = null;
		} // end if
		return front;// TODO Auto-generated method stub
	}

	@Override
	public T peek() {
		return null;// TODO Auto-generated method stub
	}

	@Override
	public boolean isEmpty() {
		return (head == null) && (tail == null);
	} // end isEmpty
	public void clear()
	{
	head = null;
	tail = null;// TODO Auto-generated method stub
	}
	
	public String toString() {
		String s = head.data.toString();
		for (Node i = head.next; i != null; i = i.next)
			s += " -> " + i.data;
		s+= "\n";
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

		public void next(LinkedQueue<T>.Node newNode) {
			// TODO Auto-generated method stub
			
		}

		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node

}
