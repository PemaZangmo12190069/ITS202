public class keyindexcount{
	public void key(char[] a) {
		int N = a.length;
		char[] aux = new char[N];
		int R = 256;
		int[] count = new int[R + 1];//int data type as it will take the ASCII value

		//To compute the frequency
		for (int i = 0; i < N; i++) {
			count [a[i]+ 1]++;
		}

		//Transform the count to indices
		for (int r = 0; r < R; r++) {
			count[r + 1] += count [r];
		}

		//Distribute the data
		for (int i = 0; i < N; i++) {
			aux[count[a[i]]++] = a[i];
		}

		//Copy Back
		for (int i = 0; i < N; i++) {
			a[i] = aux[i];
		}

		for (int i = 0; i < N; i++) {
			System.out.println(" " + a[i]);		}

	}
	public static void main(String[] args) {
		char[] a = {'a','f','e','k','a'};
		keyindexcount obj = new keyindexcount();
		obj.key(a);
	}
		
}