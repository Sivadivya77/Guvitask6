package guvitask5;

public class Personq1 {
	private int age;
	private String name;
	
	public void setage(int r) {
		age=r;
		System.out.println("Age number is set");
	}
	public int getage() {
		System.out.println("age number is read");
		return age;
	}
	 public void setname(String name) {
		 this.name=name;
		 
		 System.out.println("Name the is set");
	 }
	public String getname() {
		System.out.println("Name the is read");
		return name;
	}
	public static void main(String[] args) {
		 Personq1 obj1= new Personq1();
		 obj1.setage(29);
		 System.out.println(obj1.getage());
		 
		 Personq1 obj2= new Personq1();
		 obj2.setname("siva");
		 System.out.println( obj2.getname());
		 

	}
}
/*output
 * age number is read
29
Name the is reads
siva*/
