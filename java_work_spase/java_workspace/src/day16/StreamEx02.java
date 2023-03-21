package day16;

import java.util.Arrays;

public class StreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 6, 8, 4, 2, 3, 4, 2, 6, 2, 1, 5, 3, 5, 6, 4, 8, 6 };
		Arrays.stream(arr).filter(c -> c % 2 == 0).forEach(a -> System.out.print(a + " "));
		
		System.out.println();
		int[]arr2 = Arrays.stream(arr).filter(c -> c % 2 == 0).toArray();
		for(int tmp : arr2) {
			System.out.print(tmp+" ");
		}
	}

}
