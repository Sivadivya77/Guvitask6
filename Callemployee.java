package guvitask5;

public class Callemployee {

	public static void main(String[] args) {
	
		   // Test constructor and toString()
	      EmployeeDetailes e1 = new EmployeeDetailes (8, "Peter", "Tan", 2500);
	      System.out.println(e1); 

	     
	      e1.setSalary(1000);
	      System.out.println(e1);  
	      e1.setEmp_id(12);
	      System.out.println("id is: " + e1.getEmp_id());
	      e1.setFirstname("siva");
	      System.out.println("firstname is: " + e1.getFirstname());
	      e1.setLastname("Chandran");
	      System.out.println("lastname is: " + e1.getLastname());
	      
	      System.out.println("salary is: " + e1.getSalary());
          e1.setName("Sivachandran");
	      System.out.println("name is: " + e1.getName());
	      e1.setAnnualslaryt(2000);
	      System.out.println("annual salary is: " + e1.getAnnualsalary()); 
          e1.setRaisesalary(300);
	       
          
	      System.out.println(e1.getRaisesalary());
	      System.out.println(e1);
	}

}
/*output
 * id is: 12
firstname is: siva
lastname is: Chandran
salary is: 1000
name is: Chandransiva
annual salary is: 2000
12000*/
