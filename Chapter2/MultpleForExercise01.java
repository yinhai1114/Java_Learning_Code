//
import java.util.Scanner;
public class MultpleForExercise01{
	public static void main(String[] args){
		double count = 0;	
		int passNumber = 0;
		Scanner myScanner = new Scanner(System.in);
		for(int j = 1;j <= 3;j++){
			for(int i = 1;i <= 5;i++){
				System.out.println("�������"+ j +"���༶����" + i 
					+ "��ѧ���ĳɼ�" );
				count = myScanner.nextDouble();
				if(count >= 60.0){
					passNumber++;
				}
			}
    	}
    	System.out.println("��������=" + passNumber);		
	}
}
