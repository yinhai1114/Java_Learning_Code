import java.util.Scanner;
public class Homework15{
	public static void main(String[] args){
		A tom = new A();
		Scanner myScanner = new Scanner(System.in);
		while(true){
			System.out.println("����0 1 2 �����ֱ����ʯͷ ���� ��"
				 + "����3��ӡ��ʷ��¼ ��������������Ϸ");
			int enter = myScanner.nextInt();
			if(enter > 3){
				break;
			}else if (enter == 3){
				tom.printList();
				

			}else{
				tom.guessingGame(enter);
			}
		}
	}
}
class A{
	int times;
	int win;
	int lose;
	String[] list;

	public void printList(){
		System.out.println("============�Ծֽ��===========");
		System.out.println("����\t" + "�û�\t" + "����\t" + "���\t");
		for(int i = 0;i < list.length;i++){
			System.out.print(list[i] + "\t");
			if((i + 1) % 4 == 0){
				System.out.println();
			}
		}
		System.out.println("�ܼ�");
		System.out.println("Ӯ��\t" + win + "��");
		System.out.println("����\t" + lose + "��");
		System.out.println("==============================");
	}

	public void historyRecord(String n,String n1,String res){
		String[] arr = new String[times * 4];//���� ���ڴ���*3
		if(times > 1){
			for(int i = 0;i < list.length ;i++){
				arr[i] = list[i];
			}
		}
		arr[arr.length - 1] = res;
		arr[arr.length - 2] = n1;
		arr[arr.length - 3] = n;
		String times = this.times + "";
		arr[arr.length - 4] = times;

		list = arr;
	}

	public boolean judgeWinOrLose(int n,int num){
		if(n == 2 && num ==0){
			return true;
		}else if((n == 0 && num == 1)){
			return true;
		}else if ((n == 1 && num ==2)){
			return true;
		}else{
			return false;
		}
	}

	public void guessingGame(int n){
		times++;

		int num =(int)(Math.random() * 3.0);
		System.out.print("\n���" + n );
		System.out.print("\t���Գ�" + num + "\t");
		String res = "";
		boolean juede = judgeWinOrLose(n,num);

		if(n == num){
			res = "ƽ��";
			System.out.println("\t" + res + "\n");
		}else{
			if(juede){
				res = "��Ӯ��";
				System.out.println("\t" + res + "\n");
				win++;
			}
			if(!juede){
				res = "������";
				System.out.println("\t" + res + "\n");
				lose++;
			}
		}
		String n1 = n + "";
		String num1 = num + "";
		historyRecord(n1,num1,res);
	}
}