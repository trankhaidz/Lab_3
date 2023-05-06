package Lab4_bt;

class Person{
	String name,gender;
	int age;
	
	public Person(String name,int age,String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Name :"+name+"\n"
				+"Age :"+age+"\n"
				+"Gender :"+gender;
	}
}

class Employee extends Person{
	String employerName;
	String dateHired;
	
	public Employee(String name,int age,String gender,String employerName,String dateHired) {
		super(name,age,gender);
		this.employerName=employerName;
		this.dateHired=dateHired;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	public String toString() {
		return super.toString()+"\n"
				+"Employer Name: "+employerName+"\n"
				+"Date Hired: "+dateHired;
	}
	
}

class PartTimeEmployee extends Employee{
	int hoursPerWeek;
	
	public PartTimeEmployee(String name,int age,String gender,String employerName,String dateHired,int  hoursPerWeek) {
		super(name,age,gender,employerName,dateHired);
		this.hoursPerWeek= hoursPerWeek;
	}
	
	public int gethoursPerWeek() {
		return hoursPerWeek;
	}
	public void sethoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek= hoursPerWeek;
	}
	
	public String toString() {
		return super.toString()+"\n"
				+"HoursPerWeek: "+hoursPerWeek;
	}
}
public class Bai3_Test {

	public static void main(String[] args) {
		PartTimeEmployee employer1=new PartTimeEmployee("Nguyen Quang Minh",20,"Nam","Tran Quang Khai","12/12/2023",12);
		System.out.println(employer1.toString());
	
	}

}
