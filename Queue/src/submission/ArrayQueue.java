package submission;

import adt.Queue;

public class ArrayQueue<T> implements Queue<T> {
	private T[] data;
	private int head, tail;
	
	@Override
	public void enqueue(T newEntry) {
		if (tail == data.length) 
	      data[tail] = newEntry;
	      head++;
	}

	@Override
	public T dequeue() {
		if (isEmpty()) {
			int head = 0;
			tail--;
		}
		for (head = 0; head < tail; head++)
		      data[head] = data[head+1];
		data[tail] = null;     
		return (T) data;
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
		if (tail == 0) {
			return true;
		}
		return false;
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

}
