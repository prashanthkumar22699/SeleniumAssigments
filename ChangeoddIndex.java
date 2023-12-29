package week3assignments;

public class ChangeoddIndex {

	public static void main(String[] args) {
		String s="Leodass";
		int len = s.length();
		for (int i = 0 ; i < len; i++) {
			char ch = s.charAt(i);
			if (i % 2 == 0) {
				System.out.print(Character.toLowerCase(ch));
			} else {
				System.out.print(Character.toUpperCase(ch));
			}
		}
	}

}
