public class Method01{
	public static void main(String[] args){
		//����ʹ�� �ȴ������� Ȼ����÷������� 
		Person p1 = new Person();
		p1.speak();//���÷��� ����ִ�е������ȥperson������speak����
		p1.col01;
	}
}
class Person{
	String name;
	int age;
	//public ��ʾ�ǹ�����  void��ʾ����û�з���ֵ 
	//speak() ��ʾ������ ()��ʾ�β��б�
	//{}�����壬����д����Ҫִ�еĴ���
	//System.out...��ʾ�������ݣ����һ�仰
	//����д�ú󣬲�ȥ���ò���������
	public void speak(){//һ����������û�з���ֵ
		System.out.println("����һ������");
	}
	public void cal01(){//�����1+...+1000
		int sum = 0;
		for(int i = 1; i <= 1000 ;i++){
			sum += i;
		}
		System.out.println(sum);
	}
}