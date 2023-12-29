package week3assignments;

public class LoginPage extends TestData{
public void enterUsername() {
	// TODO Auto-generated method stub
System.out.println("Username entered");
}
private void enterPassword() {
	// TODO Auto-generated method stub
System.out.println("Password entered");
}
	public static void main(String[] args) {
		LoginPage l=new LoginPage();
		l.enterCredentials();
		l.navigateToHomePage();
		l.enterUsername();
		l.enterPassword();

	}

}
