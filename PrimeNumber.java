package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=72;
		boolean f=false;
		for (int i = 2; i < n/2; i++) {
			if(n%i==0) {
				System.out.println("Not a Prime Number");
				f=true;
				break;	
			}
		}if(f==false)
			System.out.println("Prime Number");
	}
}
