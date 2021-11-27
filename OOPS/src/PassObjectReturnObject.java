import java.util.Date;
import java.util.Scanner;

class Message {
	private String msg;
	private Date date;
	private String userId;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

class User {
	private String UserID;
	private String pwd;
	private String username;
	private int age;
	private String city;
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

class View {
	void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User ID : ");
		String userId = scanner.next();
		System.out.println("Enter Password : ");
		String pwd = scanner.next();
		DB db = new DB();
//		db.checkLogin(userId, pwd);
	}
	void register() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter User ID : ");
		String userId = scanner.next();
		
		System.out.println("Enter Password : ");
		String pwd = scanner.next();
		
		System.out.println("Enter Name : ");
		String username = scanner.next();
		
		System.out.println("Enter Age : ");
		int age = scanner.nextInt();
		
		System.out.println("Enter City : ");
		String city = scanner.next();
		
		User user = new User();
		user.setUserID(userId);
		user.setUsername(username);
		user.setPwd(pwd);
		user.setCity(city);
		user.setAge(age);
		
		DB db = new DB();
		Message msg = db.checkLogin(user);
		System.out.println(msg.getMsg());
		System.out.println(msg.getUserId());
		System.out.println(msg.getDate());
		
	}
}

class DB {
//	void checkLogin(String userid, String pwd) {
//		String message = "";
//		Date date = null;
//		if(userid.equals(pwd)) {
//			message = "Welcome";
//		}
//		else {
//			message = "Login Failed";
//		}
//		date = new Date();
//	}
	
	
	Message checkLogin(User user) {
		String message = "";
		Message msg = new Message();
		if(user.getUserID().equals(user.getPwd())) {
			message = "Welcome";
		}
		else {
			message = "Login Failed...";
		}
		msg.setMsg(message);
		msg.setDate(new Date());
		msg.setUserId(user.getUserID());
		return msg;
	}
	
}

public class PassObjectReturnObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();
		view.register();
	}

}
