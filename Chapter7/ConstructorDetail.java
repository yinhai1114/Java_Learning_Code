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
	int age;//Ĭ��0
	//������������һ���������������ֳ�Ϊ����������
	public Person(){
		age = 18;
	}
	public Person(String pName,int pAge){
		age = pAge;
		name = pName;
	}
}