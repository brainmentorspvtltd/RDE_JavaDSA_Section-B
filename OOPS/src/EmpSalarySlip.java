import java.text.NumberFormat;
import java.util.Locale;

class Emp {
	private int id;
	private String name;
	private double salary;
	private String email;
	private String phone;
	private String company;
	
	public Emp() {
		this.company = "Brain Mentors";
	}
	
	public Emp(int id, String name, double salary) {
//		will call default constructor
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public void showEmp() {
		CommonUtils utils = new CommonUtils();
		String properName = utils.getProperName(name);
		String formatSalary = utils.getSalaryFormat(salary);
		System.out.println("Company is : " + company);
		System.out.println("Name is : " + properName);
		System.out.println("Salary is : " + formatSalary);
	}
	
}

class CommonUtils {
	public String getProperName(String name) {
		String names[] = name.split(" ");
		String properName = "";
		for(String n : names) {
			properName += String.valueOf(n.charAt(0)).toUpperCase() + 
					n.substring(1).toLowerCase() + " ";
		}
		return properName;
	}
	
	public String getSalaryFormat(double salary) {
		Locale locale = new Locale("en", "IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formatSalary = nf.format(salary);
		return formatSalary;
	}
	
}

public class EmpSalarySlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp obj = new Emp(101,"Ram shaRMA KuMar",45000);
		obj.showEmp();
//		obj.name = "Shyam";
//		System.out.println(obj.name);
//		System.out.println(obj.getName());
		
//		obj.setSalary(50000);
//		System.out.println(obj.getSalary());
		
//		obj.salary -= 10000;
//		System.out.println(obj.salary);
		
//		obj.setSalary(obj.getSalary() - 10000);
//		System.out.println(obj.getSalary());
		
	}

}
