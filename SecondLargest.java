package week3assignments;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
int[] arr={3, 2, 11, 4, 6, 7};
int len=arr.length;
Arrays.sort(arr);
System.out.println(arr[len-2]);
	}

}
