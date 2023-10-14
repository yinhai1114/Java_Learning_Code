public class Constructor01{
	public static void main(String[] args){
		Person p1 = new Person("smith",80);
		System.out.println(p1.name + p1.age);

	}
}
class Person{
	String name;
	int age;
	//构造器没有返回值 也没有void
	//构造器的名字和类名字一样Person
	//String pName int pAge 是构造器的形式参数列表，规则和成员方法一样
	public Person(String pName,int pAge){
		System.out.println("构造器被调用");
		name = pName;
		age = pAge;
	}
}