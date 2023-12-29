package week3assignments;

public class APIClass {
public void sendRequest(String endpoint) {
	System.out.println(endpoint+ " of API Class");

}
public void sendRequest(String endpoint,String requestBody,String requestStatus) {
	// TODO Auto-generated method stub
System.out.println(endpoint+" "+requestBody+" "+requestStatus);
}
public static void main(String[] args) {
	APIClass a=new APIClass();
	a.sendRequest("First");
	a.sendRequest("Second", "Google", "Called");
}
}
