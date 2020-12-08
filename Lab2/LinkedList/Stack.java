public class Stack{
	int a[];
	int top;
	int size;

	public Stack(int x){
		top = -1;
		a = new int[x];
		size = 0;
	}

	//Returns the number of elements in the stack.
	public int size(){
		return size;
	}

	//Returns a boolean indicating whether the stack is empty or not.
	public boolean isEmpty(){
		if(size == 0 ){
			return true;
		}
		return false;
	}

	//Returns the top element of the stack, without removing it (or null if the stack is empty).
	public int top(){
		if (top == -1) {
			return 0;
		}
		else {
			return a[top];
		}
	}

	//Adds element e to the top of the stack.
	public void push(int n){
		if (size == 0) {
			a[0]= n;
			top = 0;
		}
		else {
			a[top + 1] = n;
			top = top + 1;
		}
		size = size + 1;
	}

	//Removes and returns the top element from the stack(or null if the stack is empty).
	public int pop(){
		if (size == 0) {
			return 0;
		}
		else {
			top = top - 1;
			size = size - 1;
			return a[top+1];
		}
	}
}