public class Constructor01{
	public static void main(String[] args){
		Person p1 = new Person("smith",80);
		System.out.println(p1.name + p1.age);

	}
}
class Person{
	String name;
	int age;
	//������û�з���ֵ Ҳû��void
	//�����������ֺ�������һ��Person
	//String pName int pAge �ǹ���������ʽ�����б�����ͳ�Ա����һ��
	public Person(String pName,int pAge){
		System.out.println("������������");
		name = pName;
		age = pAge;
	}
}