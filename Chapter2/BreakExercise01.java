import java.util.Scanner;
public class BreakExercise01{
	public static void main(String[] args){
		int k = 1;
		String name = "";
		String passWord = "";
		int time = 3;
		Scanner myScanner = new Scanner(System.in);
		for (;k <= time;k++){
			System.out.println("�������û���");
			name = myScanner.next();
			System.out.println("����������");
			passWord = myScanner.next();
			// System.out.println(name + passWord);
			//if(name == "����" && passWord == "666"){//��Ҫʹ��equals����������==�޷��Ƚ�
			//if(name.equals("����") && passWord.equals("666"))//Ҳ�����õڶ���д��
			if("����".equals(name) && "666".equals(passWord)){//�Ƽ�������д�������Ա����ָ��
				System.out.println("�������");
				break;
			}
			else if (k < time) {
				System.out.println("����������������룬�㻹��" + (time - k)+ "�λ���");
			}
			else{
				System.out.println("��֤����������");
			}
		}

	}
}