public class binarysearch{
	public static int binarysearch(int[] array, int first, int last, int element){
		if(first <= last){
			int mid = (first+last)/2;
			if(array[mid] == element){
				return mid;
			}
			else if(array[mid] > element){
				return binarysearch(array, first, mid-1, element);
			}
			else{
				return binarysearch(array, mid+1, last, element);
			}
		}
		return 0;
	}

	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int N = array.length;
		int element = 5;
		int ele_found = binarysearch(array, 0, N-1, element);

		if(ele_found == 0){
			System.out.println("Element not found!");
		}
		else{
			System.out.println("Element is found at index: " +ele_found);
		}

	}
}