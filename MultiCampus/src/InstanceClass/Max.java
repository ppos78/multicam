package InstanceClass;

public class Max {
	public static void main(String[] arg) {
		int[] arr = { 5, 2, 3, 4, 1, 6 };

		for (int val : arr)
			System.out.print(val + " ");
		System.out.println();
		
		
		for( int j = 0; j < arr.length; j++){
			int maxIndex = j;
			int max = arr[j];
			
			for (int i = j; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
					maxIndex = i;
				}
			}
			int tmp = arr[maxIndex];
			arr[maxIndex] = arr[j];
			arr[j] = tmp;
			
		}
		

	}
}
