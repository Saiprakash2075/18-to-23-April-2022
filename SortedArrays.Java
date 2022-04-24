import java.util.Arrays;

      public class MegeTwoArrays {
      public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 5};
		int[] arr2 = { 2, 4, 6, 8};
		
		mergeArrays(arr1, arr2);
}
private static void mergeArrays(int[] arr1, int[] arr2) {
		int k = 0;
		int[] result = new int[arr1.length+arr2.length];
		for(int i=0; i<arr1.length; i++) {
			result[k] = arr1[i];
			k++;
		}
		for(int i=0; i<arr2.length; i++) {
			result[k] = arr2[i];
			k++;
		}
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
		
	}
}
