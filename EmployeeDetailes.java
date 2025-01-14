package guvitask5;

public class EmployeeDetailes {
	
	int emp_id, salary,annualslary,raisesalary;
	String firstname,lastname,name;  
	  
	
	public EmployeeDetailes(int i, String string, String string2, int j) {
		
	}
	public int getEmp_id() {  
	    return emp_id;  
	}  
	public void setEmp_id(int emp_id) {  
	    this.emp_id = emp_id;  
	}  
	public int getSalary() {  
	    return salary;  
	}  
	public void setSalary(int salary) {  
	    this.salary = salary;  
	}  
	public String getFirstname() {  
	    return firstname;  
	}  
	public void setFirstname(String firstname) {  
	    this.firstname = firstname;  
	}  
	public String getLastname() {  
	    return lastname;  
	}  
	public void setLastname(String lastname) {  
	    this.lastname = lastname;  
	}  
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = lastname+firstname;
	}
	public int getAnnualsalary() {  
	    return annualslary;  
	}  
	public void setAnnualslaryt(int annualsalary) {  
	    this.annualslary = annualsalary;  
	}  
	public int getRaisesalary() {
		return raisesalary;
	}
	  public void setRaisesalary(int raisesalary) {
		  this.raisesalary=salary*12;
	  }
		 
		
	}


