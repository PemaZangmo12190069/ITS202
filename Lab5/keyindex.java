public class keyindex{
	public void key(int[] a){
		int N = a.length;
		int[] aux = new int[N];
		int R = 256;
		int[] count = new int[R + 1];

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
			System.out.println(" " + a[i]);
		}
	}
	public static void main(String[] args) {
		int[] a = {4,2,6,1,3,5,3,2};
		keyindex obj = new keyindex();
		obj.key(a);

	}
}