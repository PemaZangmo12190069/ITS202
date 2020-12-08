public class StackTest{
	public static void main(String[] args) {
		Stack s = new Stack(9);

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);

		assert(s.size() == 6);
		assert(s.isEmpty() == false);
		assert(s.pop() == 60);
		assert(s.top() == 50);
		System.out.println("All Test Cases Passed!");
	}
}