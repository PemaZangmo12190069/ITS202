public class bubble{
	public static void bubblesort(int[] array){
		int n = array.length;

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
			//n--;
		}
	}
	public static void main(String[] args) {
		int[] arr = {3,13,5,2,17,4,8};
		System.out.println("Unsorted Array");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		System.out.println("Sorted Array");

		bubblesort(arr);
		for (int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}