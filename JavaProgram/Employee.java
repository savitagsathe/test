package JavaProgram;

public class Employee {
	private String empName;
	private int empCount;
	private String hq;
	
public Employee(String empName,int empCount,String hq){
	this.empName=empName;
	this.empCount=empCount;
	this.hq=hq;
}
public String getName() {
	return empName;
}

public int getempCount() {
	return empCount;
}
public String getHq() {
	return hq;
}
}
