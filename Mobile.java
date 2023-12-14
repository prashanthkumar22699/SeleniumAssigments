package week1.day1;

public class Mobile {
public void makeCall(String mobilemodel,float mobileWeight) {
	System.out.println("Calling");
}
public void sendMsg(Boolean isFullCharged,int mobileCost) {
	System.out.println("message sent");
}
public static void main(String[] args) {
	Mobile obj=new Mobile();
	obj.makeCall("Oneplus",169.0f);
	obj.sendMsg(true,40000);
	System.out.println("This is my Mobile");
}
}
