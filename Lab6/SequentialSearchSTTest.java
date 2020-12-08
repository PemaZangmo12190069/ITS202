public class SequentialSearchSTTest{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> obj = new SequentialSearchST<String, Integer>();
		obj.put("a",1);
		obj.put("b",2);
		obj.put("c",3);
		obj.put("d",4);
		obj.put("f",6);
		obj.put("f",8);
		obj.put("g",9);
		obj.delete("b");
		
		System.out.println(obj.keys());

		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		System.out.println(obj.contains("f"));
		System.out.println(obj.get("a"));

		assert(obj.isEmpty() == false);
		assert(obj.size() == 5);
		assert(obj.contains("f") == true);
		assert(obj.get("a") == 1);
		System.out.println("All Test Cases Passed");
		
	}
}