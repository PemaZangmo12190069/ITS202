public class QueueTest{
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