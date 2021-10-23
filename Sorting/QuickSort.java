public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {6 , 3 , 9 , 5 , 2 , 8 , 7};
		quickSort(arr , 0 , arr.length - 1);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void quickSort(int arr[] , int l , int r) {
		if(l < r) {
			int pi = partition(arr , l , r);
			quickSort(arr , l , pi - 1);
			quickSort(arr , pi + 1 , r);
		}
	}
	public static int partition(int[] arr , int l , int r) {
		int pivot = arr[r];
		int i = l - 1;
		for(int j = l ; j < r ; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr , i , j);
			}
		}
		swap(arr , i + 1 , r);
		return i + 1;
	}
	public static void swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
