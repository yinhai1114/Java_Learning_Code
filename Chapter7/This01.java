public class This01{
	public static void main(String[] args){
		Person p1 = new Person("TOM",15);
		p1.info();
	}
}

class Person{
	String name;
	int age;
	// public Person(String pName,int pAge){
	// 	age = pAge;
	// 	name = pName;
	// }
	// 如果构造器的形参能够写成属性名就更好了
	// 但是根据变量作用域的就近原则，现在age和name指的都是形式参数name age
	// 都是自己的
	// 引出This关键字
	public Person(String name,int age){
		age = age;
		name = name;
	}
	public void info(){
		System.out.println(name + age);
	}
}