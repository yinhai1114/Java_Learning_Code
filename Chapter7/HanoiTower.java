public class HanoiTower{
	public static void main(String[] args){
		AA tower = new AA();
		tower.move(4,'A','B','C');
	}
}
//�� a b c ��������
//
class AA{
	public void move (int num,char a,char b,char c){
		//���ֻ��һ���� num = 1
		if(num == 1)
			System.out.println(a + "->" + c);
		else{
			//����ж���̣����Կ����������ӣ�������������������
			//1 ���ƶ�����������̵�b ����c
			move (num - 1,a,c,b);//��ʱ�����b = 'C' ��c = 'B'
			//
			//2 ������������ƶ���c
			System.out.println(a + "->" + c);
			//�ٰ�b���������̣��ƶ���c������a
			move(num - 1,b,a,c);//��ʱb = 'A', a = 'B', c = 'C',
		}
	}
}