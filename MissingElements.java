package week3assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
int[] a={1, 2, 3, 4, 10, 6, 8};
Arrays.sort(a);
List<Integer> list=new ArrayList<Integer>();
for (int i = 0; i < a.length; i++) {
	if((a[i]+1)!=a[i+1]) {
		list.add(i+1);
		break;
	}
}
System.out.println("the next element after "+list.get(0)+" is missing");
	}

}
