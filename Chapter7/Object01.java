import java.util.Scanner;
public class Object01{
	public static void main(String[] args){
		//ʹ��OOP ������������
		//ʵ����һֻè
		Cat cat1 = new Cat();//������è���󸳸�cat1
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";
		cat1.weight = 10.0;

		Cat cat2 = new Cat();//�����ڶ�ֻè����cat2
		cat2.name = "С��";
		cat2.age = 100;
		cat2.color = "��ɫ";
		cat2.weight = 500.0;
		//����cat1����һ������cat2Ҳ��һ������

		//��ôʹ��/��ô����
		System.out.println("��һֻè����Ϣ" + cat1.name + " " + cat1.age
			+ " " + cat1.color + " " + cat1.weight);
		System.out.println("�ڶ�ֻè����Ϣ" + cat2.name + " " + cat2.age
			+ " " + cat2.color + " " + cat2.weight);
		
	}
}
//����һ��è�� һ���Զ������������
//ʹ��������������
class Cat{
	// ����/����
	String name;
	int age;
	String color; 
	//���������Ӷ�������Ծͺܷ���
	double weight;
	//��Ϊ
}

