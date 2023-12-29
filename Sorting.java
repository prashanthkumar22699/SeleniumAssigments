package week3assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		String[] s={"HCL", "Wipro", "Aspire Systems", "CTS"};
List<String> list=new ArrayList<String>();
for (int i = 0; i < s.length; i++) {
	list.add(s[i]);
	
}
System.out.println(list);
Collections.sort(list);
Collections.reverse(list);

System.out.println("After reverse: "+list);

	}

}
