
public class Employee implements Comparable<Employee>{
	private String empNumber;
	private String name;
	public Employee() {
		super();
	}
	public Employee(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	public String getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empNumber == null) ? 0 : empNumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		System.out.println("From Equals");
		Employee emp=(Employee)obj;
		
		if(name.equals(emp.getName()))
		{
			return true;
		
	}​​​​
	
	return true;
	}​​​​
	return false;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
