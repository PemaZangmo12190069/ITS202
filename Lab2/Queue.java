public class Queue{
	int[] a;
	int rear;
	int len;
	int front;
	int first;

	public Queue(int x){
		len = 0;//1//2//3//4-1//3
		rear = -1;//0//1//2//3
		front = -1;//0//1
		first = -1;//10
		a = new int[x];
	}

	//Returns true if queue Q does not contain any elements.
	public boolean isEmpty(){
		if (len == 0) {
			return true;	
		}
		return false;

	}

	//Return the number of elements in queue Q;
	public int len(){
		return len;
	}

	//Return a reference to the front of the queue Q, without removing it
	public int first(){
		if (isEmpty()) {
			return 0;	
		}
		else
		{
			return a[front];
		}
	}

	//Add element e to the back of the Queue Q.
	public void enqueue(int x){
		if (isEmpty()) {
			a[0] = x;
			front = 0;
			rear = 0;
			first = a[0];
		}
		else
		{
			a[rear + 1] = x;
			rear = rear + 1;
		}
		len = len + 1;
	}

	//Remove and return the first element from queue Q.
	public int dequeue(){
		if (isEmpty()) {
			return 0;
		}
		else
		{
			front = front + 1; 
		}
		len = len - 1;
		return a[front-1];
	}
	public static void main(String[] args) {		
        Queue s = new Queue(10);

        s.enqueue(10);
        s.enqueue(20);
        s.enqueue(30);
        s.enqueue(40);

        assert(s.isEmpty()==false);
        assert(s.len()==4);
        assert(s.first()==10);
        assert(s.dequeue()==10);
        assert(s.len()==3);
	System.out.println("All test cases passed");	
	}

}