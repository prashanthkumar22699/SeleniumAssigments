package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=3553,sum,temp;
temp=num;
for(sum=0;num>0;num/=10) {
	int rem=num%10;
	sum=(sum*10)+rem;
}
if(sum==temp)
	System.out.println("Palindrome Number");
else
	System.out.println("Not Palindrome");
	}

}
