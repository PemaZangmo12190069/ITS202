public class selection{
	public static void selectionsort(int[] array){
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {11,8,13,3,7,8,4,10,6,5};
		System.out.println("Unsorted Array");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		System.out.println("Sorted Array");

		selectionsort(arr);
		for (int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}