public class ConstructorDetail{
	public static void main(String[] args){
		Person p1 = new Person();
		Person p2 = new Person("Tom",99);
		System.out.println(p1.name + p1.age);
		System.out.println(p2.name + p2.age);
	}
}

class Person{
	String name;
	int age;//默认0
	//构造器本质是一个方法，以下两种称为方法的重载
	public Person(){
		age = 18;
	}
	public Person(String pName,int pAge){
		age = pAge;
		name = pName;
	}
}