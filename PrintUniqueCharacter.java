package week3assignments;

public class PrintUniqueCharacter {
public static void main(String[] args) {
String s="Prashanth";
for (int i = 0; i < s.length(); i++) {
	int flag=0;
	for (int j = 0; j < s.length(); j++) {
		if(s.charAt(i)==s.charAt(j) && i!=j) {
			flag=1;
			break;
		}
	}
	if(flag==0)
		System.out.println(s.charAt(i));
}
	}

}
