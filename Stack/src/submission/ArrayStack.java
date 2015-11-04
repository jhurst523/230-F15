package submission;

import adt.Stack;

public class ArrayStack<T> implements Stack<T> {
	private T[] data;
	private int top;

	@Override
	public void push(T newEntry) {
		 if (top == data.length) 
	      data[top] = (T) data;
	      top++;// TODO Auto-generated method stub
		
	}

	@Override
	public T pop() {
		if( isEmpty( ) )
        top--;// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		if (isEmpty()){
			return data.length(T);
		}
		// TODO Auto-generated method stu
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
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
	        data = newArray;
	    }

	@Override
	public void push(AnyType newEntry) {
		// TODO Auto-generated method stub
		
	}

}
