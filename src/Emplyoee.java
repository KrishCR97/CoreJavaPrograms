
public class Emplyoee {
	private int empNumber;
	private String eName;
	private String empType;
	private int empDept;
	private String empPass;

	public Emplyoee() {
		
	}

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
	// Copy constructor

	public Emplyoee(Emplyoee otherEmployee) {
		this.empNumber = otherEmployee.empNumber;
		this.eName = otherEmployee.eName;
		this.empType = otherEmployee.empType;
		this.empDept = otherEmployee.empDept;
		this.empPass = otherEmployee.empPass;
	}

	public Emplyoee(int empNumber, String eName, String empType, int empDept, String empPass) {
		super();
		this.empNumber = empNumber;
		this.eName = eName;
		this.empType = empType;
		this.empDept = empDept;
		this.empPass = empPass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.getEmpNumber() == ((Emplyoee) obj).getEmpNumber();
	}

}
