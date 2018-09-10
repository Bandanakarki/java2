
public class Encapsulation {
	//also called data hiding
	//how to encapsulate : make the data variables private so it cannot be accessed directly from outside the class
	//private data variables
	//helps to improve data security
	private int ssn;
	private  String empname;
	private int empAge;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation emp = new Encapsulation(); 
		emp.setSsn (1234); // the functions are called from below method
		emp.setEmpname ("peter");
		emp.setEmpAge(24);
		
		System.out.println("emplyee name is:"+emp.getEmpname());
		System.out.println("emplyee name is:"+emp.getEmpAge());
		System.out.println("emplyee name is:"+emp.getSsn());
		
	}

	//getter and setter methods- to define private variable use public getter and setter method  
	public int getSsn() {
		return ssn;      //you can define only get to access the data it is not necessary that you define both.
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;// define set method if you dont want to  update the field from outside like ~peter@
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) { //this sanga bhako employee name is from intempname = (empname- bhaneko chai string empname ho jun chai hamile pass gareko ho)
		this.empname = empname;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	

}
