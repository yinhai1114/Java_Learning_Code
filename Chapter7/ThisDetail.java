public class ThisDetail{
	public static void main(String[] args){
		T tools = new T();
		// tools.f2();

	}
}
class T{
	public T(){
		this(80);//����з��ʹ��������﷨ ������ڵ�һ�����
		System.out.println("T�޲ι�����");
	}
	public T(int age){
		System.out.println("T int age������");
	}
}