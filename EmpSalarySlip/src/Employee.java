public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String email;
	private String phone;
	private String company;
//	10% of salary
//	Earnings
	private double hra = 25.0;
	private double da = 5.0;
	private double ta = 18.0;
	private double ma = 15.0;
	
//	Deductions
	private double pf = 10.0;
	private double tds = 10.0;
	
	public Employee() {
		this.company = "Brain Mentors";
	}
	
	public Employee(int id, String name, double salary) {
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
	
	public String showEmp() {
		CommonUtils utils = new CommonUtils();
		String properName = utils.getProperName(name);
		String formatSalary = utils.getSalaryFormat(salary);
		return "Company : " + company + "\nName : " + properName + "\nSalary : " + formatSalary; 
	}

}
