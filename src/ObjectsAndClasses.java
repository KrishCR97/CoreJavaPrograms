
public class ObjectsAndClasses {

	int num1 = 2;
	double num2 = 2.0;
	float num3 = 3.0F;

	public void executeAll() {
		System.out.printf("FLoat number is %.4f", num3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectsAndClasses oac = new ObjectsAndClasses();
		oac.executeAll();
		Emplyoee emp = new Emplyoee();
		emp.displayEmployeeDetails();

	}

}
