public class MethodExercise03{
	public static void main(String[] args){
		Person p = new Person();
		MyTools tools = new MyTools();
		p.name = "jack";
		p.age = 100;
		tools.copyPerson(p);
	}
}
class Person {
	String name;
	int age = 0;
}

class MyTools{//1.��������Ӧ����Person 2.�������β�Ӧ����Person p 
	//3.�����壬����һ���¶��󣬲��������Է��ؼ���
	public Person copyPerson(Person p){
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
	}
}