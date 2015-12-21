package submission;

import java.util.Arrays;

import adt.Stack;

public class ArrayStack<T> implements Stack<T> {
	private T[] data; // array of stack entries
	private int top; // index of top entry
	
	private static final int DEFAULT_INITIAL_CAPACITY = 50;

	
	public ArrayStack()
	{
	this(DEFAULT_INITIAL_CAPACITY);
	}
	
	public ArrayStack(int initialCapacity) {
		@SuppressWarnings("unchecked")
		T[] tempStack = (T[])new Object[initialCapacity];
		data = tempStack;
		top = -1;// TODO Auto-generated constructor stub
	}

	@Override
	public void push(T newEntry) {
		ensureCapacity();
		top++;
		data[top] = newEntry;// TODO Auto-generated method stub
		
	}
	private void ensureCapacity()
	{
	if (top == data.length - 1) // if array is full,
	// double size of array
	data = Arrays.copyOf(data, 2 * data.length);
	}

	@Override
	public T pop() {
		T topp = null;
		if (!isEmpty())
		{
		topp = data[top];
		data[top] = null;
		top--;
		} // end if
		return topp;
	}

	@Override
	public T peek() {
		T topp = null;
		if (!isEmpty())
		topp = data[top];
		return topp;
		// TODO Auto-generated method stu
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top < 0;
	}
	
	@Override
	public void clear() {
		if (!isEmpty()) {
			top--;
		}
	}
	
	public String toString() {
		String s = "";
		for (int i = top; i >= 0; i--)
			s += "| " + data[i] + " |\n";
		s+= "+++++\n";
		return s;
	}
	
	 private void doubleArray( )
	    {
	        Object [ ] newArray;

	        newArray = new Object[ data.length * 2 ];
	        for( int i = 0; i < data.length; i++ )
	            newArray[ i ] = data[ i ];
	        data = (T[]) newArray;
	    }

}
