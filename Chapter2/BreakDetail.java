public class BreakDetail{
	public static void main(String[] args){
		label1:
		for(int j = 0;j < 4;j++){
			label2:
			for(int i = 0;i < 10;i++){
				if(i == 2){
					// break;
					//Ĭ�����������ѭ���壬����label2�����������ѭ��
					//��Ȼ��ִ�У�����j= 0 i= 0 1 ���ظ��ص�j = 1 i = 0 1
					//ֱ��j = 3
					break label1;//������label1ѭ���壬��ֻ���0 1
				}
				System.out.println("i=" + i);
			}	
		}
	}
}