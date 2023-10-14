public class Homework12{
	public static void main(String[] args){
		Employee wang = new Employee("wang","man",18,"Engineer",5000);
		Employee chen = new Employee("chen","women",50);
		Employee lin = new Employee("Engineer",9000);
	}
}
class Employee{
	String name;
	String gender;
	int age;
	String position;
	double salary;
	public Employee(String name,String gender,
		int age,String position,double salary){
		this(name,gender,age);
		this.position = position;
		this.salary = salary;
	}
	public Employee(String name,String gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employee(String position,double salary){
		this.position = position;
		this.salary = salary;
	}
}