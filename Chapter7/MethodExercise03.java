public class MethodExercise03{
	public static void main(String[] args){
		Person p = new Person();
		MyTools tools = new MyTools();
		p.name = "jack";
		p.age = 100;
		Person p2 = tools.copyPerson(p); 
		//��������Person p2������Ҫ�����¿ռ䣬�����p2��Mytools��p2��һ��
		// p.name = "tom";//��֤�Ƿ��Ƕ�������
		//Ҳ����ʹ��==�жϵ�ַ�Ƿ���ͬ
		System.out.println(p.name + p.age);
		System.out.println(p2.name + p2.age);
		System.out.println(p == p);//true ��ͬһ����ַ����һ��
		System.out.println(p == p2);//false ����ͬһ����ַ���Բ�һ��
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
		p2.name = p.name;//���Եĸ���
		p2.age = p.age;//���Եĸ���
		return p2;//����p2
	}
}