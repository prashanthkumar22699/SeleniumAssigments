package week3assignments;

public class JavaConnection extends MySqlConnection{

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to DB");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected from DB");
	}

	public void executeUpdates() {
		// TODO Auto-generated method stub
		System.out.println("Updated successfully");
	}
public static void main(String[] args) {
	DatabaseConnection db=new JavaConnection();
	db.connect();
	db.disconnect();
	db.executeUpdates();
	JavaConnection jc=new JavaConnection();
	jc.executeQuery();
}
}
