public class QuickSort {
public static void main(String[] args) {
		int[] arr = { 2, 3, 1 };
		int len = arr.length;
		QuickSort s = new QuickSort();		
		s.useRecursion(arr, 0, len-1);
		s.printArray(arr);
	}
public int partitionElement(int[] arr, int low, int high) {
		int pivot = arr[high];
		while(low<=high) {
			while(arr[low] < pivot) {
				low++;
			}
			while(arr[high]>pivot) {
				high--;
			}
			if(low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}
  public void useRecursion(int[]arr, int low, int high) {
		int pi = partitionElement(arr,low,high);
		if(pi-1 > low) {
			useRecursion(arr,low,pi-1);
		}
		if(pi < high) {
			useRecursion(arr,pi,high);
		}
	}
	public void printArray(int[] arr) {
		for(int e : arr) {
			System.out.print(e+" ");
		}
	}
}
