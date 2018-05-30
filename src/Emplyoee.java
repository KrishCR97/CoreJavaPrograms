
public class Emplyoee {
	private int empNumber;
	private String eName;
	private String empType;
	private int empDept;
	private String empPass;

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public int getEmpDept() {
		return empDept;
	}

	public void setEmpDept(int empDept) {
		this.empDept = empDept;
	}

	public String getEmpPass() {
		return empPass;
	}

	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	public void displayEmployeeDetails() {
		System.out.println("Name of he employee is : " + this.empNumber);
		System.out.println("Emplyoee department : " + this.empDept);
	}

}
