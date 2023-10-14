public class HanoiTower{
	public static void main(String[] args){
		AA tower = new AA();
		tower.move(4,'A','B','C');
	}
}
//有 a b c 三个柱子
//
class AA{
	public void move (int num,char a,char b,char c){
		//如果只有一个盘 num = 1
		if(num == 1)
			System.out.println(a + "->" + c);
		else{
			//如果有多个盘，可以看成两个盘子，最下面和上面的所有盘
			//1 先移动上面的所有盘到b 借助c
			move (num - 1,a,c,b);//此时传入的b = 'C' ，c = 'B'
			//
			//2 把下面这个盘移动到c
			System.out.println(a + "->" + c);
			//再把b塔的所有盘，移动到c，借助a
			move(num - 1,b,a,c);//此时b = 'A', a = 'B', c = 'C',
		}
	}
}