package submission;

import javax.xml.soap.Node;

import adt.Queue;

public class ArrayQueue<T> implements Queue<T> {
	private T[] data;
	private int head, tail;
	private static final int DEFAULT_INITIAL_CAPACITY = 50;
	
	public ArrayQueue()
	{
	this(DEFAULT_INITIAL_CAPACITY);
	}
	
	public ArrayQueue(int defaultInitialCapacity) {
		@SuppressWarnings("unchecked")
		T[] tempQueue = (T[]) new Object[defaultInitialCapacity + 1];
		data = tempQueue;
		tail = 0;
		tail = defaultInitialCapacity;// TODO Auto-generated constructor stub
	}
	public T getFront()
	{
	T front = null;
	if (!isEmpty())
		front = data[head];
		return front;
	}
	
	
	@Override
	public void enqueue(T newEntry) {
		ensureCapacity();
		tail = (tail + 1) % data.length;
		data[tail] = newEntry;
	}

	@Override
	public T dequeue() {
		T front = null;
		if (!isEmpty())
		{
		front = data[head];
		data[head] = null;
		head = (head + 1) % data.length;
		}
		return front;
	}

	@Override
	public T peek() {
		if (isEmpty())
		return data[0];
		else
		return null;
	}

	@Override
	public boolean isEmpty() {
		return head == ((tail + 1) % data.length);
	}

	@Override
	public void clear() {
		for(int i = 0; i < tail; i++) 
			data[i] = null;

		tail = -1; head = 0;
		
	}
	
	public String toString() {
		String s = "";
		if (!isEmpty())
			s = data[head].toString();
		for (int i =  (head+1) % data.length; 
				 i <= (tail + data.length) % data.length; 
				 i =  (i + 1) % data.length)
			s += " -> " + data[i];
		s+= "\n";
		return s;
	}
	private void ensureCapacity()
	{
	if (head == ((tail + 2) % data.length)) // if array is full,
	{ // double size of array
	T[] oldQueue = data;
	int oldSize = oldQueue.length;
	// the cast is safe because the new array contains null entries
	@SuppressWarnings("unchecked")
	T[] tempQueue = (T[]) new Object[2 * oldSize];
	data = tempQueue;
	for (int index = 0; index < oldSize - 1; index++)
	{
	data[index] = oldQueue[head];
	head = (head + 1) % oldSize;
	} // end for
	head = 0;
	tail = oldSize - 2;
	} // end if
	}

}
